import java.util.Scanner;

public class CoordinateAnalysis {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double minDistance = Double.MAX_VALUE;
        double maxDistance = Double.MIN_VALUE;
        double sumDistances = 0;

        int closestX = 0, closestY = 0;
        int furthestX = 0, furthestY = 0;

        int count = 0;
        boolean pointOnAxis = false;

        while (true) {

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // Stop condition
            if (x == 0 && y == 0) {
                break;
            }

            // Ignore third quadrant
            if (x < 0 && y < 0) {
                continue;
            }

            // Check if point lies on axes
            if (x == 0 || y == 0) {
                pointOnAxis = true;
            }

            double distance = Math.sqrt(x * x + y * y);

            // Check closest point
            if (distance < minDistance) {
                minDistance = distance;
                closestX = x;
                closestY = y;
            }

            // Check furthest point
            if (distance > maxDistance) {
                maxDistance = distance;
                furthestX = x;
                furthestY = y;
            }

            sumDistances += distance;
            count++;
        }

        if (count > 0) {
            double averageDistance = sumDistances / count;

            System.out.println("Closest to origin: " + closestX + " " + closestY);
            System.out.println("Furthest to origin: " + furthestX + " " + furthestY);
            System.out.println("Average distance to origin: " + averageDistance);
        }

        if (pointOnAxis) {
            System.out.println("There are points on the axes.");
        } else {
            System.out.println("There are no points on the axes.");
        }

        scanner.close();
    }
}