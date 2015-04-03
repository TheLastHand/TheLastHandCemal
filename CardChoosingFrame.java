import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class CardChoosingFrame {
	
	
	
	protected static boolean keyboardVisibility = false;
	public static JFrame cardChoosingFrame = new JFrame("Choose 8 cards to battle!");

	
	
	//getparent, getchild
	
	
	
	public static void cardChoosingFrame() throws IOException{
		
		
/*		File directory = new File("C://Users//student//Desktop//files//eclipse//workspace//TheLastHand//images//spellcards//earthDeck//");  
		File[] files = directory.listFiles();  
		  
		for (int index = 0; index < files.length; index++)  
		{  
		   //Print out the name of files in the directory  
		   System.out.println(files[index].toString());  
		   
*/		   
		   cardChoosingFrame.setSize(1000, 600);
		   cardChoosingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   cardChoosingFrame.setLocationRelativeTo(null);
			try {
				cardChoosingFrame
				.setContentPane(new JLabel(
						new ImageIcon(
								ImageIO.read(new File(
										"C://Users//student//Desktop//files//eclipse//workspace//TheLastHand//images//background.jpg")))));
			} catch (Exception e) {
				e.printStackTrace();
			}	
			
		
			FlowLayout layout = new FlowLayout();
			
			cardChoosingFrame.setLayout(layout);

		
			EarthDeck.getImagesOfEarthDeck();
		
			

		   cardChoosingFrame.setVisible(true);
		}  
		
	}


