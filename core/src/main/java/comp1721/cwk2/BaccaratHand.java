package comp1721.cwk2;

import java.util.LinkedList;

public class BaccaratHand {
     private LinkedList<BaccaratCard> bac;

    public BaccaratHand(){
       bac = new LinkedList<>();
    }

    public int size(){
        return bac.size();
        // Returns the size of the LinkedList
    }

    public void add(Card card){
        // Adds a card to the LinkedList
        bac.add(new BaccaratCard(card.getRank(),card.getSuit()));
    }

    public int value(){
        int sum = 0;
        for (int i =0; i < bac.size(); i++){
            sum += bac.get(i).value();
        }
        // Gets the value of the cards in the hand MOD 10
        return sum%10;
    }

    public boolean isNatural(){
       int total = 0;
       if (bac.size() == 0){
           return false;
       }else{
           for (int i =0; i < bac.size(); i++){
               total += bac.get(i).value();
           }
           total = total %10;

           return total == 8 || total == 9;
           // Checks whether a hand is natural, and returns true/false
       }


    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        for (int i=0; i<bac.size();i++) {
            if (i < bac.size()-1){
                s.append(bac.get(i).getRank().getSymbol()).append(bac.get(i).getSuit().getSymbol())
                        .append(" ");
            }else{
                s.append(bac.get(i).getRank().getSymbol()).append(bac.get(i).getSuit().getSymbol());
            }
            // Gives the 2 Character representation of each Card in the BaccaratHand
        }
        return s.toString();
    }
    public BaccaratCard getIndex(int index){
        if (index < bac.size()){
            return bac.get(index);
        }else{
            return null;
        }
        // Attempts to get the index of a Card in the LinkedList, provided the index is valid

    }
}



// Implement the BaccaratHand class here
