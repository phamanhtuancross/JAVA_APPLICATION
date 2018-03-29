/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639_jdbc.Model;

import java.io.InputStream;
import java.sql.Date;

/**
 *
 * @author phamanhtuan
 */
public class Student {
   
    private int id;
    private String name;
    private Date birthday;
    private String note;
    private InputStream avartar;

    //Constructor---------------------------------------------------------------
    public Student() {
    
        this.id = 0;
        this.name = "null";
        this.birthday = null;
        this.note = "null";
        this.avartar = null;
    }
    
    public Student(int _id, String _name,Date _birthday, String _note, InputStream _avartar){
        
        this.id = _id;
        this.name = _name;
        this.birthday = _birthday;
        this.note = _note;
        this.avartar = _avartar;
    
    }
    //End of function-----------------------------------------------------------
    
    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public InputStream getAvartar() {
        return avartar;
    }

    public void setAvartar(InputStream avartar) {
        this.avartar = avartar;
    }
}
