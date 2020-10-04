package E7_21;

import java.util.Arrays;
import java.util.Scanner;

/**
 * (Normalizing integers) Write a program that prompts 
 * the user to enter 10 integers, and normalizes the 
 * integers to be in the range of 0 to 1 by dividing every 
 * integer with the largest integer. Display the 10 
 * normalized real-valued numbers.
 */
public class Exercise7_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ints = new int[10];   // 10 integers

        int b = 0; // For storing biggest number

        System.out.print("Enter 10 real numbers: ");
        String[] inputs = in.nextLine().split(" "); // Storing user inputs
        for (int i = 0; i < ints.length; i++) {
            int numI = Integer.parseInt(inputs[i]);

            if (b < numI) { b = numI; }
            ints[i] = numI;
        }

        int[] zo = new int[ints.length]; // For storing the 0s and 1s
        for (int i = 0; i < ints.length; i++) {
            zo[i] = ints[i] / b;
        }

        for (int i = 0; i < zo.length; i++) {
            System.out.print(zo[i] + " ");
        }
    }
}