/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639_jdbc.Controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import pkg1512639_jdbc.Define.Define;
import pkg1512639_jdbc.Model.Student;

/**
 *
 * @author phamanhtuan
 */
public class Driver {
    //variables
    public Connection myConnection = null;
    
    private static Driver instance;
    
    //Constructor
    public Driver(String _serverName,String _databaseName,String _databasePortNumber,String _databaseUsername,String _databasePassword){
        myConnection = getConnectionDatabase(_serverName, _databaseName, _databasePortNumber, _databaseUsername, _databasePassword);
    }
    //End of function-----------------------------------------------------------
    
    //Get connection from database----------------------------------------------
    private Connection getConnectionDatabase(String serverName,String databaseName, String databasePortNumber,String databaseUsername,String databasePassword){
        
        Connection connection = null;

        try {
            
            String driverName = "org.gjt.mm.mysql.Driver"; // MySQL MM JDBC driver
            Class.forName(driverName);
            
            String url = "jdbc:mysql://"+serverName+ ":"+databasePortNumber+"/"+databaseName+"?useUnicode=yes&characterEncoding=UTF-8";
            connection = DriverManager.getConnection(url);
                 
        }
        catch (ClassNotFoundException ex) {Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);} 
        catch (SQLException ex) {Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);}
        
        return connection;
    }
    //End of function-----------------------------------------------------------

    public Connection getMyConnection() {
        return myConnection;
    }

    public void setMyConnection(Connection myConnection) {
        this.myConnection = myConnection;
    }

    public static Driver getInstance() {
        if(instance == null){
            instance = new Driver(Define.DatabaseInfor.SERVER_NAME,
                                  Define.DatabaseInfor.DATABASE_NAME, 
                                  Define.DatabaseInfor.DATABASE_PORT_NUMBER,
                                  Define.DatabaseInfor.DATABASE_USER_NAME,
                                  Define.DatabaseInfor.DATABASE_PASSWORD);     
        }
        return instance;
    }

    public static void setInstance(Driver instance) {
        Driver.instance = instance;
    }
    
 

    
    //Function insert a student infor tot database------------------------------
    public void insertAStudent(Student student){
        try {
            String insertQuery = Define.SQLQuery.INSERT_INTO_STUDENT_INFOR_TABLE;
            
            PreparedStatement preparedStatement = myConnection.prepareStatement(insertQuery);
            
            preparedStatement.setInt(1,student.getId());
            preparedStatement.setString(2,student.getName());
            preparedStatement.setDate(3, student.getBirthday());
            preparedStatement.setString(4, student.getNote());
            preparedStatement.setBlob(5, student.getAvartar());
            
            preparedStatement.executeUpdate();
        } 
        catch (SQLException ex) {Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);}
        
    }
    //End of function-----------------------------------------------------------
    
    
    public BufferedImage getStudentAvartarByID(int studentID){
        
        BufferedImage avartar = null;
        try {
            String query = Define.SQLQuery.GET_STUDNET_AVART_BY_ID;
            PreparedStatement ps = myConnection.prepareStatement(query);
            ps.setInt(1, studentID);
            
            ResultSet res = ps.executeQuery();
            res.next();
            InputStream subavartar = res.getBinaryStream(Define.StudentTableAttribute.AVARTAR);
            if(subavartar != null){
                avartar = ImageIO.read(subavartar);
            }
            
        } catch (SQLException | IOException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return  avartar;
    }
    public List<Student> getListStudentsFromDatabase(){
        
        List<Student> listStudents = new ArrayList<>();
        try {
            
            String selectStudentTable =  Define.SQLQuery.SELECT_STUDENT_INFOR_TABLE;
            PreparedStatement preparedStatement = myConnection.prepareStatement(selectStudentTable);
            
            ResultSet resSet = preparedStatement.executeQuery();
            while(resSet.next()){
                
                int studentID              = resSet.getInt(Define.StudentTableAttribute.ID);
                String studentName         = resSet.getString(Define.StudentTableAttribute.NAME);
                Date studentBirthday       = resSet.getDate(Define.StudentTableAttribute.BIRTHDAY);
                String stduentNode         = resSet.getString(Define.StudentTableAttribute.NOTE);
                InputStream studentAvartar = resSet.getBinaryStream(Define.StudentTableAttribute.AVARTAR);
                
                Student student = new Student(studentID, studentName, studentBirthday, stduentNode, studentAvartar);
                listStudents.add(student);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return  listStudents;
    }
    //Function update student infor by ID | name | birthday | ------------------
    public void updateStudentInforBy(){
    
    }
    //End of function-----------------------------------------------------------

    public void updateStudentAvartarByID(InputStream newAvarar, int studentID){
        try {
            
            String query  = Define.SQLQuery.UPDATE_STUENT_AVARTAR_BY_ID;
            PreparedStatement ps = myConnection.prepareStatement(query);
            
            ps.setBlob(1, newAvarar);
            ps.setInt(2, studentID);
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateStudentNameByID(String studentName,int studentID){
        try {
            String query = Define.SQLQuery.UPDATE_STUDENT_NAME_BY_ID;
            PreparedStatement ps = myConnection.prepareStatement(query);
            
            ps.setString(1, studentName);
            ps.setInt(2, studentID);
            
            ps.executeUpdate();
        }
        catch (SQLException ex) { Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);}
    }
    
    public void updateStudentNoteByID(String studentNode, int studentID){
        try {
            String query = Define.SQLQuery.UPDATE_STUDNET_NOTE_BY_ID;
            PreparedStatement ps = myConnection.prepareStatement(query);
            
            ps.setString(1, studentNode);
            ps.setInt(2, studentID);
            
            ps.executeUpdate();
        } 
        catch (SQLException ex) { Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex); }
                
    }
    
    public void updateStudentBirthdayByID(Date studentBirthday, int studentID){
        try {
            String query = Define.SQLQuery.UPDATE_STUDENT_BIRTHDAY_BY_ID;
            PreparedStatement ps = myConnection.prepareStatement(query);
            
            ps.setDate(1, studentBirthday);
            ps.setInt(2, studentID);
            
            ps.executeUpdate();
        } 
        catch (SQLException ex) {Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);}
        
    }
}
