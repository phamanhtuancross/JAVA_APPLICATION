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
public class Ministry2 {
    private Name name;
    private String gender;
    private int age;
    
    private Ministry2(){}
    
    private static Ministry2 instance = new Ministry2();

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

    public static Ministry2 getInstance() {
        return instance;
    }

    public static void setInstance(Ministry2 instance) {
        Ministry2.instance = instance;
    }
   
    @Override
    public String toString(){
        String result = "ministry  : " + name.toString() + " . Gender : " + gender + " .age : " + age;
        return result;
    }
    
}
