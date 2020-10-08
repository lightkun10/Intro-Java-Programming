package E7_33;

import java.util.Scanner;

public class Exercise7_33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] months = {"January", "February", "March", "April", 
                            "May", "June", "July", "August", "September", 
                            "October", "November", "December"};

        System.out.print("Enter a number from 1 to 12: ");
        int input = in.nextInt();
        String month = input <= 0 ? months[0] : months[input - 1];

        System.out.print("The month name is: " + month);
    }
}