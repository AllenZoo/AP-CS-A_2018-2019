// Elevens Lab - ACTIVITY 1

public class Card {

  /**
  * String value that holds the suit of the card
  */
  private String suit;

  /**
  * String value that holds the rank of the card
  */
  private String rank;

  /**
  * int value that holds the point value.
  */
  private int pointValue;


  /** TODO: Complete the constructor for the Card class
  * Creates a new Card instance.
  * @param rank is a String value containing the rank of the card
  * @param suit is a String value containing the suit of the card
  * @param pointValue is an int value containing the point value of the card
  */
  
  public Class(rank, suit, pointValue) {
	  this.rank = rank;
	  this.suit = suit;
	  this.pointValue = pointValue;
  }

  /** TODO: Complete this accessor method
  * Accesses this Card's rank
  * @return the rank of the Card
  */
  public String getRank() {
	  return this.rank;
  }

  /** TODO: Complete this accessor method
  * Accesses this Card's suit
  * @return the suit of the Card
  */
  public String getSuit() {
	  return this.suit;
  }

  /** TODO: Complete this accessor method
  * Accesses this Card's point value
  * @return
  */
  public int getPointValue() {
	  return this.pointValue;
  }

  /** TODO: Complete this instance method
  * Compares this card with the argument.
  * @param otherCard the other card to compare to this one
  * @return if the cards are different
  */
  public boolean compareCards(Card otherCard) {
	  if(this.rank == otherCard.rank &&
		 this.suit == otherCard.suit &&
		 this.pointValue == otherCard.pointValue) {
		  return true;
	  }
	  return false;
  }

  /** TODO: Complete this override method
  * Converts the rank, suit, and point value into a string in the format:
  * "[Rank] of [Suit] (point value = [PointValue])".
  * @return the values of the card
  */
  @Override
  public String toString(Card card) {
    return card.rank+ " of " +card.suit+ " (point value = " +card.pointValue+ ")";
  }
}
