import java.util.Scanner;
public class StringIndexOutOfBoundsDemo {
// Method to generate StringIndexOutOfBoundsException
public static void generateException(String text) {
// Accessing an invalid index (e.g., length of string)
System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
}
// Method to handle StringIndexOutOfBoundsException using try-catch 11
public static void handleException(String text) {
try {
System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
} catch (StringIndexOutOfBoundsException e) {
System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
}
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Take user input
System.out.print("Enter a string: ");
String userInput = scanner.next();
// Demonstrate exception
System.out.println("\n==> Generating StringIndexOutOfBoundsException:");
try {
generateException(userInput); // This will throw an exception
} catch (StringIndexOutOfBoundsException e) {
System.out.println("Caught in main: " + e.getMessage());
}
// Demonstrate exception handling
System.out.println("\n==> Handling StringIndexOutOfBoundsException gracefully:");
handleException(userInput); // This method handles it internally
scanner.close();
}
}