package usefulmethods_panda;

import java.util.concurrent.ThreadLocalRandom;

/* Sources:
https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
*/
public class ForRandom {

    // If bounds is provided
    public static int getRandomInt(int[] arr, int max, int min) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    // If bounds is not provided
    public static int getRandomInt(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}