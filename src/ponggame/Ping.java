//Sean McCartan
package ponggame;

import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;

public class Ping extends JPanel implements ActionListener{
    /*Variables*/
    Timer t = new Timer(5, this);
    
    /*Constructors*/
    public Ping(){
        
    }
    
    /*Methods*/
    public void actionPerformed(ActionEvent e){
        
    }//end actionPerformed
    
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
    }//end paint
    
}//end Ping
