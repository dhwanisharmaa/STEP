import java.util.Scanner; // Scanner import
public class FactorsFinder {
 public static void main(String args[]) {
 Scanner input = new Scanner(System.in); // Scanner object
 System.out.println("Enter a number to find its factors "); // Prompt user
 int number = input.nextInt(); // Read number

 // Find factors and store in array
 int[] factors = findFactors(number);

 // Display factors
 System.out.print("Factors of " + number + " are: ");
 for (int i = 0; i < factors.length; i++) {
 System.out.print(factors[i] + " ");
 }
 System.out.println();

 // Calculate and display results
 int sum = findSum(factors);
 int sumOfSquares = findSumOfSquares(factors);
 long product = findProduct(factors);

 System.out.println("Sum of factors: " + sum);
 System.out.println("Sum of squares of factors: " + sumOfSquares);
 System.out.println("Product of factors: " + product);
 }

 // Method to find factors and return as array
 public static int[] findFactors(int number) {
 int count = 0;

 // First loop to count factors
 for (int i = 1; i <= number; i++) {
 if (number % i == 0) {
 count++;
 }
 }

 // Initialize array with count
 int[] factors = new int[count];

 // Second loop to save factors into array
 int index = 0;
 for (int i = 1; i <= number; i++) {
 if (number % i == 0) {
 factors[index] = i;
 index++;
 }
 }

 return factors;
 }

 // Method to find sum of factors
 public static int findSum(int[] factors) {
 int sum = 0;
 for (int i = 0; i < factors.length; i++) {
 sum += factors[i];
 }
 return sum;
 }

 // Method to find product of factors
 public static long findProduct(int[] factors) {
 long product = 1;
 for (int i = 0; i < factors.length; i++) {
 product *= factors[i];
 }
 return product;
 }

 // Method to find sum of squares of factors
 public static int findSumOfSquares(int[] factors) {
 int sumOfSquares = 0;
 for (int i = 0; i < factors.length; i++) {
 sumOfSquares += Math.pow(factors[i], 2);
 }
 return sumOfSquares;
 }
 }