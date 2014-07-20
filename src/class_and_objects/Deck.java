package class_and_objects;

import java.util.function.Predicate;

import class_and_objects.Card.CardRank;
import class_and_objects.Card.CardSuit;

public class Deck {
	private Card[] deck;
	
	public Deck(){
		this.deck = deckInitialization();
	}
	
	//If i need to reset the deck
	private final Card[] deckInitialization(){
		Card[] deckTemp = new Card[52];
		int deckCounter = 0;
		
		for(CardSuit suit: CardSuit.values()){
			for(CardRank rank: CardRank.values()){
				deckTemp[deckCounter] = new Card(rank, suit);
				deckCounter++;
			}
		}
		
		return deckTemp;
	}
	
	public Card[] getDeck(){
		return this.deck;
	}
	
	public void printCards(Predicate<Card> tester){
		for(Card card: this.deck){
			if(tester.test(card)){
				System.out.println(card.toString());
			}
		}
	}
}
