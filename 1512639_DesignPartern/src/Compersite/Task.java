/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compersite;

/**
 *
 * @author phamanhtuan
 */
public class Task  extends TaskItem{

    String name;
    Double time;

    public Task(String name, Double time) {
        this.name = name;
        this.time = time;
    }

    public Task() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(Double time) {
        this.time = time;
    }
    
    
    @Override
    public double getTime() {
        return this.time;
    }
    
}
