package E7_20;

import java.util.Arrays;
import java.util.Scanner;

/*
(Descending Bubble Sort) Modify the bubble sort method of Programming
Exercise 7.18, and sort the elements in the array in 
descending order instead of ascending order. Write a test program 
that reads 10 double numbers, invokes the method, and displays 
the sorted numbers in descending order
*/

public class Exercise7_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] db = new double[10];  // array of 10 doubles

        System.out.print("Enter 10 doubles: ");
        String[] inputs = in.nextLine().split(" ");
        for (int i = 0; i < db.length; i++) {
            db[i] = Double.parseDouble(inputs[i]);
        }

        // 8.9 9.0 7.8 8.8 7.7 6.5 6.7 6.7 8.8 6.7 7.8
        descendingBubbleSort(db);
        System.out.println(Arrays.toString(db));
    }

    public static void descendingBubbleSort(double[] db) {
        double temp; // storing the soon-be-moved value

        for (int i = 0; i < db.length; i++) {
            for (int j = 0; j < db.length - i - 1; j++) {
                if (db[j] < db[j + 1]) {
                    temp = db[j];
                    db[j] = db[j + 1];
                    db[j + 1] = temp;
                }
            }
        }
    }
}