
public class Deck {
	
	
	protected static Object waterDeck;
	protected static Object earthDeck;
	protected static Object natureDeck;
	protected static Object fireDeck;
	protected static Object glacierDeck;
	protected static Object underworldDeck;

	public Deck(String name, Card card){
		
		Taunt taunt = new Taunt();
		taunt.attack(6);
		taunt.defense(7);
		
		Taunt taunt2 = new Taunt();
		taunt.attack(2);
		taunt.defense(1);
		
		
	}
	
	
	public String getCard(){
		
		return Card.cardName;
		
	}

}
