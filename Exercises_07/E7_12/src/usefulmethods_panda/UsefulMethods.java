package usefulmethods_panda;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class UsefulMethods {
    /*
    Round a double to 2 decimal places:
    https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
    */
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
    
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
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