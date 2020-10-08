package E7_34;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine();
        
        // sort(s);
        System.out.print("The sorted string are: " + sort(s));
    }

    public static String sort(String s) {
        // Turn string into a char array
        char[] chars = s.toCharArray();

        // Sort char array
        Arrays.sort(chars);

        // Turn sorted char array into string
        return new String(chars);
    }
}