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
        int[][] sameRow = new int[m[0].length][2];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 0) {
                    sameRow[i][0]++;
                }
                else if (m[i][j] == 1) {
                    sameRow[i][1]++;
                }
            }
        }
        checkRow(sameRow, m[0].length);

        // Find columns
        int[][] sameCol = new int[m[0].length][2];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[j][i] == 0) {
                    sameCol[i][0]++;
                }
                else if (m[j][i] == 1) {
                    sameCol[i][1]++;
                }
            }
        }
        checkCol(sameCol, m[0].length);

        // Find major diagonals
        int[][] sameMajDiag = new int[m[0].length][2];
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[j][j] == 0) {
                    sameMajDiag[i][0]++;
                }
                else if (m[j][j] == 1) {
                    sameMajDiag[i][1]++;
                }
            }
        }
        checkMajDiag(sameMajDiag, m[0].length);

        // Find sub-diagonals
        int[][] sameSubDiag = new int[m[0].length][2];
        // 03 12 21 30
        for (int i = 0, j = (m[0].length-1); j >= 0; i++, j--) {
            if (m[i][j] == 0) {
                sameSubDiag[i][0]++;
            }
            else if (m[i][j] == 1) {
                sameSubDiag[i][1]++;
            }
        }
        checkSubDiag(sameSubDiag, m[0].length);
    }

    public static void checkRow(int[][] sameRows, int matrixLength) {
        int sameRow = 0;
        for (int i = 0; i < matrixLength; i++) {
            if (sameRows[i][0] == matrixLength) {
                System.out.println("All " + 0 + "s on row " + (i+1));
                sameRow++;
            }
            else if (sameRows[i][1] == matrixLength) {
                System.out.println("All " + 1 + "s on row " + (i+1));
                sameRow++;
            }
        }
        if (sameRow <= 0) {
            System.out.println("No same numbers on a row");
        }
    }

    public static void checkCol(int[][] sameCols, int matrixLength) {
        int sameCol = 0;
        for (int i = 0; i < matrixLength; i++) {
            if (sameCols[i][0] == matrixLength) {
                System.out.println("All " + 0 + "s on column " + (i+1));
                sameCol++;
            }
            else if (sameCols[i][1] == matrixLength) {
                System.out.println("All " + 1 + "s on column " + (i+1));
                sameCol++;
            }
        }
        if (sameCol <= 0) {
            System.out.println("No same numbers on a column");
        }
    }

    public static void checkMajDiag(int[][] sameMajDiags, int matrixLength) {
        int sameMajDiag = 0;
        for (int i = 0; i < matrixLength; i++) {
            if (sameMajDiags[i][0] == matrixLength) {
                System.out.println("All " + 0 + "s on major diagonal");
                sameMajDiag++;
            }
            else if (sameMajDiags[i][1] == matrixLength) {
                System.out.println("All " + 1 + "s on major diagonal");
                sameMajDiag++;
            }
        }
        if (sameMajDiag <= 0) {
            System.out.println("No same numbers on the major diagonal");
        }
    }

    public static void checkSubDiag(int[][] sameSubDiags, int matrixLength) {
        int sameSubDiag = 0;
        for (int i = 0; i < matrixLength; i++) {
            if (sameSubDiags[i][0] == matrixLength) {
                System.out.println("All " + 0 + "s on sub-diagonal");
                sameSubDiag++;
            }
            else if (sameSubDiags[i][1] == matrixLength) {
                System.out.println("All " + 1 + "s on sub-diagonal");
                sameSubDiag++;
            }
        }
        if (sameSubDiag <= 0) {
            System.out.println("No same numbers on the sub-diagonal");
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
