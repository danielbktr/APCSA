/**
 * This is a class that tests the Card class.
 *
 *  Daniel Boktor
 *  April 25, 2023
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);
      Card twoSpades = new Card("two","spades",2);
      Card fourHearts = new Card("four","hearts",4);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      System.out.println("**** Tests Card 2: two of spades ****");
      System.out.println("  rank: " + twoSpades.rank());
      System.out.println("  suit: " + twoSpades.suit());
      System.out.println("  pointValue: " + twoSpades.pointValue());
      System.out.println("  toString: " + twoSpades.toString());
      System.out.println();

      // Test card 3
      System.out.println("**** Tests Card 3: four of hearts ****");
      System.out.println("  rank: " + fourHearts.rank());
      System.out.println("  suit: " + fourHearts.suit());
      System.out.println("  pointValue: " + fourHearts.pointValue());
      System.out.println("  toString: " + fourHearts.toString());
      System.out.println();

      // Test matches() method

   }
}
