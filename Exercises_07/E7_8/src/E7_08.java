import java.util.Arrays;
import java.util.Scanner;

public class E7_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[10];
        double[] doubles = new double[10];

        System.out.print("Enter 10 double values, separated with a space: ");
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        for (int i = 0; i < integers.length; i++) {
            integers[i] = Integer.parseInt(inputs[i]);
            doubles[i] = Double.parseDouble(inputs[i]);
        }

        average(integers);
        average(doubles);
    }

    public static int average(int[] array) {
        // average = total sum / all element
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            count++;
        }

        return sum / count;
    }

    public static double average(double[] array) {
        double sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            count++;
        }

        return sum / count;
    }
}
