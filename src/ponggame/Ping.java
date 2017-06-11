//Sean McCartan
package ponggame;

import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;

public class Ping extends JPanel implements ActionListener, KeyListener{
    /*Variables*/
    Timer t = new Timer(10, this);
    
    int code;
    
    double width = this.getWidth(), height = this.getHeight();
    
    int x = 0;
    int y = 0;
    
    int pausex = 0;
    int pausey = 0;
    
    int score1 = 0, score2 = 0;
    
    double[]xspeeds = {2.5,-2.5,0};
    double[]yspeeds = {1.5,-1.5,0};
    
    double ballx = 200, bally = 200;
    double xspeed = xspeeds[x], yspeed = yspeeds[x];
    
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
        
        //HIT P1 PADDLE
        if(ballx >= 415 && (bally >= p1y && bally <= p1.getMaxY() )){
            if(x < 1)
                x++;
            else if(x >= 1)
                x = 0;
        }
        
        //HIT P2 PADDLE
        if(ballx <= 35 && (bally >= p2y && bally <= p2.getMaxY() )){
            if(x < 1)
                x++;
            else if(x >= 1)
                x = 0;
        }
        
        
        //TOP+BOTTOM BOUNDS
        if(bally >= 440 || bally <= 0){
            if(y < 1)
                y++;
            else if(y >= 1)
                y = 0;
        }
            
        //OUT OF BOUNDS
        if(ballx <= -20){
            x = 2;
            y = 2;
            score1++;
            
            reset();
            x = 0;
            y = 0;
        }//P1 WIN
        
        if(ballx >= 500){
            x = 2;
            y = 2;
            score2++;
            
            reset();
            x = 1;
            y = 1;
        }//P2 WIN
        
        ballx += xspeeds[x];
        bally += yspeeds[y];
            
        
    }//end actionPerformed
    
    public void keyPressed(KeyEvent k){
        code = k.getKeyCode();
        
        if(code == KeyEvent.VK_UP){
            if(p1y > 0)
                p1y -= 20;
        }//P1 UP
        if(code == KeyEvent.VK_DOWN){
            if(p1y < 360)    
                p1y += 20;
        }//P1 DOWN
        
        if(code == KeyEvent.VK_W){
            if(p2y > 0)
                p2y -= 20;
        }//P2 UP
        if(code == KeyEvent.VK_S){
            if(p2y < 360)    
                p2y += 20;
        }//P2 DOWN
        
        if(code == KeyEvent.VK_SPACE){
            reset();
        }
        if(code == KeyEvent.VK_P){
            pause();
        }
    }//end keyPressed
    public void keyTyped (KeyEvent k){}
    public void keyReleased (KeyEvent k){}
    
    
    public void reset(){
        
        ballx = 200;
        bally = 200;
        
    }//reset ball
    
    public void pause(){
        if(x != 2 && y != 2){
            pausex = x;
            pausey = y;
            
            x = 2;
            y = 2;
        }
        else{
            x = pausex;
            y = pausey;
        }
        
        
    }//pause game
    
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        
        //things that get repainted (have movement) need to be here
        ball = new Rectangle2D.Double(ballx,bally,20,20);
        p1 = new Rectangle2D.Double(435,p1y,20,100);
        p2 = new Rectangle2D.Double(15,p2y,20,100);
        
        g2.setPaint(Color.RED);
        g2.drawString(""+score1, 460, 20);
        g2.drawString(""+score2, 10, 20);
        
        
        g2.setPaint(Color.WHITE);
        g2.fill(ball);
        g2.fill(p1);
        g2.fill(p2);
        
    }//end paint
    
}//end Ping
