package E8_13;

import java.util.Scanner;

public class E8_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        String[] splitted = input.nextLine().split(" ");
        double[][] arr = new double[Integer.parseInt(splitted[0])][Integer.parseInt(splitted[1])];
        
        System.out.println("Enter the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextDouble();
            }
        }

        input.close();

        System.out.println(
            "The location of the smallest element is at (" +
            locateSmallest(arr)[0] + ", " + 
            locateSmallest(arr)[1] + ")"
        );
    }

    public static int[] locateSmallest(double[][] a) {
        int[] s = new int[2];
        int row = 0, col = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < a[row][col]) {
                    row = i; col = j;
                }
            }
        }
        
        s[0] = row; s[1] = col;
        return s;
    }
}
