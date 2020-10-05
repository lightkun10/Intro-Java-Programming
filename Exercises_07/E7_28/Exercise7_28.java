package E7_28;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise7_28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        

        /**
         * The number of permutations of n distinct objects taken 
         * r at a time, denoted by P(n,r) , where repetitions are not allowed
         */


        // int[] randomizedInts = randomUniqueIntsArray(4, 0, 10);
        // System.out.println(Arrays.toString(randomizedInts));

        // for (int i = 0; i < randomizedInts.length; i++) {
        //     for (int j = 0; j < randomizedInts.length; j++) {
        //         if (i != j) {
        //             System.out.println(randomizedInts[i] + " " + randomizedInts[j]);
        //         }
        //     }
        // }
    }

    /** Generate array of random integers. */
    public static int[] randomUniqueIntsArray(int elements, int lowBound, int highBound) {
        int range = highBound - lowBound + 1;

        if (range >= elements) {
            int[] randoms = new int[elements];
            Arrays.fill(randoms, Integer.MAX_VALUE);
            for (int i = 0; i < randoms.length; ) {
                int randomCandidate = randomInt(range) + lowBound;
                if (!arrContains(randoms, randomCandidate)) {
                    randoms[i] = randomCandidate;
                    i++;
                }
            }
            return randoms;
        } else {
            return null;
        }
    }

    /** Generate random integer. */
    public static int randomInt(int highBound) { // high bound is exclusive, low bound is 0
        return new Random().nextInt(highBound);
    }

    /** Returns condition where a certain number is in an array that provided. */
    public static boolean arrContains(int[] array, int number) {
        for (int i1 : array) {
            if (i1 == number) {
                return true;
            }
        }
        return false;
    }
}