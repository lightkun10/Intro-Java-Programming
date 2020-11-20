package E8_15;

import java.util.Scanner;

public class E8_15 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double points[][] = new double[5][2];

        System.out.print("Enter five points: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        // 1 1 2 2 3 3 4 4 5 5

        input.close();
        System.out.println(sameLine(points) ? "The five points are on the same line" : "The five points are not on the same line");
    }

    public static boolean sameLine(double[][] points) {

        double status = points[1][0] - points[0][0] * points[4][1] - points[0][1];
        for (int i = 2, j = points.length-2; i < points.length; i++, j--) {
            status -= points[i][0] - points[0][0];
            status *= points[j][1] - points[0][1];
        }
        return status <= 0.0;
    }
    
}
