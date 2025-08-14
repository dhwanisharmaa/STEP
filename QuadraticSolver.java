import java.util.Scanner; // Scanner import
public class QuadraticSolver {
 public static void main(String args[]) {
 Scanner input = new Scanner(System.in); // Scanner object

 System.out.println("Enter coefficient a: "); // Prompt for a
 double a = input.nextDouble(); // Read a

 System.out.println("Enter coefficient b: "); // Prompt for b
 double b = input.nextDouble(); // Read b

 System.out.println("Enter coefficient c: "); // Prompt for c
 double c = input.nextDouble(); // Read c

 // Find roots of quadratic equation
 double[] roots = findRoots(a, b, c);

 // Display results
 if (roots.length == 0) {
 System.out.println("No real roots exist for this equation.");
 } else if (roots.length == 1) {
 System.out.println("The equation has one root: " + roots[0]);
 } else {
 System.out.println("The equation has two roots: " + roots[0] + "and " + roots[1]);
 }
 }

 // Method to find roots of a quadratic equation
 public static double[] findRoots(double a, double b, double c) {
 // Calculate discriminant
 double delta = Math.pow(b, 2) - 4 * a * c;

 // Check discriminant
 if (delta > 0) {
 // Two real roots
 double[] roots = new double[2];
 roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
 roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
 return roots;
 } else if (delta == 0) {
 // One real root
 double[] roots = new double[1];
 roots[0] = -b / (2 * a);
 return roots;
 } else {
 // No real roots
 return new double[0];
 }
 }
}