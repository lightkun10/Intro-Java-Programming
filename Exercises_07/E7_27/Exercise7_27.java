package E7_27;

import java.util.Scanner;

public class Exercise7_27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter list: ");
        String[] inputs = in.nextLine().split(" ");
        int[] nums = new int[inputs.length];
        for(int i = 0; i < inputs.length; i++) {
            nums[i] = Integer.parseInt(inputs[i]);
        }

        System.out.println("The list " + (isSorted(nums) ? "is sorted" : "is not sorted") + 
            (isSortedConstantInterval(nums) ? " with a constant interval" : ""));
    }

    private static boolean isSortedConstantInterval(int[] list) {
        for (int i = 0; i < list.length - 2; i++) {
            if (list[i] == list[i + 1]) {
                return false;
            }
        }

        return true;
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
