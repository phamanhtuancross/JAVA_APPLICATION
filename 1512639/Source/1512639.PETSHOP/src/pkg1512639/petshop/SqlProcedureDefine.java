/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639.petshop;

/**
 *
 * @author phamanhtuan
 */
public class SqlProcedureDefine {
    
    public static String GetUsernameTable(String username){
        String resulString = " select count(*) as " + TableAtribute.NUMBER_USERNAME + 
                             " from " + TableNameDefine.USER_ACCOUNT_TABLE +
                             " where username = '" + username +"'";
        return resulString;
    }
    
    public static String GetEmailTable(String userEmail){
        String resultString = " select count(*) as " + TableAtribute.NUMBER_EMAIL +
                              " from " + TableNameDefine.USER_ACCOUNT_TABLE + 
                              " where email = '" + userEmail + "';";
        return resultString;
    }
    
    public static String CreateUserAccount(String email,String username,String password){
        String resString = " insert into " + TableNameDefine.USER_ACCOUNT_TABLE + 
                           " values('"+email + "','"+username+"','"+password +"');";
        return  resString;
    }
}
