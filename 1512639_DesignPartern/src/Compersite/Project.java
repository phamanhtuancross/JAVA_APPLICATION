/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compersite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phamanhtuan
 */
public class Project extends TaskItem{

    private String name;
    private List<TaskItem> subtasks = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addTaks(TaskItem  taskItem){
        this.subtasks.add(taskItem);
    }
    
    public void removeTaksAtIndex(int index){
        subtasks.remove(index);
    }
    
    public void removeTaks(TaskItem taskItem){
        subtasks.remove(taskItem);
    }

    public List<TaskItem> getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(List<TaskItem> subtasks) {
        this.subtasks = subtasks;
    }
    
    
   
    @Override
    public double getTime() {
        
        double totalTime = 0;
        int numberTasks = subtasks.size();
        
        for(int taskItemIndex = 0; taskItemIndex < numberTasks; taskItemIndex++){
            totalTime += subtasks.get(taskItemIndex).getTime();
        }
        
        return totalTime;
    }
    
}
