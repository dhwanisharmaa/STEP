import java.util.Scanner; // Scanner import
public class SumOfNaturalRecursive {
 public static void main(String args[]) {
 Scanner input = new Scanner(System.in); // Scanner object
 System.out.println("Enter a natural number "); // Prompt user
 int number = input.nextInt(); // Read number

 // Check if it's a natural number
 if (number < 0) {
 System.out.println("Not a natural number. Exiting.");
 return;
 }

 // Calculate sum using recursion
 int recursiveSum = sumRecursive(number);

 // Calculate sum using formula
 int formulaSum = sumFormula(number);

 // Compare and display results
 System.out.println("Sum using recursion: " + recursiveSum);
 System.out.println("Sum using formula: " + formulaSum);

 if (recursiveSum == formulaSum) {
 System.out.println("Both computations are correct and equal.");
 } else {
 System.out.println("Computations do not match.");
 }
 }

 // Method to find sum using recursion
 public static int sumRecursive(int n) {
 if (n <= 0) {
 return 0;
 } else {
 return n + sumRecursive(n - 1);
 }
 }

 // Method to find sum using formula
 public static int sumFormula(int n) {
 return n * (n + 1) / 2;
 }
}
