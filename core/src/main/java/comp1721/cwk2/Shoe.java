package comp1721.cwk2;

import java.util.Collections;
import java.util.LinkedList;

public class Shoe {
        // Shoe contains 6-8 card decks, which contain BacaratCards
        private LinkedList<BaccaratCard> shoe;

        public Shoe(int decks) {
                if (decks == 6 || decks == 8) {
                        // Checks whether there are 6 or 8 decks
                        shoe = new LinkedList<>();
                        for (int i = 0; i < decks; i++) {
                                // Loops for the number of decks, and adds all 52 cards
                                shoe.add(new BaccaratCard(Card.Rank.ACE, Card.Suit.CLUBS));
                                shoe.add(new BaccaratCard(Card.Rank.TWO, Card.Suit.CLUBS));
                                shoe.add(new BaccaratCard(Card.Rank.THREE, Card.Suit.CLUBS));
                                shoe.add(new BaccaratCard(Card.Rank.FOUR, Card.Suit.CLUBS));
                                shoe.add(new BaccaratCard(Card.Rank.FIVE, Card.Suit.CLUBS));
                                shoe.add(new BaccaratCard(Card.Rank.SIX, Card.Suit.CLUBS));
                                shoe.add(new BaccaratCard(Card.Rank.SEVEN, Card.Suit.CLUBS));
                                shoe.add(new BaccaratCard(Card.Rank.EIGHT, Card.Suit.CLUBS));
                                shoe.add(new BaccaratCard(Card.Rank.NINE, Card.Suit.CLUBS));
                                shoe.add(new BaccaratCard(Card.Rank.TEN, Card.Suit.CLUBS));
                                shoe.add(new BaccaratCard(Card.Rank.JACK, Card.Suit.CLUBS));
                                shoe.add(new BaccaratCard(Card.Rank.QUEEN, Card.Suit.CLUBS));
                                shoe.add(new BaccaratCard(Card.Rank.KING, Card.Suit.CLUBS));

                                shoe.add(new BaccaratCard(Card.Rank.ACE, Card.Suit.HEARTS));
                                shoe.add(new BaccaratCard(Card.Rank.TWO, Card.Suit.HEARTS));
                                shoe.add(new BaccaratCard(Card.Rank.THREE, Card.Suit.HEARTS));
                                shoe.add(new BaccaratCard(Card.Rank.FOUR, Card.Suit.HEARTS));
                                shoe.add(new BaccaratCard(Card.Rank.FIVE, Card.Suit.HEARTS));
                                shoe.add(new BaccaratCard(Card.Rank.SIX, Card.Suit.HEARTS));
                                shoe.add(new BaccaratCard(Card.Rank.SEVEN, Card.Suit.HEARTS));
                                shoe.add(new BaccaratCard(Card.Rank.EIGHT, Card.Suit.HEARTS));
                                shoe.add(new BaccaratCard(Card.Rank.NINE, Card.Suit.HEARTS));
                                shoe.add(new BaccaratCard(Card.Rank.TEN, Card.Suit.HEARTS));
                                shoe.add(new BaccaratCard(Card.Rank.JACK, Card.Suit.HEARTS));
                                shoe.add(new BaccaratCard(Card.Rank.QUEEN, Card.Suit.HEARTS));
                                shoe.add(new BaccaratCard(Card.Rank.KING, Card.Suit.HEARTS));


                                shoe.add(new BaccaratCard(Card.Rank.ACE, Card.Suit.SPADES));
                                shoe.add(new BaccaratCard(Card.Rank.TWO, Card.Suit.SPADES));
                                shoe.add(new BaccaratCard(Card.Rank.THREE, Card.Suit.SPADES));
                                shoe.add(new BaccaratCard(Card.Rank.FOUR, Card.Suit.SPADES));
                                shoe.add(new BaccaratCard(Card.Rank.FIVE, Card.Suit.SPADES));
                                shoe.add(new BaccaratCard(Card.Rank.SIX, Card.Suit.SPADES));
                                shoe.add(new BaccaratCard(Card.Rank.SEVEN, Card.Suit.SPADES));
                                shoe.add(new BaccaratCard(Card.Rank.EIGHT, Card.Suit.SPADES));
                                shoe.add(new BaccaratCard(Card.Rank.NINE, Card.Suit.SPADES));
                                shoe.add(new BaccaratCard(Card.Rank.TEN, Card.Suit.SPADES));
                                shoe.add(new BaccaratCard(Card.Rank.JACK, Card.Suit.SPADES));
                                shoe.add(new BaccaratCard(Card.Rank.QUEEN, Card.Suit.SPADES));
                                shoe.add(new BaccaratCard(Card.Rank.KING, Card.Suit.SPADES));

                                shoe.add(new BaccaratCard(Card.Rank.ACE, Card.Suit.DIAMONDS));
                                shoe.add(new BaccaratCard(Card.Rank.TWO, Card.Suit.DIAMONDS));
                                shoe.add(new BaccaratCard(Card.Rank.THREE, Card.Suit.DIAMONDS));
                                shoe.add(new BaccaratCard(Card.Rank.FOUR, Card.Suit.DIAMONDS));
                                shoe.add(new BaccaratCard(Card.Rank.FIVE, Card.Suit.DIAMONDS));
                                shoe.add(new BaccaratCard(Card.Rank.SIX, Card.Suit.DIAMONDS));
                                shoe.add(new BaccaratCard(Card.Rank.SEVEN, Card.Suit.DIAMONDS));
                                shoe.add(new BaccaratCard(Card.Rank.EIGHT, Card.Suit.DIAMONDS));
                                shoe.add(new BaccaratCard(Card.Rank.NINE, Card.Suit.DIAMONDS));
                                shoe.add(new BaccaratCard(Card.Rank.TEN, Card.Suit.DIAMONDS));
                                shoe.add(new BaccaratCard(Card.Rank.JACK, Card.Suit.DIAMONDS));
                                shoe.add(new BaccaratCard(Card.Rank.QUEEN, Card.Suit.DIAMONDS));
                                shoe.add(new BaccaratCard(Card.Rank.KING, Card.Suit.DIAMONDS));
                        }

                }else {
                        throw new CardException("Invalid number of decks (Must be 6 or 8)");
                        // Throws an exception if the decks number is invalid
                }
        }





        public int size(){
                return shoe.size();
                // Returns the size of the shoe
        }

        public void shuffle(){
                Collections.shuffle(shoe);
                // Shuffles the deck
        }

        public Card deal(){
                if (shoe.size() == 0){
                        throw new CardException("There are no cards");
                }else{
                        Card temp = shoe.get(0);
                        shoe.remove(0 );
                        return temp;
                }
                // Removes the card from the first index from the deck

        }

}


// Implement the Shoe class here
