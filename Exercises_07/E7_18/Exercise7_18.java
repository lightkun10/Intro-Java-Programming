package E7_18;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] doubles = new double[10];

        System.out.print("Enter 10 doubles: ");
        String[] inputs = input.nextLine().split(" ");
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = Double.parseDouble(inputs[i]);
        }

        // 8.9 9.0 7.8 8.8 7.7 6.5 6.7 6.7 8.8 6.7 7.8

        bubbleSort(doubles);
        System.out.println(Arrays.toString(doubles));
    }

    // https://www.geeksforgeeks.org/bubble-sort/
    // Inspired by Nikita Tiwari.
    public static void bubbleSort(double[] arr) {
        double temp;
        boolean changed;

        for (int i = 0; i < arr.length - 1; i++) {
            changed = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j + 1] 
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    changed = true;
                }
            }

            // IF no two elements were  
            // swapped by inner loop, then break the loop
            if (changed == false) {
                break;
            }
        }
    }
}