package E8_8;

import java.util.Scanner;

public class E8_08 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        // Create an array to store points
        double[][] points = new double[numberOfPoints][2];  // 2-D array
        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {   // read points
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        int p1 = 0, p2 = 1; // Initial two points
        double shortestDistance = distance(points[p1][0], points[p1][1],
            points[p2][0], points[p2][1]); // Initialize shortestDistance

        // Store a closest pair in (indices[i][0], indices[i][1]) 
        // The pair of the points for (indices[i][0], indices[i][1]) is
        // points[indices[i][0]] and points[indices[i][1]] 
        int[][] indices = new int[points.length][2];
        int track = 0; // for tracking current indices index

        // Compute distance for every two points
        for (int i = 0; i < points.length; i++) {
            
            for (int j = i + 1; j < points.length; j++) {

                // Find distance
                double distance = distance(points[i][0], points[i][1],
                    points[j][0], points[j][1]);
                
                if (shortestDistance > distance) {
                    track = 0; // reset back to 0
                    indices[track][0] = i;
                    indices[track][1] = j;
                    shortestDistance = distance; // Update shortestDistance
                }
                else if (shortestDistance == distance) {
                    indices[track][0] = i;
                    indices[track][1] = j;
                    track++;
                }
            }
        }
        
        input.close();

        // System.out.print("Indices: ");
        // for (int i = 0; i < indices.length; i++) {
        //     System.out.print(Arrays.toString(indices[i]) + " ");
        // }
        // System.out.println();

        // Display all closest pairs
        for (int i = 0; i < track; i++) {

            p1 = indices[i][0]; p2 = indices[i][1];
            System.out.println("The closest two points are (" + 
                points[p1][0] + ", " + points[p1][1] + ") and (" +
                points[p2][0] + ", " + points[p2][1] + ")");
        }

        System.out.println("Their distance is " + shortestDistance);
    }

    /**
     * A utility function to find the distance between two points 
     */
    public static double distance(double x1, double y1, 
        double x2, double y2) {
        return Math.sqrt(
            (x1 - x2) * (x1 - x2) +
            (y1 - y2) * (y1 - y2)
        );
    }
}
