package E7_31;

import java.util.Scanner;

public class Exercise7_31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] list1 = list1(in);
        int[] list2 = list2(in);

        System.out.print("list1 is ");
        for (int i = 0; i < list1.length; i++) {
            System.out.print(list1[i] + " ");
        }
        System.out.println();
        
        System.out.print("list2 is ");
        for (int i = 0; i < list2.length; i++) {
            System.out.print(list2[i] + " ");
        }
        System.out.println();

        int[] mergedArr = merge(list1, list2);

        System.out.print("The merged list is ");
        for (int i = 0; i < mergedArr.length; i++) {
            System.out.print(mergedArr[i] + " ");
        }
        System.out.println();
        
        // Enter list1 size and contents: 5 1 5 16 61 111
        // Enter list2 size and contents: 4 2 4 5 6
    }

    public static int[] merge(int[] list1, int[] list2) {

        int[] merged = new int[list1.length + list2.length];

        int cursor1 = 0;
        int cursor2 = 0;
        int count = 0;
        int lowestI = list1.length > list2.length ? list2.length : list1.length;
        
        while (true) {

            if (list1[cursor1] < list2[cursor2]) {
                merged[count] = list1[cursor1];
                cursor1++;
            } 
            else if (list1[cursor1] > list2[cursor2]) {
                merged[count] = list2[cursor2];
                cursor2++;
            }
            else if (list1[cursor1] == list2[cursor2]) {
                merged[count] = cursor1 > cursor2 ? list2[cursor2] : list1[cursor1];
                if (cursor2 < cursor1) {
                    cursor2++;
                } else 
                    cursor1++;
            }

            count++;
            if (cursor1 >= lowestI || cursor2 >= lowestI) { break; }
        }

        if (cursor1 < list1.length) {
            int i = cursor1;
            while (i < list1.length) {
                merged[count] = list1[i];
                i++;
                count++;
            }
        }

        if (cursor2 < list2.length) {
            int i = cursor2;
            while (i < list2.length) {
                merged[count] = list2[i];
                i++;
                count++;
            }
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
