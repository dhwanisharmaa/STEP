import java.util.Scanner; // Scanner import
public class RandomNumberStats {
 public static void main(String args[]) {
 // Generate five 4-digit random numbers
 int[] randomNumbers = generate4DigitRandomArray(5);

 // Display the generated numbers
 System.out.println("Generated 4-digit random numbers:");
 for (int i = 0; i < randomNumbers.length; i++) {
 System.out.println("Number " + (i + 1) + ": " +randomNumbers[i]);
 }

 // Find average, min, and max
 double[] stats = findAverageMinMax(randomNumbers);

 // Display results
 System.out.printf("Average: %.2f\n", stats[0]);
 System.out.println("Minimum: " + (int)stats[1]);
 System.out.println("Maximum: " + (int)stats[2]);
 }

 // Method to generate array of 4-digit random numbers
 public static int[] generate4DigitRandomArray(int size) {
 int[] numbers = new int[size];

 for (int i = 0; i < size; i++) {
 // Generate a random number between 1000 and 9999
 numbers[i] = 1000 + (int)(Math.random() * 9000);
 }

 return numbers;
 }

 // Method to find average, min, and max of an array
 public static double[] findAverageMinMax(int[] numbers) {
 double[] result = new double[3];

 // Find sum for average
 double sum = 0;
 int min = numbers[0];
 int max = numbers[0];

 for (int i = 0; i < numbers.length; i++) {
 sum += numbers[i];
 min = Math.min(min, numbers[i]);
 max = Math.max(max, numbers[i]);
 }

 // Calculate average
 result[0] = sum / numbers.length;
 result[1] = min;
 result[2] = max;

 return result;
 }
}