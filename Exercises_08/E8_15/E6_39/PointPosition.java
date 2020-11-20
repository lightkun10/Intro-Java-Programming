package E8_15.E6_39;

import java.util.Scanner;

public class PointPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble(), y0 = input.nextDouble(),
        x1 = input.nextDouble(), y1 = input.nextDouble(),
        x2 = input.nextDouble(), y2 = input.nextDouble();

        // >0 p2 is on the same line 
        // =0 p2 is on the left side of the line 
        // <0 p2 is on the right side of the line
        //            00  01  10  11  20  21
        leftOfTheLine(x0, y0, x1, y1, x2, y2);
        // (10-00) * (21-01) - (20-00) * (11-01)

        
    }

    public static boolean leftOfTheLine(double x0, double y0,
        double x1, double y1, double x2, double y2) {
        
        double status = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return status == 0;
    }

    public static boolean onTheSameLine(double x0, double y0,
        double x1, double y1, double x2, double y2) {

        double status = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return status > 0.0;
    }

    public static boolean onTheLineSegment(double x0, double y0,
        double x1, double y1, double x2, double y2) {
        
        double status = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return status < 0.0;
    }

}
