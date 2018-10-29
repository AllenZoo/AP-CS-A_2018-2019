// Elevens Lab - ACTIVITY 3

import java.lang.Math;

/**
* This class provides a convenient way to test shuffling methods.
*/
public class Shuffler {

  /**
  * The number of consecutive shuffle steps to be performed in each call
  * to each sorting procedure.
  */
  private static final int SHUFFLE_COUNT = 5;

  /**
  * The number of values to shuffle.
  */
  private static final int VALUE_COUNT = 10;

  /**
  * Tests shuffling methods.
  * @param args is not used.
  */
  public static void main(String[] args) {
    System.out.println("Results of " + SHUFFLE_COUNT +
    " consecutive perfect shuffles:");
    int[] values1 = new int[VALUE_COUNT];
    for (int i = 0; i < values1.length; i++) {
      values1[i] = i;
    }
    for (int j = 1; j <= SHUFFLE_COUNT; j++) {
      perfectShuffle(values1);
      System.out.print("  " + j + ":");
      for (int k = 0; k < values1.length; k++) {
        System.out.printf(" %2d", values1[k]);
      }
      System.out.println();
    }
    System.out.println();

    System.out.println("Results of " + SHUFFLE_COUNT +
    " consecutive efficient selection shuffles:");
    int[] values2 = new int[VALUE_COUNT];
    for (int i = 0; i < values2.length; i++) {
      values2[i] = i;
    }
    for (int j = 1; j <= SHUFFLE_COUNT; j++) {
      selectionShuffle(values2);
      System.out.print("  " + j + ":");
      for (int k = 0; k < values2.length; k++) {
        System.out.printf(" %2d", values2[k]);
      }
      System.out.println();
    }
    System.out.println();
  }


  /** TODO: Complete the implementation for the given perfectShuffle algorithm
  * Apply a "perfect shuffle" to the argument.
  * The perfect shuffle algorithm splits the deck in half, then interleaves
  * the cards in one half with the cards in the other.
  * @param values is an array of integers simulating cards to be shuffled.
  */
  
  public static void perfectShuffle(int[] values) {
    // implementation code
	  int k = 0;
	  int[] a1 = new int[26];
	  int[] a2 = new int[26];
	  int[] a3 = new int[52];
	  
	  Random random = new Random();
	  n = random.nextInt(5)+1;
	  
	  
	  for(int j; j <= (cards.length + 1)/2; j++;) {
		  cards[j] = shuffled[k];
		  k += 2;
	  }
	  for(int j = (cards.length + 1)/2; j < 52; j++;) {
		  cards[j] = shuffled[k];
		  k += 2;
	  }
	  
	
  }

  /** TODO: Complete the implementation for the given selectionShuffle algorithm
  * Apply an "efficient selection shuffle" to the argument.
  * The selection shuffle algorithm conceptually maintains two sequences
  * of cards: the selected cards (initially empty) and the not-yet-selected
  * cards (initially the entire deck). It repeatedly does the following until
  * all cards have been selected: randomly remove a card from those not yet
  * selected and add it to the selected cards.
  * An efficient version of this algorithm makes use of arrays to avoid
  * searching for an as-yet-unselected card.
  * @param values is an array of integers simulating cards to be shuffled.
  */
  public static void selectionShuffle(int[] values) {
    // implementation code
	  
  }
}
