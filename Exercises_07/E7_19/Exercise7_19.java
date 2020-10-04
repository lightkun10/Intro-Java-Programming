package E7_19;

import java.util.Scanner;

/*
(Sorted?) Write the following method that returns 
true if the list is already sorted in decreasing order.
*/
public class Exercise7_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int[] nums = new int[50];

        System.out.print("Enter list: ");
        String[] inputs = in.nextLine().split(" ");
        int[] nums = new int[Integer.parseInt(inputs[0])];
        for(int i = 1; i < inputs.length; i++) {
            nums[i - 1] = Integer.parseInt(inputs[i]);
        }
        
        // System.out.println(sortedOrNot(nums));
        if (sortedOrNot(nums)) {
            System.out.println("The list is already sorted");
        } else {
            System.out.println("The list is not sorted");
        }
    }


    private static boolean sortedOrNot(int[] list) {
        for (int i = 0; i < list.length - 2; i++) {
            if (list[i] < list[i + 1]) {
                return false;
            }
        }

        return true;
    }
}