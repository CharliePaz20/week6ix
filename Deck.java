import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList<Cards> CardDeck; 
	
	public Deck() {
		CardDeck = new ArrayList<Cards>(); 
		
		for(int suit = 0; suit <=3; suit++) {
			for (int value = 2; value <= 14; value++) {
				CardDeck.add(new Cards(value, suit));  
			}
		}	
	}
	public void print() {
		for (int i = 0; i<this.CardDeck.size(); i++) {
			System.out.println(this.CardDeck.get(i)); 
		}
	}
	
	public void shuffle() {
		Collections.shuffle(CardDeck);
	
	}
	public int length() {
		int x = CardDeck.size(); 
		return x; 
	}
	
	public Cards draw() {
		Cards topCard = CardDeck.get(0);
		CardDeck.remove(0); 
		return topCard; 
	}
	
	
	public void dealDeck (Player x, Deck z) {
		x.addToHand(z);
	}	

}
