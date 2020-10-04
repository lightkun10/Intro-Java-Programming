import java.util.Scanner;

/*
(Eliminate duplicates) Write a method that returns 
a new array by eliminating the duplicate values in the array
*/
public class EliminateDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");
        String[] inputs = scanner.nextLine().split(" ");
        int[] integers = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            integers[i] = Integer.parseInt(inputs[i]);
        }
        
        eliminateDuplicates(integers);
        //System.out.println(Arrays.toString(eliminateDuplicates(integers)));
    }

    public static void eliminateDuplicates(int[] list) {
        if (list.length == 0 || list.length == 1) {
            System.out.println("Array is not much.");
        }

        // Make a new array
        int[] newArr = new int[list.length];
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] == j) {
                    newArr[j]++;
                }
            }
        }

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] > 0) {
                System.out.print(i + " ");
            }
        }
    }
} 