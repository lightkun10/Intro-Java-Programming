import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Statistics: compute deviation
 */
public class E7_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] integers = new double[10];

        System.out.print("Enter 10 numbers: ");
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i< integers.length; i++) {
            integers[i] = Double.parseDouble(input[i]);
        }

        System.out.println("The mean is " + mean(integers));
        System.out.println("The standard deviation is " + deviation(integers));
    }

    /** Compute the mean of an array of double values */
    public static double mean(double[] x) {
        // Mean: total values / count of values
        double total = 0;
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
            count++;
        }

        return round(total / count, 2);
    }

    /** Compute the deviation of double values */
    public static double deviation(double[] x) {
        double mean = mean(x);
        double total = 0;
        int count = 0;

        for (int i = 0; i < x.length; i++) {
            //double rounded = round(x[i] - mean, 2);
            double rounded = x[i] - mean;
            total += Math.pow(rounded, 2);
            count++;
        }

        return Math.sqrt(total / count);
    }

    /*
    Round a double to 2 decimal places:
    https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
    */
    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
