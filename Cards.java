public class Cards {

	private int value; 
	private int suit; 
	private String name;
	
	public Cards (int value, int suit) {
		this.value = value; 
		this.suit = suit; 
	}
	
	public String toString() {
		String[] suitNames = new String [] {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] values = new String [] {null, null, "Two", "Three", "Four", "Five", 
				"Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"}; 
		String s = values[this.value] + " of " + suitNames[this.suit];
		return s;
	}
	
	public String describe(Cards a) { 
		String b = a.toString();
		return b; 
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSuit() {
		return suit;
	}
	public void setSuit(int suit) {
		this.suit = suit;
	} 
	
}
