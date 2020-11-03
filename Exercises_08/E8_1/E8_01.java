package E8_1;

import java.util.Arrays;
import java.util.Scanner;

public class E8_01 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        double[][] m = new double[3][4];
        
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        System.out.println("Sum of the elements at row 0 is " + sumRow(m, 0));
        System.out.println("Sum of the elements at row 1 is " + sumRow(m, 1));
        System.out.println("Sum of the elements at row 2 is " + sumRow(m, 2));
    }

    public static double sumRow(double[][] m, int rowIndex) {

        double sum = 0;
        for (int k = 0; k < m[rowIndex].length; k++) {
            sum += m[rowIndex][k];
        }
        
        return sum;
    }

    // 1.5 2 3 4
    // 5.5 6 7 8
    // 9.5 1 3 1
}