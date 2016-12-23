package ponggame;

import java.awt.*;
import javax.swing.JFrame;


public class UsePong {
    public static void main(String[] args) {
        Ping p = new Ping();
        JFrame frame = new JFrame("Pong");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.add(p);
        frame.setVisible(true);
        
        frame.setLocation(550,200);
        
        
        
        
    }//end main


}//end class
