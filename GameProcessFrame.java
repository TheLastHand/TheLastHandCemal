import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameProcessFrame {

	protected static boolean keyboardVisibility = false;
	protected static JFrame gameProcessFrame = new JFrame("GAME IS ON");
	

	public static void processFrame() throws LineUnavailableException,
			IOException {

		gameProcessFrame.setSize(1000, 600);
		gameProcessFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameProcessFrame
		.setContentPane(new JLabel(
				new ImageIcon(
						ImageIO.read(new File(
								"C://Users//student//Desktop//files//eclipse//workspace//TheLastHand//images//background.jpg")))));
		gameProcessFrame.setLayout(new BorderLayout());
		gameProcessFrame.setLocationRelativeTo(null);

	
		
	
		

		gameProcessFrame.setVisible(true);

	}
}
