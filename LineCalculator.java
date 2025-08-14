import java.util.Scanner;

public class LineCalculator {

    // Method to calculate Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double dx = Math.pow(x2 - x1, 2);
        double dy = Math.pow(y2 - y1, 2);
        return Math.sqrt(dx + dy);
    }

    // Method to calculate slope and y-intercept and return as array
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];
        if (x2 == x1) {
            throw new IllegalArgumentException("Slope is undefined (vertical line).");
        }

        double slope = (y2 - y1) / (x2 - x1);       // m = (y2 - y1)/(x2 - x1)
        double intercept = y1 - slope * x1;         // b = y1 - m * x1

        result[0] = slope;
        result[1] = intercept;
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for two points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate and display distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between points: %.2f\n", distance);

        // Calculate and display line equation
        try {
            double[] line = calculateLineEquation(x1, y1, x2, y2);
            double slope = line[0];
            double intercept = line[1];
            System.out.printf("Equation of the line: y = %.2fx + %.2f\n", slope, intercept);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
