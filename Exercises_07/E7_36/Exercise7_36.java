package E7_36;

import java.util.Arrays;

public class Exercise7_36 {

    final public static int NO_OF_QUEENS = 8;

    public static void main(String[] args) {
        // Queens positions
        int[] queens = new int[NO_OF_QUEENS]; // queens are placed at (i, queens[i])

        queens[0] = 0;  // Initially, place a queen at (0, 0) in the 0th row

        for (int i = 1; i < NO_OF_QUEENS; i++) {
            queens[i] = -1;  // No queen placed, yet
        }

        int traversingRow = 1; // Start from row index 1
        while (traversingRow >= 0 && traversingRow <= 7) {  // from index 0 to 7

            int traversingColumn = findPosition(traversingRow, queens);

            if (traversingColumn < 0) {
                queens[traversingRow] = -1;
                traversingRow--; // back track to the previous row
            } else {
                queens[traversingRow] = traversingColumn;
                traversingRow++; // "walk" the row
            }

        }
        
        printBoard(queens);
    }

    public static int findPosition(int traversingRow, int[] queens) {

        int start = queens[traversingRow] < 0 ? 0 : queens[traversingRow]+1;

        for (int j = start; j < NO_OF_QUEENS; j++) {
            if (posValid(traversingRow, j, queens)) { // 1,0
                return j; // (k, j) is the place to put the queen now.
            }
        }

        return -1;
    }

    /** Return true if a queen can be placed at (k, j) */
    public static boolean posValid(int traversingRow, int j, int[] board) {

        // See if (k, j) is a possible position
        // Check jth column
        for (int i = 0; i < traversingRow; i++) {
            if (board[i] == j) {
                return false;
            }
        }

        // Check major diagonal
        for (int row = traversingRow-1, column = j-1; row >= 0 && column >= 0; row--, column--) {
            if (board[row] == column) {
                return false;
            }
        }

        // Check minor diagonal
        for (int row = traversingRow-1, column = j+1; 
                row >= 0 && column <= NO_OF_QUEENS-1; row--, column++) {
            if (board[row] == column) {
                return false;
            }
        }

        return true;
    }



/** Print a two-dimensional board to display the queens */
    public static void printBoard(int[] board) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i]; j++) {
                System.out.print("| ");
            }

            System.out.print("|Q|");

            for (int j = board[i] + 1; j < 8; j++) {
                System.out.print(" |");
            }

            System.out.println();
        }

    }

}