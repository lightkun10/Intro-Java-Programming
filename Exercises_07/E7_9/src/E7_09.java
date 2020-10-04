import java.util.Scanner;

/**
 * Find the largest element
*/
public class E7_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] doubles = new double[10];

        System.out.print("Enter ten numbers: ");
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = Double.parseDouble(input[i]);
        }

        System.out.println("The maximum number is: " + (int)max(doubles));
    }

    public static double max(double[] array) {
        double max = 0;
        for (int i = 0 ; i < array.length; i++) {
            if (max < array[i]) { max = array[i]; }
        }

        return max;
    }
}