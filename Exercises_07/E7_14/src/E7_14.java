import math.Algebra;

import java.util.Scanner;

/*
Computing lcm.
Write a test program that prompts the user to enter five numbers,
invokes the method to find the lcm of these numbers, and displays the lcm.
*/
public class E7_14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter five number: ");
        String input = s.nextLine();
        String[] intStr = input.split(" ");
        int[] ints = new int[intStr.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(intStr[i]);
        }

        System.out.println("Least common multiple: " + Algebra.leastCommonMultiple(ints));
    }
}
