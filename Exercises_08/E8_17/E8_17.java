package E8_17;

import java.util.Scanner;

public class E8_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount of banks and its safety: ");
        String[] in = input.nextLine().split(" ");

        
        int n = Integer.parseInt(in[0]); // number of banks
        int limit = Integer.parseInt(in[1]);
        Double[] balances = new Double[n];
        Double[][] borrowers = new Double[n][n];

        for (int i = 0; i < balances.length; i++) {
            balances[i] = input.nextDouble();

            int howManyLoaned = input.nextInt();
            for (int j = 0; j < howManyLoaned; j++) {
                borrowers[i][input.nextInt()] = input.nextDouble();
            }
        }

        int[] unsafeBanks = new int[n];

        for (int i = 0; i < n; i++) { // for every transactions
            for (int j = 0; j < n; j++) { // for every banks that lend its money
                int total = 0;

                for (int k = 0; k < n; k++) { // for every loans given by each banks
                    if (borrowers[j][k] != null) {
                        total += borrowers[j][k];
                    }
                }

                if (total + balances[j] < limit) {
                    for (int l = 0; l < n; l++) {
                        borrowers[l][j] = 0.0;
                        unsafeBanks[j]++;
                    }
                }
            }

        }

        System.out.println("===================================");
        System.out.print("Unsafe banks are ");
        for (int i = 0; i < unsafeBanks.length; i++) {
            // System.out.print(unsafeBanks[i] + " ");
            if (unsafeBanks[i] > 0) {
                System.out.print((i) + " ");
            }
        }
    }
}