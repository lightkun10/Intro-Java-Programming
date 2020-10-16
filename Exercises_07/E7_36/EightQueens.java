package E7_36;

/**
 * 8 queens puzzle in Java, using recursion.
 * https://ajayiyengar.com/2020/07/30/how-to-solve-the-n-queens-puzzle-in-java/
 */
public class EightQueens {

    public static int NO_OF_QUEENS = 8;

    public static void main(String[] args) {
        
        int[] board = new int[NO_OF_QUEENS];
        placeQueen(board, 0, NO_OF_QUEENS);
    }

    /**
     * Parameters:
     * 1. The "board" array, maintain the position of 
     *    queens placed on the board.
     * 2. A counter, "current", which will initially 
     *    be 0. This will track the number of queens 
     *    already placed on the board. Everytime one 
     *    queen is placed without a conflict, the value 
     *    will be incremented.
     * 3. "noOfQueens", is the number of queens that we want to place.
     */
    private static void placeQueen(int[] board, int current, int noOfQueens) {
        
        /** 
         * Base case
         * If we have placed all queens, we return from the function.
         */
        if (current == noOfQueens) {
            displayQueens(board);
            return;
        }

        /**
         * The ‘for’ loop iterates ‘N’ times, the number of queens 
         * supplied as input.The first step to solve this puzzle 
         * is to place the first queen at the top left corner and 
         * then place other queens in other columns. But what is 
         * important to remember is that the first queen itself will 
         * take 8 different positions.
         */
        for (int i = 0; i < noOfQueens; i++) {

            /**
             * Fixes the position of the queen in left 
             * top corner to begin with.
             */
            board[current] = i;

            /**
             * The recursive call is made by incrementing 
             * the counter, current, by 1. We again enter the ‘for’ loop.
             * It constantly checks the position of each row.
             */
            if (noKill(board, current)) {

                /**
                 * The recursive call here is given ONLY when the 
                 * conflicts are not there, so there is pruning and 
                 * branches are formed only when there are no conflicts.
                 */
                placeQueen(board, current + 1, noOfQueens);
            }
        }

    }

    private static boolean noKill(int[] board, int currentColumnOfQueen) {

        /**
         * The ‘for’ loop checks if the current queen to be placed 
         * has any conflicts with all previously placed queens. 
         * Hence the loop starts from 0 and moves up to one previous 
         * column than the current column under consideration.
         */
        for (int i = 0; i < currentColumnOfQueen; i++) {

            /** Same row
             * Row conflicts can be checked by comparing the value in 
             * the board array at all previous indices 
             * (position of previous queens already placed) with the 
             * value at current position under contention. If they are 
             * the same, it means we have a row conflict.
             */
            if (board[i] == board[currentColumnOfQueen]) {
                return false;
            }

            /** Diagonal
             * A chess board being composed of squares, any diagonal 
             * conflict can be detected by the difference in row and 
             * column values of 2 squares. If the difference yields the 
             * same value, we have a diagonal conflict. As shown below, 
             * when we want to place queen 5 , at column number 4, 
             * row number 1 , { 1, 4 } , the for loop will check for all 
             * diagonal conflicts with existing queens. When that loop 
             * runs and i = 1 , Q2 is at { 4 , 1 }. Absolute values of 
             * the difference in row and column values yields 3 and hence 
             * a diagonal is detected.
             */
            if ((currentColumnOfQueen - i) == Math.abs(board[currentColumnOfQueen] - board[i])) {
                return false;
            }

        }

        return true;
    }


    private static void displayQueens(int[] board) {
        System.out.print("\n");
 
        for (int value : board)
            System.out.printf(value + "%3s" ," ");
 
        System.out.print("\n\n");
 
        int n = board.length;
 
        for (int i = 0; i < n; i++) {
            for (int value : board) {
                if (value == i)
                    System.out.print("Q\t");
                else
                    System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }
}
