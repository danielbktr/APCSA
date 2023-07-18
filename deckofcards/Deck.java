import java.util.*;/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 *
 *
 *  Daniel Boktor
 *  April 25,2023
 */
public class Deck
{
   private ArrayList<Card> cards = new ArrayList<Card>();//contains all the cards in the deck
   private int size;   // size is the number of not-yet-dealt cards.
                       // Cards are dealt from the top (highest index) down.
                       // The next card to be dealt is at size - 1.

   /**
    * Creates a new Deck instance.<BR>
    * It pairs each element of ranks with each element of suits,
    * and produces one of the corresponding card.
    * @param ranks is an array containing all of the card ranks.
    * @param suits is an array containing all of the card suits.
    * @param values is an array containing all of the card point values.
    */
   public Deck(String[] ranks, String[] suits, int[] values)
   {
      for(int i=0;i<ranks.length;i++){
         
         Card temp = new Card(ranks[i],suits[i],values[i]);
         this.cards.add(temp);
      }
      this.size = ranks.length;
      shuffle();
   }

   /**
    * Determines if this deck is empty (no undealt cards).
    * @return true if this deck is empty, false otherwise.
    */
   public boolean isEmpty()
   {
      if (this.size == 0){
         return true;
      }
      return false;
   }

   /**
    * Accesses the number of undealt cards in this deck.
    * @return the number of undealt cards in this deck.
    */
   public int size()
   {
      return this.size;
   }

   /**
    * Randomly permute the given collection of cards
    * and reset the size to represent the entire deck.
    */
   public void shuffle()
   {
      Collections.shuffle(this.cards);

   }

   /**
    * Deals a card from this deck.
    * @return the card just dealt, or null if all the cards have been
    *         previously dealt.
    */
   public Card deal()
   {
      if(this.size!=0){  
      Card temp = this.cards.get(this.size-1);
      this.size--;
   return temp;   
   }
      return null;
   }


   static void sortByPointValue(ArrayList<Card> deck) 
   { 
       for (int i = 0; i < deck.size(); i++) 
       { 
           int minimumIndex = i; 
           for (int j = i+1; j < deck.size(); j++) 
               if (deck.get(i).pointValue() < deck.get(minimumIndex).pointValue()) 
                  minimumIndex = j; 
  
           Card temp = deck.get(minimumIndex); 
           deck.set(minimumIndex,deck.get(i)); 
           deck.set(i,temp); 
       } 
}

   /**
    * Generates and returns a string representation of this deck.
    * @return a string representation of this deck.
    */
   @Override
   public String toString()
   {
      String rtn = "size = " + size + "\nUndealt cards: \n";

      for (int k = size - 1; k >= 0; k--)
      {
         rtn = rtn + cards.get(k);
         if (k != 0)
         {
            rtn = rtn + ", ";
         }
         if ((size - k) % 2 == 0)
         {
            // Insert carriage returns so entire deck is visible on console.
            rtn = rtn + "\n";
         }
      }

      rtn = rtn + "\nDealt cards: \n";
      for (int k = cards.size() - 1; k >= size; k--)
      {
         rtn = rtn + cards.get(k);
         if (k != size)
         {
            rtn = rtn + ", ";
         }
         if ((k - cards.size()) % 2 == 0)
         {
            // Insert carriage returns so entire deck is visible on console.
            rtn = rtn + "\n";
         }
      }
      rtn = rtn + "\n";
      return rtn;
   }
}
