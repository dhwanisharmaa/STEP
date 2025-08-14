import java.util.Scanner;

public class CollinearityChecker {

    // Method 1: Using slope formula
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Avoid divide by zero by comparing cross multiplication
        int slope1 = (y2 - y1) * (x3 - x2);
        int slope2 = (y3 - y2) * (x2 - x1);

        return slope1 == slope2;
    }

    // Method 2: Using area of triangle formula
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) +
                             x2 * (y3 - y1) +
                             x3 * (y1 - y2));
        return area == 0.0;
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Check collinearity
        boolean slopeCollinear = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaCollinear = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Results
        System.out.println("\nUsing Slope Method: " + (slopeCollinear ? "Collinear" : "Not Collinear"));
        System.out.println("Using Area Method: " + (areaCollinear ? "Collinear" : "Not Collinear"));
    }
}
