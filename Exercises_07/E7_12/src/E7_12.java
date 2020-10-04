import usefulmethods_panda.UsefulMethods;

import java.util.Arrays;
import java.util.Scanner;

public class E7_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[10];

        System.out.print("Enter 10 numbers: ");
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i< integers.length; i++) {
            integers[i] = Integer.parseInt(input[i]);
        }

        System.out.println("Before: ");
        System.out.println(Arrays.toString(integers));
        System.out.println();

        System.out.println("After: ");
        UsefulMethods.reverse(integers);
        System.out.println(Arrays.toString(integers));
    }
}
