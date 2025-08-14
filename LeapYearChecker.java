import java.util.Scanner; // Scanner import
public class LeapYearChecker {
 public static void main(String args[]) {
 Scanner input = new Scanner(System.in); // Scanner object
 System.out.println("Enter a year to check if it's a leap year "); //Prompt user
 int year = input.nextInt(); // Read year

 if (isLeapYear(year)) {
 System.out.println(year + " is a Leap Year");
 } else {
 System.out.println(year + " is not a Leap Year");
 }
 }

 // Method to check if a year is a leap year
 public static boolean isLeapYear(int year) {
 // Check if year is valid (>= 1582)
 if (year < 1582) {
 System.out.println("Year must be 1582 or later (Gregoriancalendar)");
return false;
 }

 // Check leap year conditions
 // Divisible by 4 and (not divisible by 100 OR divisible by 400)
 return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
 }
}
