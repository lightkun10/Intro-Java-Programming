package E7_17;

import java.util.Arrays;
import java.util.Scanner;

public class SortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numberOfStudents = Integer.parseInt(input.nextLine());
        String[] students = new String[numberOfStudents];
        int[] grades = new int[numberOfStudents];

        for (int i = 0; i < students.length; i++) {
            // Prompt user to enter student's name and score
            System.out.print("Enter student name: ");
            students[i] = input.next();
            System.out.print("Enter student score: ");
            grades[i] = Integer.parseInt(input.next());
        }

        // Swap the order, descendingly
        whileSwap(grades, students);
        
        System.out.println(Arrays.toString(students));
    }

    static void whileSwap(int[] grades, String[] students) {
        for (int i = 0; i < students.length; i++) {
                
            int j = i + 1, ci = grades[i];
            while(true) {
                if (j >= grades.length) {
                    break;
                }

                int temp; String tempname;
                if (grades[i] < grades[j]) {
                    temp = grades[i]; tempname = students[i];
                    grades[i] = grades[j]; students[i] = students[j];
                    grades[j] = temp; students[j] = tempname;
                }

                j++;
            }
        }
    }
}
