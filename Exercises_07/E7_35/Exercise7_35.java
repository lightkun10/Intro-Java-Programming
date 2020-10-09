package E7_35;

import java.util.Random;
import java.util.Scanner;

public class Exercise7_35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] words = {"write", "that", "program"};

        String rndWord = pickRandomWord(words);
        startGame(rndWord, in);

        // Keep playing until user input 'n'
        while (true) {
            System.out.print("Do you want to guess another word? Enter y or n > ");
            String input = in.nextLine();
            if (input.equals("y")) {
                startGame(rndWord, in);
            }
            
            else if (input.equals("n")) {
                break;
            }
        }

        System.out.println("Goodbye!");
        return;
    }

    public static void startGame(String words, Scanner in) {
        char[] guessArr = new char[words.length()]; // guessing, starting array
        for (int i = 0; i < guessArr.length; i++) {
            guessArr[i] = '*';
        }

        char[] charOri = words.toCharArray();
        
        int life = charOri.length + 1;
        int count = 0;

        while (true) {
            
            System.out.print("Enter a letter in word " + String.valueOf(guessArr) + " > ");
            char input = in.nextLine().charAt(0);

            int sameOccurence = 0;
            int noWord = 0;

            // Check for right answer
            for (int i = 0; i < charOri.length; i++) {
                if (charOri[i] == input && guessArr[i] != input) {
                    guessArr[i] = charOri[i];
                    count++;
                } else if (charOri[i] == input && guessArr[i] == input) {
                    sameOccurence++;
                } else if (charOri[i] != input) {
                    noWord++;
                }
            }

            //  Check for the same input
            if (sameOccurence > 0) {
                System.out.println(input + " is already in the word");
                sameOccurence = 0;
                life--;
            }

            // Check if no word in the array
            if (noWord >= charOri.length) {
                System.out.println(input + " is not in the word");
                life--;
            }

            // Check constantly if user win the game
            if (count == charOri.length) {
                System.out.println("You win!");
                break; 
            }

            if (life <= 0) {
                int unguessed = 0;
                for (int i = 0; i < guessArr.length; i++) {
                    if (guessArr[i] == '*') unguessed++;
                }

                System.out.println("The word is " + String.valueOf(charOri) + ".  You missed " + unguessed + " time");
                break;
            }
        }
    }



    /** Pick random word from array */
    public static String pickRandomWord(String[] words) {
        Random random = new Random();
        int randomIindex = random.nextInt(words.length);
        return words[randomIindex];
    }
}
