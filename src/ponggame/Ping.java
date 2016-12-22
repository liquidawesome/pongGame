//Sean McCartan
package ponggame;

import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;

public class Ping extends JPanel implements ActionListener{
    /*Variables*/
    Timer t = new Timer(5, this);
    
    double width = this.getWidth(), height = this.getHeight();
    
    /*Constructors*/
    public Ping(){
        setFocusable(true);
        repaint();
    }
    
    /*Methods*/
    public void actionPerformed(ActionEvent e){
        
    }//end actionPerformed
    
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setPaint(Color.BLACK);
        g2.fill(new Rectangle2D.Double(0,0,500,500 )); //TODO make square change based on width/height
        
    }//end paint
    
}//end Ping
