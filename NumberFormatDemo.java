import java.util.Scanner;
public class NumberFormatDemo {
// Method to generate NumberFormatException
public static void generateException(String text) {
// This will throw NumberFormatException if text is not a valid integer
int number = Integer.parseInt(text);
System.out.println("Converted number: " + number);
}
// Method to handle NumberFormatException using try-catch
public static void handleException(String text) {
try { 
int number = Integer.parseInt(text);
System.out.println("Converted number: " + number);
} catch (NumberFormatException e) {
System.out.println("Caught NumberFormatException: " + e.getMessage());
} catch (RuntimeException e) {
System.out.println("Caught RuntimeException: " + e.getMessage());
}
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Take user input
System.out.print("Enter a number (as text): ");
String input = scanner.next();
// Generate and catch the exception (uncaught inside method)
System.out.println("\n==> Generating NumberFormatException:");
try {
generateException(input);
} catch (NumberFormatException e) {
System.out.println("Caught in main: " + e.getMessage());
}
// Handle exception inside method
System.out.println("\n==> Handling NumberFormatException gracefully:");
handleException(input);
scanner.close();
} 
}