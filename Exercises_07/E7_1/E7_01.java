import java.util.Scanner;

public class E7_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        String numberOfStudents = input.nextLine();

        int students = Integer.parseInt(numberOfStudents);

        // Make an array of number of students to store the student score
        int[] scoresStored = new int[students];

        System.out.print("Enter " + numberOfStudents + " scores: ");
        String scoreI = input.nextLine();

        // Split scores into an array
        String[] scores = scoreI.split(" ");
        int best = 0;

        // Iterate through the score array
        for (int i = 0; i < scores.length; i++) {
            int current = Integer.parseInt(scores[i]);
            // Get the best score
            if (best < current) {
                best = current;
            }
        }

        for (int i = 0; i < scores.length; i++) {
            int current = Integer.parseInt(scores[i]);
            System.out.println("Student " + i + " score is " + current + " and grade is " + getGrade(current, best));
        }
    }

    public static char getGrade(int grade, int bestGrade) {
        // System.out.println(grade + " " + bestGrade);
        if (grade >= bestGrade - 5) {
            return 'A';
        } else if (grade >= bestGrade - 10 && grade <= bestGrade - 5) {
            return 'B';
        } else if (grade >= bestGrade - 15 && grade <= bestGrade - 10) {
            return 'C';
        } else if (grade >= bestGrade - 20 && grade <= bestGrade - 15) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
