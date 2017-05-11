package question02;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

/*
   A component that draws two rectangles.
*/
public class TriangleComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      
      // Create the point to connect the lines
      Point2D.Double p1 = new Point2D.Double(200, 100);
      Point2D.Double p2 = new Point2D.Double(150, 250);
      Point2D.Double p3 = new Point2D.Double(150, 250);
      Point2D.Double p4 = new Point2D.Double(250, 250);
      Point2D.Double p5 = new Point2D.Double(250, 250);
      Point2D.Double p6 = new Point2D.Double(200, 100);
      
      // Create the lines
      Line2D.Double side1 = new Line2D.Double(p1, p2);
      Line2D.Double side2 = new Line2D.Double(p3, p4);
      Line2D.Double side3 = new Line2D.Double(p5, p6);

      // Draw triangle sides
      g2.draw(side1);
      g2.draw(side2);
      g2.draw(side3);
   }
}