// Deck exercises from the lessons

package class_and_objects;

public class DeckTest {
	public static void main(String[] args) {
		Deck deck = new Deck();	
		
		deck.printCards(card -> card.getCardRank() == "Ace"
											|| card.getCardRank() == "King");
		
		System.out.println("\nHach code test:");
		int i = 51;
		System.out.println(deck.getDeck()[i].toString() + " " + deck.getDeck()[i].hashCode());
		
	}
}
