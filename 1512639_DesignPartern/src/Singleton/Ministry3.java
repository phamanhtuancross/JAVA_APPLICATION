/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import Prototype.Name;

/**
 *
 * @author phamanhtuan
 */
public class Ministry3 {
  private Name name;
    private String gender;
    private int age;
    
    private Ministry3(){}
    
    static{
        try{
            instance = new Ministry3();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private static Ministry3 instance = new Ministry3();

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Ministry3 getInstance() {
        return instance;
    }

    public static void setInstance(Ministry3 instance) {
        Ministry3.instance = instance;
    }
   
    @Override
    public String toString(){
        String result = "ministry  : " + name.toString() + " . Gender : " + gender + " .age : " + age;
        return result;
    }  
}
