/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komputergrafik;

/**
 *
 * @author dikkidikki
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class ArcsDraw extends Frame {
  Stroke drawingStroke = new BasicStroke(2);
  Arc2D arc=new Arc2D.Double(140, 90, 90, 145, 160, 180,  Arc2D.OPEN);
  Arc2D arc1=new Arc2D.Double(100, 50, 90, 60, 140, 160,  Arc2D.OPEN);
 
  public void paint(Graphics g) {
  Graphics2D ga = (Graphics2D)g;
  ga.setStroke(drawingStroke);
  ga.setPaint(Color.yellow);
  ga.fill(arc);
  ga.draw(arc);
  ga.setPaint(Color.black);
  ga.draw(arc1);

  }

  public static void main(String args[]) {
  Frame frame = new ArcsDraw();
  frame.addWindowListener(new WindowAdapter(){
  public void windowClosing(WindowEvent we){
  System.exit(0);
  }
  });
  frame.setSize(250, 250);
  frame.setVisible(true);
  }
}