package math;

public class Algebra {

    /* 
    https://stackoverflow.com/questions/4201860/how-to-find-gcd-lcm-on-a-set-of-numbers
    */
    public static int leastCommonMultiple(int x, int y) {
        return x * (y / greatestCommonDivisor(x, y));
    }

    public static int leastCommonMultiple(int... numbers) {
        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            result = leastCommonMultiple(result, numbers[i]);
        }

        return result;
    }

    public static int greatestCommonDivisor(int x, int y) {
        while (y > 0) {
            int temp = y;
            y = x % y; // % is remainder
            x = temp;
        }

        return x;
    }

    public static int greatestCommonDivisor(int... numbers) {
        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            result = greatestCommonDivisor(result, numbers[i]);
        }

        return result;
    }
    

}