import java.util.Scanner; // Scanner import
public class FriendsComparision {
 public static void main(String args[]) {
 Scanner input = new Scanner(System.in); // Scanner object
 int[] ages = new int[3]; // Array for ages
 double[] heights = new double[3]; // Array for heights
 String[] names = {"Amar", "Akbar", "Anthony"}; // Names of friends

 // Get ages and heights for all friends
 for (int i = 0; i < 3; i++) {
 System.out.println("Enter age for " + names[i] + ": "); // Prompt for age
 ages[i] = input.nextInt(); // Read age

 System.out.println("Enter height (in cm) for " + names[i] + ":"); // Prompt for height
 heights[i] = input.nextDouble(); // Read height
 }

 // Find youngest friend
 int youngestIndex = findYoungestFriend(ages);
 System.out.println("The youngest friend is: " +names[youngestIndex]);

 // Find tallest friend
 int tallestIndex = findTallestFriend(heights);
 System.out.println("The tallest friend is: " + names[tallestIndex]);
 }

 // Method to find the youngest friend
 public static int findYoungestFriend(int[] ages) {
 int youngest = 0; // Assume first friend is youngest

 for (int i = 1; i < ages.length; i++) {
 if (ages[i] < ages[youngest]) {
 youngest = i;
 }
 }

 return youngest;
 }

 // Method to find the tallest friend
 public static int findTallestFriend(double[] heights) {
 int tallest = 0; // Assume first friend is tallest

 for (int i = 1; i < heights.length; i++) {
 if (heights[i] > heights[tallest]) {
 tallest = i;
 }
 }

 return tallest;
 }
}