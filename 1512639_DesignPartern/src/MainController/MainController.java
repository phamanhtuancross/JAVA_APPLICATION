/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainController;

import Compersite.Project;
import Compersite.Task;
import Prototype.Name;
import Prototype.Student;
import Singleton.Ministry1;
import Singleton.Ministry2;
import Singleton.Ministry3;
import Template.JavaDeveloper;
import Template.Teacher;

/**
 *
 * @author phamanhtuan
 */
public class MainController {
   
    private static MainController instance;    
    private MainController(){}

    public static synchronized MainController getInstance() {
        if(instance == null){
            instance = new MainController();
        }
        return instance;
    }

    public static void setInstance(MainController instance) {
        MainController.instance = instance;
    }
    
    public void createCompersiteDesignParternDemo(){
        System.out.println("----------COMPERSITE DESIGN PARTERN-----------------");
        int totalTasks = 10;
        
        Project project = new Project();
        project.setName("Main task");
        
        for(int taskIndex = 1; taskIndex <= totalTasks; taskIndex++){
            String taskName = "Task :" + taskIndex;
            Task task = new Task(taskName, (double)taskIndex);
            project.addTaks(task);
        }
        
        System.out.println("total time of subject name  " + project.getName() + " is :" + project.getTime());
        project.removeTaksAtIndex(0);
        System.out.println("Total time then remove first task is :" + project.getTime());
        
        
    }
    
    public void createSingletonDesingParternDemo(){
       
        System.out.println("---------SINGLETON DESING PARTERN-------------------");
        System.out.println("---------------Singleton thread safe----------------");
        Ministry1.getInstance().setName(new Name("Pham "," Tuan"));
        Ministry1.getInstance().setGender("Male");
        Ministry1.getInstance().setAge(25);
        System.out.println("Export infor :" + Ministry1.getInstance().toString());
        
        System.out.println("---------------Eager initialization----------------");
        Ministry2.getInstance().setName(new Name("Nguyen "," Trang"));
        Ministry2.getInstance().setGender("Feamle");
        Ministry2.getInstance().setAge(25);
        System.out.println("Export infor :" + Ministry2.getInstance().toString());
        
        System.out.println("---------------Static block initialization----------------");
        Ministry3.getInstance().setName(new Name("Thuy Tram "," Dang"));
        Ministry3.getInstance().setGender("Feamle");
        Ministry3.getInstance().setAge(30);
        System.out.println("Export infor :" + Ministry3.getInstance().toString());
        

    }
    
    public void createPrototypeShallowCopyDesignPartern(){
        System.out.println("--------PROTOTYPE SHALLOW COPY DESIGN PARTERN-------");
        Student student = new Student(new Name("Tuan","Pham"),"male", 12, 17);
        Student studentShallowCopy = student.shallowCopy();
        
        System.out.println("Main student before change is :" + student.toString());
        System.out.println("Student shallow copy before change is :" + studentShallowCopy.toString());
        
        studentShallowCopy.getName().setFirstName("STEVE GENDER ");
        System.out.println("Main student after shallow student copy change name is :" + student.toString());
        System.out.println("Student shallow copy then change name attribute is :"  + studentShallowCopy.toString());
    }
    
    public void createPrototypeDeepCopyDesignPartern(){
        System.out.println("----------PROTOTYPE DEEP COPY DESIGN PARTERN--------");
        Student student = new Student(new Name("Tuan", "Pham"), "male", 12, 17);
        Student studentDeepCopy = student.deepCopy();

        System.out.println("Main student before change is :" + student.toString());
        System.out.println("Student deep copy before change is :" + studentDeepCopy.toString());

        studentDeepCopy.getName().setFirstName("STEVE GENDER ");
        System.out.println("Main student after  student deep copy change name is :" + student.toString());
        System.out.println("Student deep copy then change name attribute is :" + studentDeepCopy.toString());
    }
    
     public void createTemplateMethodDesignPartern(){
         
         System.out.println("-----------TEMPLATE METHOD DESIGN PARTERN----------");
         JavaDeveloper javaDeveloper = new JavaDeveloper();
         javaDeveloper.displayJobInformation();
         
         System.out.println("--------------------------");
         
         Teacher teacher = new Teacher();
         teacher.displayJobInformation();
     }

    
    
}
