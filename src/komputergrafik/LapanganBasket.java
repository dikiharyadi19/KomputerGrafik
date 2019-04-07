/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komputergrafik;

import javax.swing.JApplet;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author dikkidikki
 */
public class LapanganBasket extends JApplet {
    public static void main(String[] args){
         JFrame frame =new JFrame();
        frame.setTitle("Square");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet=new Square();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }
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
            //g2.fillRect(70, 20, 860, 460); //width : height
            
            g2.setColor(Color.CYAN);
            g2.setStroke(new BasicStroke(2.0f));//garis tebal
            //g2.drawRect(500, 20, 430 , 460);
            
            
            //Graphics2D g3=(Graphics2D)g;
            //g3.setColor(Color.GRAY);
            //g3.fillRect(20, 20, 860, 460);
            //method2 oada graphics 2d
            
            //g2.drawLine(310, 20, 20, 480);
            //g2.drawLine(650, 20, 650, 480);
                //g2.drawLine(70, 250, 350, 250);
                //g2.drawLine(930, 250, 650, 250);
                
            
        }
        
    }
}
