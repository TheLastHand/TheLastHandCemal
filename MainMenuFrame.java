import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

public class MainMenuFrame {

	protected static JFrame mainFrame = new JFrame("The Last Hand");
	protected static JButton newGameButton = new JButton();
	protected static JMenuBar menuBar = new JMenuBar();
	protected static JButton exitButton = new JButton();

	public static void gameFrame() throws IOException {

		mainFrame.setSize(1000, 600);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mainFrame
				.setContentPane(new JLabel(
						new ImageIcon(
								ImageIO.read(new File(
										"C://Users//student//Desktop//files//eclipse//workspace//TheLastHand//images//backgroundmain.jpg")))));

		mainFrame.setJMenuBar(menuBar);
		GridBagLayout layout = new GridBagLayout();
		mainFrame.setLayout(layout);
		GridBagConstraints gbc = new GridBagConstraints();

		Image newGameImage = ImageIO
				.read(new File(
						"C://Users//student//Desktop//files//eclipse//workspace//TheLastHand//images//newgame.png"));
		Image exitImage = ImageIO
				.read(new File(
						"C://Users//student//Desktop//files//eclipse//workspace//TheLastHand//images//exit.png"));

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		mainFrame.add(newGameButton, gbc);
		newGameButton.setIcon(new ImageIcon(newGameImage));
		newGameButton.setMargin(new Insets(0, 0, 0, 0));
		newGameButton.setBorder(null);

		gbc.gridx = 0;
		gbc.gridy = 1;
		mainFrame.add(exitButton, gbc);
		exitButton.setIcon(new ImageIcon(exitImage));
		exitButton.setMargin(new Insets(0, 0, 0, 0));
		exitButton.setBorder(null);
		mainFrame.setVisible(true);
		ActionAppointment.frameRecall();

	}

}
