public class App {

	public static void main(String[] args) {
	
	Cards card = new Cards(10, 3); 
	System.out.println(card.describe(card)); 
		
	Player playerOne = new Player(); 
	playerOne.setName("Charlie");
	Player playerTwo = new Player(); 
	playerTwo.setName("Charles");
			
	Deck deck = new Deck();
//	deck.print(); 
	deck.shuffle();  

		int i = 0; 
		for (i=0; i<26; i++) {
			deck.dealDeck(playerOne, deck);
			deck.dealDeck(playerTwo, deck);
		}
		
	int pOneScore = 0;
	int pTwoScore = 0;
		
	for(i=0; i<26; i++) {
		int valueOfPlrOneCard = playerOne.draw();
		int valueOfPlrTwoCard = playerTwo.draw(); 
		
		if (valueOfPlrOneCard > valueOfPlrTwoCard) {
			pOneScore = playerOne.incrementScore(pOneScore); 
		} else {
			pTwoScore = playerTwo.incrementScore(pTwoScore); 
		}
	}	
	System.out.println(playerOne.getName() + "'s score is: " + pOneScore);
	System.out.println(playerTwo.getName() + " score is: " + pTwoScore);	
	
	
	if (pOneScore > pTwoScore) {
		System.out.println("The winner is: " + playerOne.getName());
	} else if (pTwoScore > pOneScore) {
		System.out.println("The winner is: " + playerTwo.getName());
	} else {
		System.out.println("Draw");
	}
}
}
