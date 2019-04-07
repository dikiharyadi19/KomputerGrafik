/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komputergrafik;

import javax.swing.JApplet;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
//arch
import java.awt.geom.*;
/**
 *
 * @author dikkidikki
 */
public class Square extends JApplet {
    
    Arc2D arc1=new Arc2D.Double(100, 50, 90, 60, 140, 160,  Arc2D.OPEN);
 
    public static void main(String[] args){
        
        JFrame frame =new JFrame();
        frame.setTitle("Square");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet=new Square();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
        
    }//end main method
    
    public void init(){
        JPanel panel=new Panel2D();
        getContentPane().add(panel);
    }
    
    class Panel2D extends JPanel{
        public Panel2D(){
            setPreferredSize(new Dimension(1000,500));
            setBackground(Color.LIGHT_GRAY);
            
        }
        
        public void paintComponent(Graphics g){
            Dimension d=getSize();
            int maxX=d.width-1;
            int maxY=d.height-1;
            super.paintComponent(g);
            Graphics2D g2=(Graphics2D)g;
            Color warna;
            
            
            g2.setColor(Color.ORANGE);
            g2.fillRect(70, 20, 860, 460); //width : height
            
            g2.setColor(Color.CYAN);
            g2.setStroke(new BasicStroke(2.0f));//garis tebal
           // g2.drawRect(500, 20, 430 , 460); line tengah
            
            
            //Graphics2D g3=(Graphics2D)g;
            //g3.setColor(Color.GRAY);
            //g3.fillRect(20, 20, 860, 460);
            //method2 oada graphics 2d
            
            //Laparngan badminton
            //g2.drawLine(350, 20, 350, 480);
            //g2.drawLine(650, 20, 650, 480);
                //g2.drawLine(70, 250, 350, 250);
                //g2.drawLine(930, 250, 650, 250);
                
            //g2.drawLine(480, 480, 480 ,20); 
            
            g2.drawLine(500, 480, 500,20);
            //Shape line=new Line2D.Double(3,3,303,303);
            //g2.draw(line);
            
            //garis lapangan
            Shape rect=new Rectangle(70,20,860,460);
            g2.draw(rect);
            
            Shape gawangKanan=new Rectangle(730,150,200,200);
            g2.draw(gawangKanan);
            
            Shape circleRight=new Ellipse2D.Double(680,200,100,100);
            //(lebar atas,tinggi atas,lebar bawah,tinggi bawah)
            g2.draw(circleRight);            

            Shape gawangKiri=new Rectangle(70,150,200,200);
            g2.draw(gawangKiri);
            
            Shape circleLeft=new Ellipse2D.Double(220,200,100,100);
            //(lebar atas,tinggi atas,lebar bawah,tinggi bawah)
            g2.draw(circleLeft);
            
            Shape circleCenter=new Ellipse2D.Double(450,200,100,100);
            //(lebar atas,tinggi atas,lebar bawah,tinggi bawah)
            g2.draw(circleCenter);
            
            //Arc2D.Double(x, y, w, h, 90, 180, Arc2D.OPEN)
            //semi cicle kanan
            Arc2D arcR=new Arc2D.Double(630, 45, 600, 400, 90, 180,  Arc2D.OPEN);
            g2.draw(arcR);
            
            //semi cicle kiri
            Arc2D arcL=new Arc2D.Double(-230, 45, 600, 400, 90, -180,  Arc2D.OPEN);
            g2.draw(arcL);
            
            //semi cicle kiri gawang kiri
            Arc2D ringL=new Arc2D.Double(70, 200, 100, 100, 90, -180,  Arc2D.OPEN);
            g2.draw(ringL);
            
            //Arc2D.Double(x, y, w, h, 90, 180, Arc2D.OPEN)
            //semi cicle Ring kanan
            Arc2D ringR=new Arc2D.Double(830, 200, 100, 100, 90, 180,  Arc2D.OPEN);
            g2.draw(ringR);
            
//g2.rotate(Math.toRadians(360));
          
            //  g2.draw(new Rectangle2D.Double(10, 10,20, 25));
            //(lebar bawah,tinggi bawah,lebar atas,tinggi atas)
            
            
            
        }
        
    }
}
