package E7_26;

import java.util.Scanner;

public class Exercise7_26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter list: ");

        String[] inputs = in.nextLine().split(" ");
        int[] nums = new int[Integer.parseInt(inputs[0])];
        for(int i = 1; i < inputs.length; i++) {
            nums[i - 1] = Integer.parseInt(inputs[i]);
        }

        System.out.println((isSorted(nums)) ? "The list is sorted" 
                : "The list is not sorted");
    }

    private static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 2; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
