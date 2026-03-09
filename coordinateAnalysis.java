import java.util.Scanner;
/**
 * CoordinateAnalysis
 
 * The program performs the following tasks:
 * - Finds the point closest to the origin
 * - Finds the point furthest from the origin
 * - Calculates the average distance to the origin
 * - Detects if any point lies on the coordinate axes
 *
 * Points located in the third quadrant (x < 0 and y < 0) are ignored.
 */
public class CoordinateAnalysis {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variables to track minimum and maximum distances
        double minDistance = Double.MAX_VALUE;
        double maxDistance = Double.MIN_VALUE;

        // Sum of all distances to compute the average later
        double sumDistances = 0;

        // Coordinates of the closest and furthest points
        int closestX = 0, closestY = 0;
        int furthestX = 0, furthestY = 0;

        // Counter for valid points
        int count = 0;

        // Flag to detect points on axes
        boolean pointOnAxis = false;

        // Loop to read coordinate pairs
        while (true) {

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // Stop reading input if the pair is (0,0)
            if (x == 0 && y == 0) {
                break;
            }

            // Ignore points located in the third quadrant
            if (x < 0 && y < 0) {
                continue;
            }

            // Check if the point lies on either axis
            if (x == 0 || y == 0) {
                pointOnAxis = true;
            }

            // Calculate distance from the origin using the formula √(x² + y²)
            double distance = Math.sqrt(x * x + y * y);

            // Update closest point if needed
            if (distance < minDistance) {
                minDistance = distance;
                closestX = x;
                closestY = y;
            }

            // Update furthest point if needed
            if (distance > maxDistance) {
                maxDistance = distance;
                furthestX = x;
                furthestY = y;
            }

            // Add distance to the sum
            sumDistances += distance;

            // Increase valid point counter
            count++;
        }

        // Print results if at least one valid point was entered
        if (count > 0) {

            double averageDistance = sumDistances / count;

            System.out.println("Closest to origin: " + closestX + " " + closestY);
            System.out.println("Furthest to origin: " + furthestX + " " + furthestY);
            System.out.println("Average distance to origin: " + averageDistance);
        }

        // Print information about points on axes
        if (pointOnAxis) {
            System.out.println("There are points on the axes.");
        } else {
            System.out.println("There are no points on the axes.");
        }

        scanner.close();
    }
}