package E8_3;

public class E8_03 {

    /** Main method */
    public static void main(String[] args) {
        // Students' answers to the questions
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // Grade all answers
        // for (int i = 0; i < answers.length; i++) {
        for (int i = answers.length-1; i > 0; i--) {
            
            // Grade one student
            int correctCount = 0;
            // Store the highest count
            int highestCount = 0;
            // Store the student with the highest count
            int studentHighestCount = 0;

            // for (int j = 0; j < answers[i].length; j++) {
            for (int j = answers[i].length-1; j > 0; j--) {

                if (answers[i][j] == keys[j]) {
                    correctCount++;
                }

            }
            
            highestCount = correctCount > highestCount ? correctCount : highestCount;
            studentHighestCount = highestCount > studentHighestCount ? i : studentHighestCount;

            System.out.println("Student " + i + "'s correct count is " + correctCount);
        }

    }
    
}
