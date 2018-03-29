/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639_jdbc.Controller;

import java.io.InputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import pkg1512639_jdbc.Define.Define;
import pkg1512639_jdbc.Model.Student;

/**
 *
 * @author phamanhtuan
 */
public class StudentsManagerment {
    
    public  List<Student> listStudents;
    
    public StudentsManagerment(){
        this.listStudents = new ArrayList<>();
    }
    
    public StudentsManagerment(List<Student> _listStudents){
        this.listStudents = _listStudents;
    }
    
    public void createListStudentsFromDatabase(){
        Driver driver = new Driver(Define.DatabaseInfor.SERVER_NAME, 
                                       Define.DatabaseInfor.DATABASE_NAME,
                                       Define.DatabaseInfor.DATABASE_PORT_NUMBER,
                                       Define.DatabaseInfor.DATABASE_USER_NAME, 
                                       Define.DatabaseInfor.DATABASE_PASSWORD);
        listStudents = driver.getListStudentsFromDatabase();
    }
    
    
    public void insertStudent(Student student){
        if(!isContaintStudentID(student.getId())){
            listStudents.add(student);
        }
    }
    
    public void insertStudent(int ID,String name,Date birthday,String note,InputStream avartar){
        if(!isContaintStudentID(ID)){
            Student student = new Student(ID, name, birthday, note, avartar);
            listStudents.add(student);
        }
    }
    
    private boolean isContaintStudentID(int studentID){
        
        int numberStudents = listStudents.size();
        for(int studentIndex = 0; studentIndex < numberStudents; studentIndex++){
            if(listStudents.get(studentIndex).getId() == studentID){
                return true;
            }
        }
        return  false;
    }
}
