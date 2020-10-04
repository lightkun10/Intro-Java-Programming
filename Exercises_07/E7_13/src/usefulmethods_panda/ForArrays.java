package usefulmethods_panda;

public class ForArrays {
    /*
    Reverse an array of string/integer
    Function swaps the array's first element with last element,  
    second element with last second element and so on
    https://www.geeksforgeeks.org/reverse-an-array-in-java/
    */
    public static void reverse(int[] arr) {
        int temp;
        
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}