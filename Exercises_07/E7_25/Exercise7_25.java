package E7_25;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise7_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double values[] = new Double[3];

        System.out.print("Enter a, b, c: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = in.nextDouble();
        }

        solveQuadratic(values);
    }

    private static void solveQuadratic(Double[] values) {
        double a = values[0], b = values[1], c = values[2];

        DecimalFormat df = new DecimalFormat("###.######");

        double discriminant = Math.pow(b, 2) - (4 * (a * c));
        /**
         * If discriminant is positive, the equation 
         * has two real roots. If it is zero, the 
         * equation has one root. If it is negative, 
         * the equation has no real roots.
         */
        if (discriminant > 0) {
            double r1 = (-b + (Math.pow(discriminant, 0.5))) / 2 * a;
            double r2 = (-b - (Math.pow(discriminant, 0.5))) / 2 * a;
            System.out.println("The equation has two roots: " + df.format(r1) + 
                " and " + df.format(r2));
        } else if (discriminant == 0) {
            double r = (-b + (Math.pow(discriminant, 0.5))) / 2 * a;
            System.out.println("The equation has one root: " + r);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}