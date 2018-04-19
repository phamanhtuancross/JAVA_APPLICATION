/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author phamanhtuan
 */
public class Student {
    private Name name;
    private String gender;
    private int age;
    private int grade;

    public Student(Name name, String gender, int age, int grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.grade = grade;
    }

    
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    
    public Student shallowCopy(){
        Student student = new Student(name, gender, age, grade);
        return student;
    }
    
    public Student deepCopy(){
        
        Name _name = new Name(this.name.getFirstName(), this.name.getLastName());
        Student student = new Student(_name, gender, age, grade);
        return student;
    }
    
    @Override
    public String toString(){
        String result = "Student : " + name.toString() + " . Gender : " + gender + " .Grade : " + grade;
        return result;
    }
    
    
    
}
