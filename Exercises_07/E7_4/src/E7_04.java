import java.util.Scanner;

public class E7_04 {
    public static void main(String[] args) {
        /* Read user input for unspecified number of scores */
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[101];
        int sum = 0;
        int count = 0;

        /* Increment each index according to user input */
        System.out.println("Input a score(s):");
        for (int i = 0; i < scores.length; i++) {
            int score = Integer.parseInt(scanner.nextLine());
            if (score < 0) {
                break;
            }
            else if (score > 0 && score <= 100) {
                scores[score]++; // increment each index of particular score
                sum += score; // sum of all score
                count++;
            }
        }

        double average = sum / (double)count;
        int above = 0;
        int below = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 0 && i >= average) {
                above++;
            } else if (scores[i] > 0 && i < average) {
                below++;
            }
        }

        System.out.println("Above average " + (above > 1 ? "scores: " : "score: ") + above +
                "\nBelow average " + (below> 1 ? "scores: " : "score: ") + below);
    }
}
