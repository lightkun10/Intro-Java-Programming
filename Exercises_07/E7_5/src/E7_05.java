import java.util.Scanner;
import java.util.Random;

public class E7_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[100];

        System.out.println("Enter numbers:");
        for (int i = 0; i < integers.length; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input <= 0) {
                break;
            }
            integers[i] = input;
        }

        int odds = 0;
        int evens = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0 && integers[i] > 0) {
                evens++;
            } else if (integers[i] % 2 != 0 && integers[i] > 0) {
                odds++;
            }
        }


        System.out.println("The number of odd " + (odds > 1 ? "numbers: " : "number: ") + odds
                + "\nThe number of even " + (evens > 1 ? "numbers: " : "number: ") + evens);
    }
}
