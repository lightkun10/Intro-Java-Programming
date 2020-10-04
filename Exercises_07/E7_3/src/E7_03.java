import java.util.Scanner;

public class E7_03 {
    public static void main(String[] args) {
        /* Take number input from user, store it in array. */
        Scanner scanner = new Scanner(System.in);
        // new Array
        int[] numbers = new int[51];

        // Take user input
        takeInput(scanner, numbers);

        /* Count the occurence of numbers. */
        countNumbers(numbers);
    }

    public static void takeInput(Scanner scanner, int[] array) {
        System.out.println("Enter the integers between 1 and 50.\n0 means done:");
        for (int i = 0; i < array.length; i++) {
            int scanInt = Integer.parseInt(scanner.nextLine());
            // If user input 0, break the loop
            if (scanInt <= 0 || scanInt > array.length) {
                break;
            }

            // Otherwise, increment the same index as user input on the array
            array[scanInt]++;
        }
    }

    public static void countNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            String times = array[i] > 1 ? "times" : "time";

            if (array[i] > 0) {
                System.out.println(i + " occurs " + array[i] + " " + times);
            }
        }
    }
}