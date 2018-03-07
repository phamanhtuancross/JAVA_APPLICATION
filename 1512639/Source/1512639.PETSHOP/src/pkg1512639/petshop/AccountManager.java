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
public class AccountManager {
    
    private static AccountManager instance;

    public static AccountManager getInstance() {
        if(instance == null){
            instance = new AccountManager();
        }
        return instance;
    }

    public static void setInstance(AccountManager instance) {
        AccountManager.instance = instance;
    }

    
    public  AccountManager(){};
    
    public boolean IsValidAcount(String username, String password){
        
        if(username.contains(" ") || password.contains(" ")){ return false;}
        if(username.length() <= 0 || password.length() <= 0){ return false;}
        return true;
    }
    
    
    
    public boolean IsValidEmailAccount(String userEmail){
        if(userEmail.length() <= 0 || userEmail.contains(" "))return false;
        return true;
    }
    
    public boolean IsValidUsernameAccount(String username){
        if(username.length() <= 0 || username.contains(" ")) return false;
        return true;
    } 
    
    public boolean IsValidPasswordAccount(String password){
        if(password.length() <= 0 || password.contains(" ")) return false;
        return true;
    }
}
