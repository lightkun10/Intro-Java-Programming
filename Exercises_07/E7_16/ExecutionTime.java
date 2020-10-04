import search.Search;

public class ExecutionTime {
    public static void main(String[] args) {
        final int[] list = {1, 4, 4, 2, 5, -3, 6, 2};

        long startTime = System.nanoTime();
        
        Search.linearSearch(list, -3);
        /* approx. 787300 */
        
        long endtime = System.nanoTime();
        long executionTime = endtime - startTime;

        System.out.println("Execution time for linear search(in nanoseconds): " + executionTime);

        //Search.binarySearch(list, -3);
        /* approx. 200 */

        //System.out.println("Execution time for binary search(in nanoseconds): " + executionTime);
    }
}
