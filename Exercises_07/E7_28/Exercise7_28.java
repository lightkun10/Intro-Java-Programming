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
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                for (int k = 0; k < ints.length; k++) {
                    for (int l = 0; l < ints.length; l++) {
                        if (i != j && i != k && i != l && 
                            j != k && j!= l && k != l) {
                            System.out.println(i + " " + j + " " + k + " " + l);
                        }
                    }
                }
            }
        }
        

    }
}