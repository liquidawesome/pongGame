//Sean McCartan
package ponggame;

import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;

public class Ping extends JPanel implements ActionListener, KeyListener{
    /*Variables*/
    Timer t = new Timer(10, this);
    
    double width = this.getWidth(), height = this.getHeight();
    
    double ballx = 250, bally = 200;
    double xspeed = 2.5, yspeed = 1.5;
    
    Rectangle2D ball;
    Rectangle2D p1;
    double p1y = 190;
    Rectangle2D p2;
    double p2y = 190;
    
    
    /*Constructors*/
    public Ping(){
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setBackground(Color.BLACK);
        
    }
    
    /*Methods*/
    public void actionPerformed(ActionEvent e){
        repaint();
        
        if(ballx >= 470 || ballx <= 0)
            xspeed = -xspeed;
        if(bally >= 440 || bally <= 0)
            yspeed = -yspeed;
        
        ballx += xspeed;
        bally += yspeed;
            
        
    }//end actionPerformed
    
    public void keyPressed(KeyEvent k){
        int code = k.getKeyCode();
        
        if(code == KeyEvent.VK_UP){
            
        }//UP
        if(code == KeyEvent.VK_DOWN){
            
        }//DOWN
    }
    public void keyTyped (KeyEvent k){}
    public void keyReleased (KeyEvent k){}
    
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        
        //things that get repainted (have movement) need to be here
        ball = new Rectangle2D.Double(ballx,bally,20,20);
        p1 = new Rectangle2D.Double(435,p1y,20,100);
        p2 = new Rectangle2D.Double(15,p2y,20,100);
        
        
        g2.setPaint(Color.WHITE);
        g2.fill(ball);
        g2.fill(p1);
        g2.fill(p2);
        
    }//end paint
    
}//end Ping
