package E8_14;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class E8_14 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // Ask for the size of matrix
        System.out.print("Enter the size for the matrix: ");
        int matrix = input.nextInt();
        
        // Randomly fills in 0s and 1s into the matrix
        int[][]matrices = matrices(matrix);

        // Print the matrix
        printMatrices(matrices);
        
        // Finds the rows, columns, and diagonals with all 0s and 1s
        exploreMatrix(matrices);
    }

    public static void exploreMatrix(int[][] m) {
        // Find rows
        int[][] sameRowColDiag = new int[4][2];

        for (int i = 0; i < m.length; i++) {
            // int sameRow = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 0) {
                    // int v = m[i][j];
                    sameRowColDiag[i][0]++;
                }
                else if (m[i][j] == 1) {
                    sameRowColDiag[i][1]++;
                }
            }
        }
        checkRow(sameRowColDiag, m[0].length);

        // Find columns FIXME
    }

    public static void checkRow(int[][] sameRows, int matrixLength) {
        int sameRow = 0;
        for (int i = 0; i < matrixLength; i++) {
            if (sameRows[i][0] == matrixLength) {
                System.out.println("All " + 0 + "s on row " + i);
                sameRow++;
            }
            else if (sameRows[i][1] == matrixLength) {
                System.out.println("All " + 1 + "s on row " + i);
                sameRow++;
            }
        }
        if (sameRow <= 0) {
            System.out.println("No same numbers on a row");
        }
    }


    // Simulate a matrix
    public static int[][] matrices(int matrix) {
        int[][] a = new int[matrix][matrix];

        for (int i = 0; i < matrix; i++) {
            for (int j = 0; j < matrix; j++) {
                a[i][j] = randomInt(0, 2);
            }
        }

        return a;
    }

    // Print the particular matrix
    public static void printMatrices(int[][] matrices) {
        for (int i = 0; i < matrices.length; i++) {
            for (int j = 0; j < matrices[i].length; j++) {
                System.out.print(matrices[i][j]);
            }
            System.out.println();
        }
    }



    public static int randomInt(int lowBound, int highBound) {

        return lowBound + new Random().nextInt(highBound - lowBound);
    }
}
