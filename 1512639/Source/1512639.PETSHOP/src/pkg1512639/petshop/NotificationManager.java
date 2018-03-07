/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639.petshop;
import  pkg1512639.petshop.GUI.NotifiacationPanel;

/**
 *
 * @author phamanhtuan
 */
public class NotificationManager {
    public  static void Show(String notificationText){
        NotifiacationPanel notifiacationPanel = new NotifiacationPanel();
        notifiacationPanel.SetNotificationText(notificationText);
        notifiacationPanel.setVisible(true); 
    }
}
