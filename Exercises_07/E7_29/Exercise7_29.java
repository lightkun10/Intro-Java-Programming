package E7_29;

import java.util.Random;

public class Exercise7_29 {
    public static void main(String[] args) {
        Random r = new Random();
        int roll1 = r.nextInt(9)+1;
        int roll2 = r.nextInt(9)+1;
        int roll3 = r.nextInt(9)+1;

        int count = 0;
        for (int i = 0; i < roll1; i++) {
            for (int j = 0; j < roll2; j++) {
                for (int k = 0; k < roll3; k++) {
                    if (i + j + k == 9) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
