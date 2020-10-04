package E7_24;

/****************************************************************
 * 7.24 (Simulation: coupon collector’s problem) 
 * Coupon collector is a classic statistics problem with many 
 * practical applications. The problem is to repeatedly pick 
 * objects from a set of objects and find out how many picks 
 * are needed for all the objects to be picked at least once. 
 * A variation of the problem is to pick cards from a shuffled 
 * deck of 52 cards repeatedly, and find out how many picks are 
 * needed before you see one of each suit. Assume a picked card 
 * is placed back in the deck
*****************************************************************/

public class Exercise7_24 {
    public static void main(String[] args) {
        
        /**  How many cards are in a deck */
        final int NUMBER_OF_CARDS = 52;

        /** 
         * String arrays to keep track of what each card is.
         * Easier and shorter than having a 52-element array 
         * for each cards. 
         */
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", 
                "9", "10", "Jack", "Queen", "King"};    // why the random index is divided/modulo by 13, 
                                                        // because all cards has 13 different ranks.
        
        
        /** Store suits that being founded. */
        boolean[] found = new boolean[4];

        /** Keep track of how many different set picked. */
        int numberOfPicks = 0;
        
        /** 
         * Count how many DIFFERENT suits already seen.
         * If count didn't specified, I have to check 
         * each element in the array, each time through the loop.
         */
        int count = 0;

        /** Do the simulation four times */
        while (count < 4) {
            numberOfPicks++;
            /** 
             * Generate random index from the deck of cards 
             * Imagine shuffling the cards, and picking the top one. 
             */
            int index = (int) (Math.random() * NUMBER_OF_CARDS);
            /**
             * let suitOfCard: random picked number of card divided
             *                 by ranks of cards, index / 13.
             * let rankOfCard: random picked number of card modulo 
             *                 by ranks of cards, index % 13;
             */
            if (!found[index / 13]) {
                found[index / 13] = true;   // push to 'found' array, mark as founded.
                count++;

                /** Prints only the different sets */
                String suit = suits[index / 13];
                String rank = ranks[index % 13];
                System.out.println(rank + " of " + suit);
            }

            /** Prints all picked cards */
            // String suit = suits[index / 13];
            // String rank = ranks[index % 13];
            // System.out.println(rank + " of " + suit);
        }

        System.out.println("Number of picks: " + numberOfPicks);
    }

    
}