package E7_30;

import java.util.Scanner;

/*****************************************************************
 * (Pattern recognition: consecutive four equal numbers)         *
 * Write the following method that tests whether the array       *
 * has four consecutive numbers with the same value.             *
 * Write a test program that prompts the user to enter a         *
 * series of integers and displays it if the series contains     *
 * four consecutive numbers with the same value.                 *
 ****************************************************************/

public class Exercise7_30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        final int N = in.nextInt();
        int[] nums = new int[N];
        
        System.out.print("Enter the values: ");
        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }

        if(isConsecutiveFour(nums)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }
    }

    public static boolean isConsecutiveFour(int[] values) {

        // Outer loop will going to look at 
        // each group of four numbers in the array
        // No need to iterate through the end of array,
        // because I only need the adjacent of current 
        // value to be true.
        for (int i=0; i < values.length-3; i++) {
            boolean isEqual = true;

            // Make sure that the current value
            // is the same as the next value
            // Start the inner loop at the same point
            // as the outer loop
            for (int j=i; i < i+3; j++) {
                if (values[j] != values[j+1]) {
                    isEqual = false;
                    break; // No need to iterate through, if next is not the same
                }
            }

            // If it found the consecutive group
            if (isEqual) return true;
        }

        // If it get all the way through outer loop,
        // with no group found, return false
        return false;
    }
}
