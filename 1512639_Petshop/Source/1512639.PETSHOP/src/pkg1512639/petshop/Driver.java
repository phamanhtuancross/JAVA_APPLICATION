/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639.petshop;
import  java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author phamanhtuan
 */
public class Driver {
    
    
    public static Driver instance;
    private Statement driverStatement;
    
    //Getters  and setters
    public static Driver getInstance() {
        if(instance == null){
            instance = new Driver();
        }
        return instance;
    }
  
    public static void setInstance(Driver instance) {
        Driver.instance = instance;
    }
    //end of setters and setters
    
    public Driver(){
        List<String> databaseInfors = FileIO.ReadFile();
        
        String databaseName = databaseInfors.get(0);
        String databasePort = databaseInfors.get(1);
        String databaseUsername = databaseInfors.get(2);
        String databasePassword = databaseInfors.get(3);
        
        driverStatement = ConectionToSQLByName(databaseName, databasePort, databaseUsername, databasePassword);
    }
    
    public Statement ConectionToSQLByName(String databaseName,String databasePort,String databaseUserName,String databasePassword){
        
        Statement myStatement = null;
        try{
            //1.Get a connection to database
            List<String> databaseInfors = FileIO.ReadFile();
           
            
            String URL =  "jdbc:mysql://localhost:"+databasePort+"/"+databaseName;
            Connection myConnection = DriverManager.getConnection(URL,databaseUserName,databasePassword);
            
            //2.Create a staments
            myStatement = myConnection.createStatement();
        }
        catch(SQLException exc){}

        return myStatement;
    }
    
    private String SelectTable(String tableName){
        return QueryDefine.SELECT_TABLE + tableName;
    }
    
    private String GetEmailTable(String userEmail){
        return SqlProcedureDefine.GetEmailTable(userEmail);
    }
    
    private String GetUsernameTable(String username){
        return SqlProcedureDefine.GetUsernameTable(username);
    }
    
    private String CreateUserAccountSQL(String email,String username, String password){
        return SqlProcedureDefine.CreateUserAccount(email, username, password);
    }
    
    public boolean CheckAcount(String userName, String password){    
        boolean isExistAcount = false;
        try {
            String selectTableQuery =  SelectTable(TableNameDefine.USER_ACCOUNT_TABLE);
            ResultSet  myResultSet = driverStatement.executeQuery(selectTableQuery);
            
            while (myResultSet.next()) {                
                String usernameAccount = myResultSet.getString(TableAtribute.USERNAME);
                String passwordAccount = myResultSet.getString(TableAtribute.PASSWORD);
                
                if(usernameAccount.equals(userName) && passwordAccount.equals(password)){
                    isExistAcount = true;
                    break;
                }
            }
                    
        } 
        catch (SQLException ex) {Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);}
        
        return isExistAcount;
    }
    
    public boolean CreateAccount(String email, String username, String password){
        boolean isCreateSuccessfull = false;
        try {
            String createUserAccountQuery =  CreateUserAccountSQL(email, username, password);
            System.out.println(createUserAccountQuery);
            driverStatement.executeUpdate(createUserAccountQuery);
            isCreateSuccessfull = true;
        } 
        catch (SQLException ex) {Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);}
        
        return isCreateSuccessfull;
    }
    
    public boolean CheckIsValidEmail(String userEmail){
       String getEmailTableQuery = GetEmailTable(userEmail);
       System.out.println(getEmailTableQuery);
       
       ResultSet myResultSet;
        try {
            myResultSet = driverStatement.executeQuery(getEmailTableQuery);
            myResultSet.next();
            int numberColumsOfTable =  myResultSet.getInt(TableAtribute.NUMBER_EMAIL);
            System.out.println(numberColumsOfTable);            
            
            if(numberColumsOfTable > 0){
                return true;
            } 
        } 
        catch (SQLException ex) { Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);}
       
       return false;
    }
    
    public boolean CheckIsValidUserName(String username){
        String getUsernameTableQuery = GetUsernameTable(username);
        System.out.println(getUsernameTableQuery);
       
        ResultSet myResultSet;
        try {
            myResultSet = driverStatement.executeQuery(getUsernameTableQuery);
            myResultSet.next();
            int numberRowsOfTable =  myResultSet.getInt(TableAtribute.NUMBER_USERNAME);
            System.out.println(numberRowsOfTable);            
            
            if(numberRowsOfTable > 0){
                return true;
            } 
        } 
        catch (SQLException ex) { Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);}
       
       return false;
    }
    
}
