package exercise;

import usefulmethods_panda.ForRandom;

/*
Write a method that returns a random number from a
list of numbers passed in the argument
*/

public class E7_13 {
    public static void main(String[] args) {
        System.out.println(getRandom(2, 3, 9, 5));
    }

    public static int getRandom(int... numbers) {
        // If number provided is 1 or less, return an error instead
        if (numbers.length == 0) {
            System.out.println("No argument passed.");
            return -1;
        }

        return ForRandom.getRandomInt(numbers);
    }
}
