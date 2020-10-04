/*
Count single digits
*/

public class E7_07 {
    public static void main(String[] args) {
        /* Initialize array of int of random integers between 0 and 9 */
        int[] rndInt = new int[200];

        /* Initialize array of int for every 0's to 9's integers */
        int[] counts = new int[10];

        /* generates 200 random integers between 0 and 9 */
        generateRndInt(rndInt);

        // For each random integers...
        for (int i = 0; i < rndInt.length; i++) {
            // For each integer index from 0 to 9...
            for (int j = 0; j < counts.length; j++) {
                // If random integers is the same as the index,
                // increment the value of the index.
                if (rndInt[i] == j) {
                    counts[j]++;
                }
            }
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " appears " + counts[i] + " times.");
        }


    }

    private static void generateRndInt(int[] integers) {
        for (int i = 0; i < integers.length; i++) {
            integers[i] = (int)(Math.random() * (9 + 1));
        }
    }
}
