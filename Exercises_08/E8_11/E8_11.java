package E8_11;

import java.util.Scanner;

public class E8_11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int dec = in.nextInt();
        String bin = Integer.toBinaryString(dec);

        int[] bins = new int[9];
        int divider = (9 - bin.length());
        if (bin.length() < 9) {
            for (int i = 0; i < divider; i++) {
                bins[i] = 0;
            }
        }

        for (int i = 0, j = divider; i < bin.length(); i++, j++) {
            bins[j] = bin.charAt(i);
        }

        int q = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(crackBins(bins, q) + " ");
                q++;
            }
            System.out.println();
        }
    }

    public static char crackBins(int[] bins, int q) {
        if (bins[q] == 49) {
            return 'T';
        }
        return 'H';
    }
}
