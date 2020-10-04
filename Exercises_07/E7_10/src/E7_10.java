import java.util.Scanner;

public class E7_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[10];

        System.out.print("Enter ten numbers: ");
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < integers.length; i++) {
            integers[i] = Integer.parseInt(input[i]);
        }

        int indexLargest = indexOfLargestElement(integers);
        System.out.println("Largest element: " + integers[indexLargest]
                            + ", index " + indexLargest);
    }

    public static int indexOfLargestElement(int[] array) {
        int max = 0;
        int index = 0;
        for (int i = 0 ; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }

        return index;
    }
}
