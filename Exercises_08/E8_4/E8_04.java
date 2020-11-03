package E8_4;

import java.util.Arrays;

public class E8_04 {

    private static final int EMPLOYEES = 8;
    private static final int WORKDAYS = 7;

    public static void main(String[] args) {
        
        int[][] workHours = {
            {2, 4, 3, 4, 5, 8, 8}, // Employee 0
            {7, 3, 4, 3, 3, 4, 4}, // Employee 1
            {3, 3, 4, 3, 3, 2, 2}, // Employee 2
            {9, 3, 4, 7, 3, 4, 1}, // Employee 3
            {3, 5, 4, 3, 6, 3, 8}, // Employee 4
            {3, 4, 4, 6, 3, 4, 4}, // Employee 5
            {3, 7, 4, 8, 3, 8, 4}, // Employee 6
            {6, 3, 5, 9, 2, 7, 9}, // Employee 7
        };

        // unsortedTotalWeeklyHours(workHours);

        /** Array to store total (unsorted) weekly hours */
        int[] weeklyHours = new int[workHours.length];
        for (int i = 0; i < workHours.length; i++) {
            for (int j = 0; j < workHours[i].length; j++) {
                weeklyHours[i] += workHours[i][j];
            }
        }

        /** Array to hold the list of sorted index  */
        int[] listIndex = new int[weeklyHours.length];
        for (int i = 0; i < 8; i++) {
            listIndex[i] = i;
        }

        /** Sort the array together with the list of index */
        sortedTotalWeeklyHours(listIndex, weeklyHours);

        // System.out.println(Arrays.toString(listIndex));
        // System.out.println(Arrays.toString(weeklyHours));

        for (int i = 0; i < listIndex.length; i++) {
            System.out.println("Employee" + listIndex[i] + 
                " works for " + weeklyHours[i] + " hours");
        }
        

    }

    public static void sortedTotalWeeklyHours(int[] listIndex, int[] weeklyHours) {

        for (int i = 0; i < weeklyHours.length; i++) {
            int currentMin = weeklyHours[i];
            int currentMinIndex = i;

            for (int j = i+1; j < weeklyHours.length; j++) {
                if (currentMin > weeklyHours[j]) {
                    currentMin = weeklyHours[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                // Swap the list of indexes
                int temp = listIndex[i];
                listIndex[i] = listIndex[currentMinIndex];
                listIndex[currentMinIndex] = temp;

                // Swap the weeklyHours total
                weeklyHours[currentMinIndex] = weeklyHours[i];
                weeklyHours[i] = currentMin;
            }

        }

    }

    /** Unsorted weekly hours */
    public static void unsortedTotalWeeklyHours(int[][] m) {

        for (int employee = 0; employee < EMPLOYEES; employee++) {
            int total = 0;
            for (int workday = 0; workday < WORKDAYS; workday++) {
                total += m[employee][workday];
            }

            
            // System.out.println("Employee " + (employee+1) + " work for " + total + " hours");

            System.out.println("Employee " + (employee+1) + " work for " + total + (employee == EMPLOYEES - 1 ? " hours." : " hours"));
        }
    }
}
