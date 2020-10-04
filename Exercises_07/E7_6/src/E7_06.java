import java.util.Arrays;

/**
 * The Sieve of Eratoshenes
 */
public class E7_06 {
    public static void main(String[] args) {
        boolean[] flag = new boolean[31];
        for (int i = 0; i < flag.length; i++) {
            flag[i] = true;
        }

        sieveOfEratoshenes(flag);
    }

    private static void sieveOfEratoshenes(boolean[] flag) {

        for (int i = 2; i < flag.length; i++) {
            if (flag[i] == true) {
                for (int j = (i * i); j <= flag.length; j += i) {
                    flag[j] = false;
                }
            }
        }

        for (int i = 2; i < flag.length; i++) {
            if (flag[i] == true) {
                System.out.println(i + " is prime");
            }
        }
    }
}
