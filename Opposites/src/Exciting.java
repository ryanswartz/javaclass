import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Arc2D;
import java.awt.Polygon;

/**Creates an exciting face with the ability to wink. 
 * */
public class Exciting extends JComponent {
	
	//Instance Variables
	private Ellipse2D.Double head;
    private Ellipse2D.Double eye1;
    private Ellipse2D.Double eye2;
    private Arc2D.Double mouth;
    private Polygon beard;
    private Line2D.Double eyebrow1;
    private Line2D.Double eyebrow2;
    private Arc2D.Double wink;
    private int initiateWink = 0;
    private int xCord = 0;
    private int yCord = 0;
    private String winking;
    
    /**Constructs an exciting face in top left corner with default features.
     * */
	public Exciting() {
		 
	      head = new Ellipse2D.Double(0,0,120,120); //Create outline of face
	      eye1 = new Ellipse2D.Double(30,30,10,10); //Create left eye
	      eye2 = new Ellipse2D.Double(80,30,10,10); //Create right eye
	      mouth = new Arc2D.Double(40,58,40,40,180,180,1); //Create mouth
	      
	      //intialize arrays for beard
	      int[] xArray = new int[3];
	      xArray[0]=55;
	      xArray[1]=60;
	      xArray[2]=65;
	      int[] yArray = new int[3];
	      yArray[0]=100;
	      yArray[1]=115;
	      yArray[2]=100;
	      
	      beard = new Polygon(xArray, yArray,3); //Create beard
	      eyebrow1 = new Line2D.Double(25,30,40,25); //Create left eyebrow
	      eyebrow2 = new Line2D.Double(80,25,95,30); //Create right eyebrow
	      }

	
	/**Constructs an exciting face at coordinates (x,y).
	 * */
	public Exciting(int x, int y){
			xCord = x;  //records location of face
			yCord = y;
		
			head = new Ellipse2D.Double(x,y,120,120); //moves every element of the face over so that x,y is the top left
			eye1 = new Ellipse2D.Double(30 + x,30 + y,10,10);
			eye2 = new Ellipse2D.Double(80 + x,30 + y,10,10);
			mouth = new Arc2D.Double(40 + x,58 + y,40,40,180,180,1);
			
			//Change the arrays for the beard
			  int[] xArray = new int[3];
		      xArray[0]=55 + x;
		      xArray[1]=60 + x;
		      xArray[2]=65 + x;
		      int[] yArray = new int[3];
		      yArray[0]=100 + y;
		      yArray[1]=115 + y;
		      yArray[2]=100 + y;
		      
			beard = new Polygon(xArray, yArray,3);
			eyebrow1 = new Line2D.Double(25 + x,30 + y,40 + x,25 + y);
		    eyebrow2 = new Line2D.Double(80 + x,25 + y,95 + x,30 + y);
		      
	}
	/**Constructs an exciting face that is winking.
	 * @param must take a 1 in order to create the winking face*/
	public Exciting(int x){
		  initiateWink = x;
		  
		  //copied every element from normal face except for eye2
		  head = new Ellipse2D.Double(0,0,120,120);
	      eye1 = new Ellipse2D.Double(30,30,10,10);
	      mouth = new Arc2D.Double(40,58,40,40,180,180,1);
	      int[] xArray = new int[3];
	      xArray[0]=55;
	      xArray[1]=60;
	      xArray[2]=65;
	      int[] yArray = new int[3];
	      yArray[0]=100;
	      yArray[1]=115;
	      yArray[2]=100;
	      beard = new Polygon(xArray, yArray,3);
	      eyebrow1 = new Line2D.Double(25,30,40,25);
	      eyebrow2 = new Line2D.Double(80,25,95,30);
	      
	      //replaced eye2 with wink
	      wink = new Arc2D.Double(80,32,10,10,360,180,0);
	}
	/** 	
     * Returns a String representing boring face object and its values.
     * @return a String representing boring face object's coordinate and size values.
     */
	public String toString(){
		   String cords = ("x: " + xCord +"\n" + "y: " + yCord + "\n");
		   if (initiateWink == 1){
			   winking = "winking?: yes";
		   }
		   else {
			   winking = "winking?: no";
		   }
	       return cords + "width: 240\nheight: 240 \n" + winking;	
	}
	
	/**Paints the exciting face. */
	 public void paint(Graphics g)
	    {
	        // Recover the graphics context
	        Graphics2D g2 = (Graphics2D) g;
	        g2.draw(head);
	        g2.draw(eye1);
	       
	        g2.draw(mouth);
	        g2.draw(beard);
	        g2.draw(eyebrow1);
	        g2.draw(eyebrow2);
	        
	        if (initiateWink == 1){   //resolves issue for winking so that normal exciting face does not have "wink"
	        g2.draw(wink);
	        }
	        
	        if (initiateWink == 0){	  //resolves issue for winking face so that it does not have eye2
	     g2.draw(eye2);
	        }
}

}
