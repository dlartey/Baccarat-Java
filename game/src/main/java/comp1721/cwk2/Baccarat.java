package comp1721.cwk2;

import java.io.IOException;

public class Baccarat {
    public static void main(String[] args) throws IOException {
        Shoe sixDeck = new Shoe(6);
        sixDeck.shuffle();
        BaccaratHand player = new BaccaratHand();
        BaccaratHand banker = new BaccaratHand();
        // Creates 2 new players - Banker and Player

        player.add(sixDeck.deal());
        banker.add(sixDeck.deal());
        player.add(sixDeck.deal());
        banker.add(sixDeck.deal());
        // Deals 2 cards for both the Player and the Banker initially

        if (player.isNatural() || banker.isNatural()){
            // Checks whether either the Player or Banker have a natural
            System.out.println("Player: "+player.toString()+" = "+player.value());
            System.out.println("Banker: "+banker.toString()+" = "+banker.value());

            if (player.isNatural() && banker.isNatural()){
                // Checks whether both Player and Banker have a Natural
                if (player.value() > banker.value()){
                    System.out.println("Player has a Natural");
                }else if (player.value() < banker.value()){
                    System.out.println("Banker has a Natural");
                }else{
                    System.out.println("Draw");
                }
            }else{
                if (player.value() > banker.value()){
                    System.out.println("Player has a Natural");
                }if (player.value() < banker.value()){
                    System.out.println("Banker has a Natural");
                }
            }

        }else{
            // If neither have a natural, consult the rest of the table rules
            if (player.value() < 6){
                player.add(sixDeck.deal());
                // Draw another card for the player
                // if they have a total of 0-5
            }

            if (player.size() == 2){
                if (banker.value() < 6){
                    // Banker draws if player stood pat
                    banker.add(sixDeck.deal());
                }
            }else {
                // If player drew 3rd card Banker draws 3rd card
                if (banker.value() <= 2 && banker.size() == 2){
                    // Banker draws 3rd card regardless of player's third card
                    banker.add(sixDeck.deal());
                }if (banker.value() == 3 && banker.size() == 2){
                    if (player.getIndex(2).value() != 8){
                        // Banker draws third card unless player's third card
                        // was an 8
                        banker.add(sixDeck.deal());
                    }
                }
                if (banker.value() == 4 && banker.size() == 2){
                    if (player.getIndex(2).value() == 2
                            ||player.getIndex(2).value() == 3 ||
                            player.getIndex(2).value() == 4 ||
                            player.getIndex(2).value() == 5 ||
                            player.getIndex(2).value() == 6 ||
                            player.getIndex(2).value() == 7){
                        // Banker draws third card if the player's third card
                        // was 2, 3, 4, 5, 6, 7
                        banker.add(sixDeck.deal());
                    }
                }
                if (banker.value() == 5 && banker.size() == 2){
                    if (player.getIndex(2).value() == 4 ||
                            player.getIndex(2).value() == 5 ||
                            player.getIndex(2).value() == 6 ||
                            player.getIndex(2).value() == 7){
                        // Banker draws third card if the player's third card
                        // was 4, 5, 6, or 7
                        banker.add(sixDeck.deal());
                    }
                }
                if (banker.value() == 6 && banker.size() == 2){
                    if (player.getIndex(2).value() == 6 ||
                            player.getIndex(2).value() == 7){
                        // banker draws a third card if the player's third card
                        // was a 6 or 7
                        banker.add(sixDeck.deal());
                    }
                }
            }
            // Check whether either have a natural after the 3rd card has been drawn
            // then check who has the higher score

            if (player.isNatural() || banker.isNatural()){
                System.out.println("Player: "+player.toString()+" = "+player.value());
                System.out.println("Banker: "+banker.toString()+" = "+banker.value());

                if (player.isNatural() && banker.isNatural()){
                    if (player.value() > banker.value()){
                        System.out.println("Player has a Natural");
                    }else if (player.value() < banker.value()){
                        System.out.println("Banker has a Natural");
                    }else{
                        System.out.println("Draw");
                    }
                }

                if (player.value() > banker.value()){
                    System.out.println("Player has a Natural");
                }if (player.value() < banker.value()){
                    System.out.println("Banker has a Natural");
                }



            }else {
                if (player.value() > banker.value()){
                    System.out.println("Player: "+player.toString()+" = "+player.value());
                    System.out.println("Banker: "+banker.toString()+" = "+banker.value());
                    System.out.println("Player wins");
                }else if (banker.value() > player.value()){
                    System.out.println("Player: "+player.toString()+" = "+player.value());
                    System.out.println("Banker: "+banker.toString()+" = "+banker.value());
                    System.out.println("Banker wins");
                }else{
                    System.out.println("Player: "+player.toString()+" = "+player.value());
                    System.out.println("Banker: "+banker.toString()+" = "+banker.value());
                    System.out.println("Draw");
                }
            }

        }

    }



}
