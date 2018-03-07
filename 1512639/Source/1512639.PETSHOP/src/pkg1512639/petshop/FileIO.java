/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639.petshop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phamanhtuan
 */
public class FileIO {

    public static final String nameOfProperiesFile = "config.properties";
    public static List<String> ReadFile(){
        List<String> listInfors = new ArrayList<>();

        InputStream input = null;
        try {
            Properties prop = new Properties();
            input = new FileInputStream(nameOfProperiesFile);
            prop.load(input);
            
            listInfors.add(prop.getProperty("databasename"));
            listInfors.add(prop.getProperty("localhost"));
            listInfors.add(prop.getProperty("username"));
            listInfors.add(prop.getProperty("password"));
            
            for(String chil : listInfors){
                System.out.println(chil);
            }
            
        }
        catch (FileNotFoundException ex) {Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);}
        catch (IOException ex) { Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex); } 
        finally {
            try { input.close(); }
            catch (IOException ex) {Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);}
        }
        
        return listInfors;
    }
}
