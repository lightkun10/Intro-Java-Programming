package E8_16;

import java.util.Arrays;

public class E8_16 {
    
    public static void main(String[] args) {
        int[][] matrix = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};

        sort(matrix);

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void sort(int m[][]) {
        // Iterate through the outer layer of the array
        for (int i = 0; i < m.length; i++) {
            int[] currentMinRow = m[i];
            int curMinIdx = i;

            for (int j = i + 1; j < m.length; j++) {
                if (primarySort(currentMinRow[0], m[j][0]) ||
                secondarySort(currentMinRow[0], m[j][0], m[curMinIdx][1], m[j][1])) 
                {
                    currentMinRow = m[j];
                    curMinIdx = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (curMinIdx != i) {
                int temp0 = m[curMinIdx][0];
                int temp1 = m[curMinIdx][1];
                m[curMinIdx][0] = m[i][0];
                m[curMinIdx][1] = m[i][1];
                m[i][0] = temp0;
                m[i][1] = temp1;
            }
        }
    }

    // If row is different.
	public static boolean primarySort(int a, int b) {
        return a < b;
    }

    // If row is the same yet column didn't.
    public static boolean secondarySort(int a0, int b0, int a1, int b1) {
        return (a0 == b0) && (a1 < b1);
    }

}
