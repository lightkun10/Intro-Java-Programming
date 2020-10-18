package E7_37;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise7_37 {
    static final Random random = new Random();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of balls to drop: ");
        int balls = in.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        int slotNums = in.nextInt(); System.out.println();
        int[] slots = new int[slotNums];

        for (int i = 0; i < balls; i++) {

            for (int j = 1; j < slotNums; j++) {
                
                System.out.print(next());
                
                if (next() == 'R') {
                    slots[j]++;
                }
            }
            System.out.println();
        }


        printSlot(slotNums, balls, slots);
    }

    public static void printSlot(int slotNums, int balls, int[] slots) {

        char[][] finalSlots = new char[balls][slotNums];

        // Traverse through the number of ball indexes

        for (int i = 0; i < slotNums; i++) {
            for (int j = balls - 1; j > slots[i]; j--) {
                // System.out.print("j: " + j + " i: " + i + "\n");
                finalSlots[j][i] = 'o';
            }
        }
        

        for (int i = 0; i < balls; i++) {
            for (int j = 0; j < slotNums; j++) {
                System.out.print(finalSlots[i][j]);
            }
            System.out.println();
        }
    }

    // 50% to left or right
    private static char next() {
        if (random.nextBoolean()) {
            return 'L';
        } else {
            return 'R';
        
        }
    }
}
