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
	  Card spade1 = new Card("1","Spades", 1);
	  Card spade2 = new Card("2","Spades", 2);
	  Card spade3 = new Card("3", "Spade", 3);
	  Card spade4 = new Card("4"), "Spade", 4);
	  
	  System.out.println(spade1.toString());
	  System.out.println(spade2.toString());
	  System.out.println(spade3.toString());
	  
	  System.out.println(spade1.compareCard(spade2));
	  System.out.println(spade1.compareCard(spade3));
  }
