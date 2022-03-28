package comp1721.cwk2;

public class BaccaratCard extends Card {

    private Rank rank;
    private Suit suit;

    public BaccaratCard(Rank r, Suit s) {
        super(r,s);
        rank = r;
        suit = s;
    }

    @Override
    public Rank getRank() {
        return super.getRank();
        // Gets the Rank of the card from the superclass
    }

    public Suit getSuit() {
        return super.getSuit();
    }

    @Override
    public String toString() {
        return String.valueOf(rank.getSymbol()) + suit.getSymbol();
        // Provides the two character implementation of the string
    }

    @Override
    public boolean equals(Object other) {
        return super.equals(other);
        // Checks whether two objects are equal to another

    }

    @Override
    public int hashCode() {
        return super.hashCode();
        //return Objects.hash(rank, suit);
    }

    public int value() {
        return super.value()%10;
        // Gets the value of a card

    }

    public int compareTo(Card other) {
        return super.compareTo(other);
        // Compares a Card to another Card
    }
}
// Implement the BaccaratHand class here
