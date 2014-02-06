
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
/**
   Draws a face.
 */
public class FaceComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      //Used text book to figure out how to draw things
      //Draw outline of face
      Ellipse2D.Double circle = new Ellipse2D.Double(0,0,120,120);
      g2.draw(circle);
      //Draw left eye
      Ellipse2D.Double eye1 = new Ellipse2D.Double(30,30,10,10);
      g2.draw(eye1);
      //Draw right eye
      Ellipse2D.Double eye2 = new Ellipse2D.Double(80,30,10,10);
      g2.draw(eye2);
      //Draw mouth
      Line2D.Double mouth = new Line2D.Double(30,80,90,80);
      g2.draw(mouth);
     
     
   }
}