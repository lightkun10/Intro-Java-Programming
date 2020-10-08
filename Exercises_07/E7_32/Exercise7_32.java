package E7_32;

import java.util.Scanner;

public class Exercise7_32 {
    public static void main(String[] args) {
        // 10 1 5 16 61 9 11 1
        // 53 20 1 68 22 56 19 75 50 20 24 89 2 57 30 63  16
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list size: ");
        final int N = sc.nextInt();

        int[] nums = new int[N];
        System.out.print("Enter list content: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        printOriginalArr(nums);
        partition(nums);    // NOTE: using Daniel Liang's book solution
        
        System.out.print("After the partition, the list is ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    /**
     * Daniel Liang's book solution.
     */
    public static int partition(int[] list) {

        int first = 0;
        int last = list.length - 1;
        int pivot = list[first]; // Choose the first element as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search

        while (high > low) {
            // Search forward from left
            while (low <= high && list[low] <= pivot) {
                low++;
            }

            // Search backward from right
            while (low <= high && list[high] > pivot) {
                high--;
            }

            // Swap two elements in the list
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        /**
         * Reaching the point where high has the same spot as low... 
         */
        
        while (high > first && list[high] >= pivot) {
            high--;
        }

        // Swap pivot with list[high]
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }
    }

    /** lightkun's(me) attempt. 
     * NOTE: Not so effective with several flaws in logic.
     * Better see the above solution instead.
     * */
    public static int partition1(int[] list) {
        
        int first = 0, last = list.length - 1; // index of first and last
        int pivot = list[first]; // first element as pivot
        int low = first + 1; // low point is next of the pivot
        int high = last; // high index at the last index
        while(high > low) { // The main task is to make 'low' is higher than 'high'
            
            // Move low forward
            if (list[low] < pivot && low <= high) {
                low++;
            }

            // Move high backward
            else if (list[high] > pivot && low <= high) {
                high--;
            }

            // Swap low and high
            else if (list[high] < pivot && high > low) {
                int temp = list[high];
                list[low] = list[high];
                list[high] = temp;
                low++;
            }

            else if (list[high] >= pivot && high > first) {
                high--;
            }

            else if (list[low] == list[high]) {
                high--;
            }

            else if (list[high] < pivot) {
                list[first] = list[high];
                list[high] = pivot;
                return high;
            }
        }

       return first;
    }

    private static void printOriginalArr(int[] nums) {
        System.out.print("List content right now: ");
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
