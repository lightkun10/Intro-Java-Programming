package E8_4;

public class SelectionSort {

    public static void ascending(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length−1]
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {   // Select, traverse the array
                if (currentMin > list[j]) {               // to then compare each j iteration
                    currentMin = list[j];                 // with the i iteration
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

}
