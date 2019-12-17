/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gibsonclugstonfinalproject;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;


/**
 *
 * @author shclu4508
 */
public class MapScreen {
     JFrame frame = new JFrame("Frame");
   
    public void MapScreen(){
      
    }
    
   
    
    public void run(){
         
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setFocusable(true);
        
        
        
        
        JPanel panel = new JPanel(); 
        JLabel up = new JLabel();
        JLabel down = new JLabel();
        JLabel left = new JLabel();
        JLabel right = new JLabel();
        
        
        panel.add(up);
        panel.add(down);
        panel.add(left);
        panel.add(right);
       
        
        
        up.setText("Up: 0");
        down.setText("Down: 0");
        left.setText("Left: 0");
        right.setText("Right: 0");
        
        frame.addKeyListener(new KeyListener(){
           int upCount = 0;
           int downCount = 0;
           int leftCount = 0;
           int rightCount = 0;
            
            
            @Override
            public void keyTyped(KeyEvent e) {
               
            }

            @Override
            public void keyPressed(KeyEvent e) {
               int keyCode = e.getKeyCode();
               switch(keyCode){
                   case KeyEvent.VK_W:
                   up.setText("Up: " + upCount++);
                   break;
                   case KeyEvent.VK_S:
                   down.setText("Down: " + downCount++);
                   break;
                   case KeyEvent.VK_D:
                   right.setText("Right: " + rightCount++);
                   break;
                   case KeyEvent.VK_A:
                   left.setText("Left: " + leftCount++);
                   break;
               }
            }

            @Override
            public void keyReleased(KeyEvent e) {
               
            }
            
        }) ;
   
        
        frame.add(panel);
    }
}
