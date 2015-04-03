import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;

public class ActionAppointment {

	public static void frameRecall() {

		MainMenuFrame.newGameButton.setActionCommand("newGameButton");
		MainMenuFrame.newGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();

				if (command.equals("newGameButton")) {
					try {
						DeckChoosingFrame.deckChoosingFrame();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					MainMenuFrame.mainFrame.dispose();
				}
			}
		});
		DeckChoosingFrame.earthDeckButton.setActionCommand("earthDeckButton");
		DeckChoosingFrame.earthDeckButton
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					   	String command = e.getActionCommand();

						if (command.equals("earthDeckButton")) {
							try {

								Player.chooseDeck(Deck.earthDeck);
								CardChoosingFrame.cardChoosingFrame();

							} catch (IOException e1) {
								e1.printStackTrace();
							}
							DeckChoosingFrame.deckChoosingFrame.dispose();
						}
					}
				});
		DeckChoosingFrame.waterDeckButton.setActionCommand("waterDeckButton");
		DeckChoosingFrame.waterDeckButton
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("waterDeckButton")) {
							try {
								GameProcessFrame.processFrame();
								Player.chooseDeck(Deck.waterDeck);
							} catch (LineUnavailableException e1) {
								e1.printStackTrace();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							DeckChoosingFrame.deckChoosingFrame.dispose();
						}
					}
				});
		DeckChoosingFrame.natureDeckButton.setActionCommand("natureDeckButton");
		DeckChoosingFrame.natureDeckButton
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("natureDeckButton")) {
							try {
								GameProcessFrame.processFrame();
								Player.chooseDeck(Deck.natureDeck);
							} catch (LineUnavailableException e1) {
								e1.printStackTrace();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							DeckChoosingFrame.deckChoosingFrame.dispose();
						}
					}
				});
		DeckChoosingFrame.fireDeckButton.setActionCommand("fireDeckButton");
		DeckChoosingFrame.fireDeckButton
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("fireDeckButton")) {
							try {
								GameProcessFrame.processFrame();
								Player.chooseDeck(Deck.fireDeck);

							} catch (LineUnavailableException e1) {
								e1.printStackTrace();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							DeckChoosingFrame.deckChoosingFrame.dispose();
						}
					}
				});
		DeckChoosingFrame.glacierDeckButton
				.setActionCommand("glacierDeckButton");
		DeckChoosingFrame.glacierDeckButton
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("glacierDeckButton")) {
							try {
								GameProcessFrame.processFrame();
								Player.chooseDeck(Deck.glacierDeck);

							} catch (LineUnavailableException e1) {
								e1.printStackTrace();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							DeckChoosingFrame.deckChoosingFrame.dispose();
						}
					}
				});
		DeckChoosingFrame.underworldDeckButton
				.setActionCommand("underworldDeckButton");
		DeckChoosingFrame.underworldDeckButton
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("underworldDeckButton")) {
							try {
								GameProcessFrame.processFrame();
								Player.chooseDeck(Deck.underworldDeck);

							} catch (LineUnavailableException e1) {
								e1.printStackTrace();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							DeckChoosingFrame.deckChoosingFrame.dispose();
						}
					}
				});

		MainMenuFrame.exitButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				MainMenuFrame.mainFrame.dispose();
			}
		});

	}
}
