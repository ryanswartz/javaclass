import javax.swing.JFrame;
import java.util.Scanner;

/**This class tests both the Exciting and Boring classes. First it prompts the user to pick between the two faces.
 * Next it constructs the default face for that class. If the user chose the exciting face, they are prompted for a response to it.
 * Then the face will wink at the user if they like it, or creates the boring face if they don't.
 * The program repeats until the user closes a response window.
 * */
public class FaceTester {  
	
	//creates a scanner for later input
	private static Scanner in = new Scanner(System.in);
	
/** Tests both Exciting and Boring classes. Gives user the option between an exciting face or a boring one.*/
	public static void main(String[] args)
{
		
    JFrame frame = new JFrame(); //Creating all the frames used later
    JFrame frame1 = new JFrame();
    JFrame frame2 = new JFrame();
    JFrame frame3 = new JFrame();		
    
        Exciting excite = new Exciting(); //Creating the different faces
        Boring bore = new Boring();
        Exciting wink = new Exciting(1);
        
        //Google searched how to repeat something indefinitely, found while (true). My code still terminates when the user closes a response window.
    while (true){ 
    	System.out.print("Please type 1 for a boring face or 2 for an exciting face: "); //Displays prompt
    	int temp = in.nextInt();
    	
    	//Displays boring face if user types 1
    	if (temp == 1){
    		frame.setSize(300, 400);
            frame.setTitle("FaceTester");
            frame.setVisible(true);
    		frame.add(bore);
    		}
    	
    	//Displays exciting face if user types else
    	else {
    		frame1.setSize(300, 400);
            frame1.setTitle("FaceTester");
            frame1.setVisible(true);
    		frame1.add(excite);
    		
    		//asks how the user liked the face
    		System.out.print("Did you like the exciting face? 1 for yes, 2 for no: "); //Displays prompt
    		temp = in.nextInt();
    		
    		//if the user liked the face, makes a winking face
    		if (temp == 1){
    			frame2.setSize(300, 400);
                frame2.setTitle("FaceResponse");
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setVisible(true);
        		frame2.add(wink);
    		}
    		
    		//if user didn't like the face, creates the boring face
    		else {
    			frame3.setSize(300, 400);
                frame3.setTitle("FaceResponse");
                frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame3.setVisible(true);
        		frame3.add(bore);
        		}
    	}
    }
  
	}  	
 }

