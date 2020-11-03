package E8_2;

import java.util.Scanner;

public class E8_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[][] doubles = new double[4][4]; 

        System.out.println("Enter 4 by 4 matrix row by row:");
        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles.length; j++) {
                doubles[i][j] = input.nextDouble();
            }
        }

        System.out.println("Average of the elements in the major diagonal is: " + averageMajorDiagonal(doubles));
    }

    public static double averageMajorDiagonal(double[][] m) {

        double total = 0; 
        for (int i = 0; i < m.length; i++) {
            total += m[i][i];
        }

        return total / m.length;
    }
}
