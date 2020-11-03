package E8_10;

import java.util.Random;

public class E8_10 {

    public static int MATRIX = 5;
    
    public static void main(String[] args) {

        int[][] fiveByFive = new int[MATRIX][MATRIX];
        
        for (int i = 0; i < MATRIX; i++) {
            for (int j = 0; j < MATRIX; j++) {
                fiveByFive[i][j] = randomInt(0, 2);
            }
        }

        for (int i = 0; i < MATRIX; i++) {

            for (int j = 0; j < MATRIX; j++) {

                System.out.print(fiveByFive[i][j] + " ");
            }
            System.out.println();
        }

        // Check rows
        int largestRowIndex = 0;
        int rowSum = sumOfRow(fiveByFive[0]);
        for (int i = 1; i < fiveByFive.length; i++) {
            if (sumOfRow(fiveByFive[i]) > rowSum) {
                rowSum = sumOfRow(fiveByFive[i]);
                largestRowIndex = i;
            }
        }
        System.out.println("The largest row index: " + largestRowIndex);

        // Check columns
        int largestColIndex = 0;
        int colSum = sumOfCol(fiveByFive, 0);

        for (int i = 1; i < fiveByFive.length; i++) { // traverse through every row
            if (colSum < sumOfCol(fiveByFive, i)) { //  check every column of row
                colSum = sumOfCol(fiveByFive, i);
                largestColIndex = i;
            }
        }
        System.out.println("The largest column index: " + largestColIndex);
    }

    public static int sumOfRow(int[] row) {
        int sum = 0;

        for (int i = 0; i < row.length; i++) {
            sum += row[i];
        }

        return sum;
    }

    public static int sumOfCol(int[][] matrix, int col) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][col];
        }

        return sum;
    }

    public static int randomInt(int lowBound, int highBound) {

        return lowBound + new Random().nextInt(highBound - lowBound);
    }
}