import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class DeckChoosingFrame {

	
	protected static boolean keyboardVisibility = false;
	protected static JFrame deckChoosingFrame = new JFrame("The Last Hand");
	protected static JButton choose = new JButton("choose!");
	protected static JButton earthDeckButton = new JButton();
	protected static JButton fireDeckButton = new JButton();
	protected static JButton glacierDeckButton = new JButton();
	protected static JButton natureDeckButton = new JButton();
	protected static JButton underworldDeckButton = new JButton();
	protected static JButton waterDeckButton = new JButton();

	
	
	
	public static void deckChoosingFrame() throws IOException{
		
		
		
		deckChoosingFrame.setSize(1000, 600);
		deckChoosingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		deckChoosingFrame.setLocationRelativeTo(null);
		try {
			deckChoosingFrame
			.setContentPane(new JLabel(
					new ImageIcon(
							ImageIO.read(new File(
									"C://Users//student//Desktop//files//eclipse//workspace//TheLastHand//images//backgrounddeckchoosingframe.jpg")))));
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		FlowLayout layout = new FlowLayout();
		deckChoosingFrame.setLayout(layout);

	
		
		
		Image earthDeckImage = ImageIO.read(new File("C://Users//student//Desktop//files//eclipse//workspace//TheLastHand//images//themecards//earthdeck.jpg"));
		Image waterDeckImage = ImageIO.read(new File("C://Users//student//Desktop//files//eclipse//workspace//TheLastHand//images//themecards//waterdeck.jpg"));
		Image natureDeckImage = ImageIO.read(new File("C://Users//student//Desktop//files//eclipse//workspace//TheLastHand//images//themecards//naturedeck.jpg"));
		Image fireDeckImage = ImageIO.read(new File("C://Users//student//Desktop//files//eclipse//workspace//TheLastHand//images//themecards//firedeck.jpg"));
		Image glacierDeckImage = ImageIO.read(new File("C://Users//student//Desktop//files//eclipse//workspace//TheLastHand//images//themecards//glacierdeck.jpg"));
		Image underworldDeckImage = ImageIO.read(new File("C://Users//student//Desktop//files//eclipse//workspace//TheLastHand//images//themecards//underworlddeck.jpg"));
		
		
		deckChoosingFrame.add(earthDeckButton);
		deckChoosingFrame.add(waterDeckButton);
		deckChoosingFrame.add(natureDeckButton);
		deckChoosingFrame.add(fireDeckButton);
		deckChoosingFrame.add(glacierDeckButton);
		deckChoosingFrame.add(underworldDeckButton);
		
		
	
		earthDeckButton.setIcon(new ImageIcon(earthDeckImage));
		earthDeckButton.setIcon(new ImageIcon(earthDeckImage));
		earthDeckButton.setMargin(new Insets(0,0,0,0));
		earthDeckButton.setBorder(null);
		
		waterDeckButton.setIcon(new ImageIcon(waterDeckImage));
		waterDeckButton.setIcon(new ImageIcon(waterDeckImage));
		waterDeckButton.setMargin(new Insets(0,0,0,0));
		waterDeckButton.setBorder(null);

		natureDeckButton.setIcon(new ImageIcon(natureDeckImage));
		natureDeckButton.setIcon(new ImageIcon(natureDeckImage));
		natureDeckButton.setMargin(new Insets(0,0,0,0));
		natureDeckButton.setBorder(null);
	
		fireDeckButton.setIcon(new ImageIcon(fireDeckImage));
		fireDeckButton.setIcon(new ImageIcon(fireDeckImage));
		fireDeckButton.setMargin(new Insets(0,0,0,0));
		fireDeckButton.setBorder(null);

		glacierDeckButton.setIcon(new ImageIcon(glacierDeckImage));
		glacierDeckButton.setIcon(new ImageIcon(glacierDeckImage));
		glacierDeckButton.setMargin(new Insets(0,0,0,0));
		glacierDeckButton.setBorder(null);

		underworldDeckButton.setIcon(new ImageIcon(underworldDeckImage));
		underworldDeckButton.setIcon(new ImageIcon(underworldDeckImage));
		underworldDeckButton.setMargin(new Insets(0,0,0,0));
		underworldDeckButton.setBorder(null);
		
		
		
		
		
		
		
		
		
		deckChoosingFrame.setVisible(true);
		
		
	}
	
}
