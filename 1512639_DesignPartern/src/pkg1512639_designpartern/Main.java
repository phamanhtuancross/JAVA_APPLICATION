/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639_designpartern;

/**
 *
 * @author phamanhtuan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainController.MainController.getInstance().createCompersiteDesignParternDemo();
        MainController.MainController.getInstance().createPrototypeShallowCopyDesignPartern();
        MainController.MainController.getInstance().createPrototypeDeepCopyDesignPartern();
        MainController.MainController.getInstance().createSingletonDesingParternDemo();
        MainController.MainController.getInstance().createTemplateMethodDesignPartern();
    }
    
}
