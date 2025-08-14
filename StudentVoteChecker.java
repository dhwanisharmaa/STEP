import java.util.Scanner; // Scanner import
public class StudentVoteChecker {
 public static void main(String args[]) {
 Scanner input = new Scanner(System.in); // Scanner object
 int[] studentAges = new int[10]; // Array for 10 students

 // Get ages for all students
 for (int i = 0; i < 10; i++) {
 System.out.println("Enter age for student " + (i + 1) + ": "); //Prompt user
 studentAges[i] = input.nextInt(); // Read age

 // Display vote eligibility
 if (canStudentVote(studentAges[i])) {
 System.out.println("Student " + (i + 1) + " can vote.");
 } else {
 System.out.println("Student " + (i + 1) + " cannot vote.");
 }
 }
 }

 // Method to check if a student can vote
 public static boolean canStudentVote(int age) {
 // Check for negative age
 if (age < 0) {
 return false;
 }

 // Check if age is 18 or above
 return age >= 18;
 }
}