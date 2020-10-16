package E7_36;

import java.util.Arrays;

/**
 * 4 queens puzzle in Java, using nested for loops.
 * https://ajayiyengar.com/2020/07/27/how-to-solve-the-4-queens-puzzle-in-java/
 */

public class FourQueens {

    public static int NO_OF_QUEENS = 4;

    public static void main(String[] args) {
        
        /** 
         * Declare a single dimension array called board and 
         * initialize all the values to -1 before start 
         * placing the queens one by one. 
         * The size is 4 since we need to place 4 queens.
         */
        int[] board = { -1, -1, -1, -1 };

        /** Dealing with the first Queen. */
        for (int i = 0; i < NO_OF_QUEENS; i++) {
            board[0] = i;  // this will assign the row number

            /** Dealing with the second Queen. */
            for (int j = 0; j < NO_OF_QUEENS; j++) {

                // Assigns the current iteration value to the 
                // board array element 1. This means it will 
                // contain a row value, starting from row 0 and 
                // moving on to row 3 until an appropriate 
                // position is found. The value at board[1] will 
                // represent position of the 2nd queen.
                board[1] = j;
                
                // Indicates the current column at which we want to place
                // the 2nd queen. The current column is column number 1
                if (noKill(board, 1)) {
                    
                    // If noKill function returns true, it means we found 
                    // a position for the 2nd queen and we move on to find 
                    // a position for the 3rd queen and so on.
                    for (int k = 0; k < NO_OF_QUEENS; k++) {
                        board[2] = k;

                        if (noKill(board, 2)) {
                            for (int l = 0; l < NO_OF_QUEENS; l++) {
                                board[3] = l;
                                
                                if (noKill(board, 3)) {

                                    // display queens
                                    displayQueens(board);
                                }
                            }
                        }
                    }

                }
            }
        }
    }

    private static boolean noKill(int[] board, int currentColumnOfQueen) {

        for (int i = 0; i < currentColumnOfQueen; i++) {

            // Same row
            if (board[i] == board[currentColumnOfQueen]) {
                return false;
            }

            // Diagonal
            /**
             * To get the row value, we access the board array 
             * since the board array contains the position of 
             * the row at a given column.
             */
            if ((currentColumnOfQueen - i) == Math.abs(board[currentColumnOfQueen] - board[i])) {
                return false;
            }

        }

        return true;
    }


    private static void displayQueens(int[] board) {

        System.out.println("-------------");

        for (int row = 0; row < board.length; row++) {
            
            for (int value : board) {
                // System.out.print(value);
                if (value == row) {
                    System.out.print("Q\t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
