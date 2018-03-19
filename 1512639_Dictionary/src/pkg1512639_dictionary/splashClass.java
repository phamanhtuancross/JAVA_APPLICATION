/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639_dictionary;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phamanhtuan
 */
public class splashClass {
    public static void main(String[] args) {
        Splash waitingScreen = new Splash();
        waitingScreen.setVisible(true);
        waitingScreen.jProgressBar1.setBackground(Color.WHITE);
        
        mainApp app = new  mainApp();
        for(int i = 0; i < 100; i++){
            try {
                Thread.sleep(40);
                waitingScreen.jProgressBar1.setValue(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(splashClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        waitingScreen.dispose();
        app.setVisible(true);
    }
    
}
