package E7_22;

import java.util.Scanner;

public class Exercise7_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String line = in.next();

        int vowels = 0;

        for (int i = 0; i < line.length(); i++) {
            // convert user input string to all lowercase
            char cur = Character.toLowerCase(line.charAt(i));
            if ((cur == 'a') || (cur == 'e') || (cur == 'i') 
                || (cur == 'o') || (cur == 'u')) 
            {
                vowels++;
            }
        }

        System.out.println("The number of vowels in the string: " + vowels);
    }
}
