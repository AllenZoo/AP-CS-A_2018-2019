// Elevens Lab - ACTIVITY 1
import.java.awt.*;
public class CardTester {

  /**
  * The main method in this class checks the Card operations for consistency.
  *	@param args is not used.
  */
  public static void main(String[] args) {
    // Create Card objects here
    // How would you verify that everything in your Card class works as it should?
    // HINT: use the overridden toString method
	  
	  //Rank, Suit, PointValue
	  Card a = new Card("Ace","Spades", 1);
	  card b = new Card("Two","Spades", 2);
	  card c = new Card("Three", "Spade", 3);
	  
	  toString(a);
	  toString(b);
	  toString(c);
  }
