package E7_23;

import java.util.Arrays;

public class Exercise7_23 {
    public static void main(String[] args) {
        Boolean[] lockers = new Boolean[100];

        /** Student 1 opens the gate and open all the locker first. */
        for (int i = 0; i < lockers.length; i++) {
            lockers[i] = true;
        }

        // let i: student
        // let j: locker

        for (int i = 1; i < lockers.length; i++) {  // for every student
            for (int j = 1; j < lockers.length; j++) {  // for every locker
                // (locker % student)
                if (j % i == 0) {   // each 2 to 100 student open each of their multiplicative lockers.
                    lockers[j] = !lockers[j];
                }
            }
        }

        // for (int i = 1; i <= lockers.length; i++) {
        //     for (int j = 0; j < lockers.length; j+=i) {
        //         lockers[j] = !lockers[j];
        //     }
        // }

        System.out.println(Arrays.toString(lockers));
    }
}