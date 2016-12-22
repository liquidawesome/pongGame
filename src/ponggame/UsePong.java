package ponggame;

import java.awt.*;
import javax.swing.JFrame;


public class UsePong {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pong");
        Ping p = new Ping();
        
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(550,200);
        
        frame.add(p);
        
        
    }//end main


}//end class
