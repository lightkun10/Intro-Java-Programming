package E8_5;

import java.util.Arrays;
import java.util.Scanner;

public class E8_05 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix1 = new double[2][2];
        double[][] matrix2 = new double[2][2];

        System.out.print("Enter matrix1: ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }

        System.out.print("Enter matrix2: ");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }

        double[][] sumMatrix = addMatrix(matrix1, matrix2);

        System.out.println("Total matrices:");
        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[i].length; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static double[][] addMatrix(double[][] a, double[][] b) {

        double[][] sumMtx = new double[2][2];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sumMtx[i][j] = a[i][j] + b[i][j];
            }
        }

        return sumMtx;
    }
    
}
