package class_and_objects;

public class Card {
	
	public enum CardRank{
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
		TEN, JACK, QUEEN, KING
	}
	
	public enum CardSuit{
		SPADES, HEARTS, DIAMONDS, CLUBS 
	}
	
	private final CardRank rank;
	private final CardSuit suit;
	
	public Card(){
		this(CardRank.ACE, CardSuit.SPADES);
	}
	
	public Card(CardRank inRank, CardSuit inSuit){
		
		this.rank = inRank;
		this.suit = inSuit;
	}
	
	public String getCardRank(){
		String card = "";
		switch(this.rank){
			case ACE: card = "Ace"; break;
			case TWO: card = "Two"; break;
			case THREE: card = "Three"; break;
			case FOUR: card = "Four"; break;
			case FIVE: card = "Five"; break;
			case SIX: card = "Six"; break;
			case SEVEN: card = "Seven"; break;
			case EIGHT: card = "Eight"; break;
			case NINE: card = "Nine"; break;
			case TEN: card = "Ten"; break;
			case JACK: card = "Jack"; break;
			case QUEEN: card = "Queen"; break;
			case KING: card = "King"; break;
			default: break;
		}
		
		return card;
	}
	
	public String getCardSuit(){
		String suit = "";
		switch(this.suit){
			case SPADES: suit = "Spades"; break;
			case HEARTS: suit = "Hearts"; break;
			case DIAMONDS: suit = "Diamonds"; break;
			case CLUBS: suit  = "Clubs"; break;
			default: break;
		}
		
		return suit;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Card){
			if(this.getCardRank() == ((Card)obj).getCardRank()
					&& this.getCardSuit() == ((Card)obj).getCardSuit()){
				return true;
			}
			else {
				return false;
			}
		} 
		else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return (this.suit.ordinal() * CardRank.values().length) + this.rank.ordinal();
	}
	
	@Override
	public String toString(){
		return this.getCardRank() + " of " + this.getCardSuit();
	}
}
