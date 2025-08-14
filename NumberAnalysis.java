import java.util.Scanner; // Scanner import
public class NumberAnalysis {
 public static void main(String args[]) {
 Scanner input = new Scanner(System.in); // Scanner object
 int[] numbers = new int[5]; // Array for 5 numbers

 // Get 5 numbers from user
 for (int i = 0; i < 5; i++) {
 System.out.println("Enter number " + (i + 1) + ": "); // Prompt user
 numbers[i] = input.nextInt(); // Read number

 // Check if positive or negative
 if (isPositive(numbers[i])) {
 System.out.print("Number is positive");

 // Check if even or odd
 if (isEven(numbers[i])) {
 System.out.println(" and even");
 } else {
 System.out.println(" and odd");
 }
 } else {
 System.out.println("Number is negative");
 }
 }

 // Compare first and last element
 int result = compare(numbers[0], numbers[4]);

 if (result > 0) {
 System.out.println("First number is greater than last number");
 } else if (result < 0) {
 System.out.println("First number is less than last number");
 } else {
 System.out.println("First number is equal to last number");
 }
 }

 // Method to check if a number is positive
 public static boolean isPositive(int number) {
 return number >= 0;
 }

 // Method to check if a number is even
 public static boolean isEven(int number) {
 return number % 2 == 0;
 }

 // Method to compare two numbers
 public static int compare(int number1, int number2) {
 if (number1 > number2) {
 return 1;
 } else if (number1 < number2) {
 return -1;
 } else {
 return 0;
 }
 }
}
