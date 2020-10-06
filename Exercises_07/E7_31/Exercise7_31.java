package E7_31;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] list1 = list1(in);
        int[] list2 = list2(in);

        System.out.println("list1 size and contents: " + Arrays.toString(list1));
        System.out.println("list2 size and contents: " + Arrays.toString(list2));

        merge(list1, list2);

        // Enter list1 size and contents: 5 1 5 16 61 111
        // Enter list2 size and contents: 4 2 4 5 6
    }

    public static int[] merge(int[] list1, int[] list2) {

        int[] merged = new int[list1.length + list2.length];

        /*
        As outer loop, go through the newly-created merged array:
            compare list1 and list2
                if list1 is less than list2, current index of merged is list1

                otherwise, curent index is list2
        */
       for (int i = 0; i < merged.length; i++) {
            FIXME
       }

       return merged;
    }


    public static int[] list1(Scanner in) {
        System.out.print("Enter list1 size and contents: ");
        String[] inputs = in.nextLine().split(" ");
        int[] list1 = new int[Integer.parseInt(inputs[0])];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = Integer.parseInt(inputs[i+1]);
        }

        return list1;
    }

    public static int[] list2(Scanner in) {
        System.out.print("Enter list2 size and contents: ");
        String[] inputs = in.nextLine().split(" ");
        int[] list2 = new int[Integer.parseInt(inputs[0])];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = Integer.parseInt(inputs[i+1]);
        }

        return list2;
    }
}
