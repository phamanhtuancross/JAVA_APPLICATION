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
public class Ministry1 {
    private Name name;
    private String gender;
    private int age;
    
    private static Ministry1 instance;

    private Ministry1(){}
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

    public static  synchronized Ministry1 getInstance() {
        if(instance == null){
            instance = new Ministry1();
        }
        return instance;
    }

    public static void setInstance(Ministry1 instance) {
        Ministry1.instance = instance;
    }
    
    @Override
    public String toString(){
        String result = "ministry  : " + name.toString() + " . Gender : " + gender + " .age : " + age;
        return result;
    }
    
}
