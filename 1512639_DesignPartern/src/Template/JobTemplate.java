/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template;

/**
 *
 * @author phamanhtuan
 */
public abstract class JobTemplate {
    
    public abstract void displayJobName();
    public abstract void displayWokerState();
    
    public void displayOtherInfor(){
        System.out.println("to day, it sunny");
    }
    public void displayJobInformation(){
        displayJobName();
        displayWokerState();
        displayOtherInfor();
    }
}
