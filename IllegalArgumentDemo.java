import java.util.Scanner;
public class IllegalArgumentDemo {
// Method that generates IllegalArgumentException
public static void generateException(String text) {
// Setting start index greater than end index to cause an IllegalArgumentException
int start = 5;
int end = 3;
System.out.println("Substring (start > end): " + text.substring(start, end));
}
// Method to handle the exception using try-catch
public static void handleException(String text) {
int start = 5;
int end = 3;
try { 
System.out.println("Substring (start > end): " + text.substring(start, end));
} catch (IllegalArgumentException e) {
System.out.println("Caught IllegalArgumentException: " + e.getMessage());
} catch (RuntimeException e) {
// Catch any other unexpected runtime exceptions
System.out.println("Caught RuntimeException: " + e.getMessage());
}
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Take user input
System.out.print("Enter a string: ");
String input = scanner.next();
// Demonstrate the exception (uncaught)
System.out.println("\n==> Generating IllegalArgumentException:");
try {
generateException(input);
} catch (IllegalArgumentException e) {
System.out.println("Caught in main: " + e.getMessage());
}
// Handle the exception using try-catch
System.out.println("\n==> Handling IllegalArgumentException gracefully:");
handleException(input);
scanner.close();
} 
}