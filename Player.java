import java.util.ArrayList;

public class Player { 
	 
	private ArrayList<Cards> playersHand;
	private String Name; 
	
	public Player() {
		playersHand = new ArrayList<Cards>(); 
	}
	
	public void addToHand(Deck deck) {
		playersHand.add(deck.draw());
	}
		
	public int incrementScore(int x) {
		int score = x; 
		score++;  
		return score; 
	}
	
	public ArrayList<Cards> getPlayersHand() {
		return playersHand;
	}

	public void setPlayersHand(ArrayList<Cards> playersHand) {
		this.playersHand = playersHand;
	}
	public int length() {
		int x = playersHand.size(); 
		return x; 
	}

	public int draw() {
		Cards topCard = playersHand.get(0);
		playersHand.remove(0); 
		return topCard.getValue(); 
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
