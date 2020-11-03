package E8_6;

import java.util.Scanner;

public class E8_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final int N = 3; // The size of matrix
        
        System.out.print("Enter matrix1: ");
        double[][] matrix1 = new double[N][N];
        for(int i=0; i < matrix1.length; i++) {
            for(int j=0; j < matrix1[i].length; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }

        System.out.print("Enter matrix2: ");
        double[][] matrix2 = new double[N][N];
        for(int i=0; i < matrix2.length; i++) {
            for(int j=0; j < matrix2[i].length; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }

        input.close();

        //multiplyMatrix(matrix1, matrix2);
        double[][] resultMatrix = multiplyMatrix(matrix1, matrix2);
        printResult(matrix1, matrix2, resultMatrix);
    }

    public static double[][] multiplyMatrix(double[][] m1, double[][] m2) {

        /**
         * To multiply matrix a by matrix b, the number of columns 
         * in a must be the same as the number of rows in b, and 
         * the two matrices must have elements of the same or 
         * compatible types. Let c be the result of the 
         * multiplication. Assume the column size of matrix a is n. 
         * Each element cij is ai1 * b1j + ai2 * b2j + ... + ain * bnj.
         */
        
        double[][] total = new double[m1.length][m2[0].length];

        /**
         * let kij = total.
         * where kij = (ai1 * b1j) + (ai2 * b2j) + (ai3 * b3j).
         */
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                for (int k = 0; k < m2[0].length; k++) {
                    total[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        return total;
    }

    public static void printResult(double[][] m1, double[][] m2, double[][] m3) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                System.out.print(" " + m1[i][j]);
            }

            // Decide when and where should I insert the symbol operation.
            if (i == m1.length / 2) {
                System.out.print(" " + "+" + " ");
            } else {
                System.out.print("     ");
            }

            for (int j = 0; j < m2[0].length; j++) {
                System.out.print(" " + m2[i][j]);
            }

            if (i == m1.length / 2) {
                System.out.print(" = ");
            } else {
                System.out.print("     ");
            }

            for (int j = 0; j < m3[0].length; j++) {
                System.out.print(" " + m3[i][j]);
            }

            System.out.println();
        }
    }
    
}
