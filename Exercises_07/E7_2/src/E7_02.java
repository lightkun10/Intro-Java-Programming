public class E7_02 {
    /**
     * Exercises 7.3
     * Comparing numbers
     */
    public static void main(String[] args) {
        int[] integers = new int[11];
        int i = 0;
        while (i < 11) {
            integers[i] = i;
            i++;
        }

        System.out.println("Last of array: " + integers[integers.length - 1]);
        System.out.println(integers[integers.length - 1] == 10);

        System.out.println(relEleven(integers, 10));
    }

    public static String relEleven(int[] ints, int compare) {
        if (ints.length != 11) {
            return "Your array is more or less than 11.";
        }

        int eleventh = ints[ints.length - 1];
        String result = "";

        for (int i = 0; i < ints.length - 2; i++) {
            if (compare < eleventh) {
                result = "smaller";
            } else if (compare > eleventh) {
                result = "greater";
            } else if (compare == eleventh) {
                result = "equal";
            }
        }

        return result;
    }
}
