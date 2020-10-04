package search;

public class Search {

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        
        return -1;
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (high >= low) {
            int mid = low + ((high - low) / 2);
            //int mid = (-low + high) / 2 + low; // alternative

            if (key < array[mid]) {
                high = mid - 1;                  // first half
            } else if (key == array[mid]) {
                return mid;
            } else /* if key > list[mid] */ {
                low = mid + 1;
            }
        }
        return -low - 1; // Now high < low, key not found
    }

}