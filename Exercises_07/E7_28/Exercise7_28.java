package E7_28;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise7_28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] ints = new int[4];
        System.out.print("Enter four numbers: ");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = s.nextInt();
        }

        /**
         * The number of permutations of n distinct objects taken 
         * r at a time, denoted by P(n,r) , where repetitions are not allowed
         */
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if (i == j) continue;
                for (int k = 0; k < ints.length; k++) {
                    if ((i == k) || (j == k)) continue;
                    for (int l = 0; l < ints.length; l++) {
                        if ((i == l) || (j == l) || (k == l)) continue;
                        System.out.println(ints[i] + " " + ints[j] + " " + ints[k] + " " + ints[l]);
                        count++;
                    }
                }
            }
        }

        System.out.println("Possible ways of arranging 4 integers: " + count);
    }
}