public class NullPointerDemo {
// Method to generate NullPointerException
public static void generateNullPointerException() {
String text = null;
// This will throw NullPointerException
System.out.println("Text length: " + text.length());
}
// Method to handle NullPointerException using try-catch
public static void handleNullPointerException() {
String text = null;
try {
System.out.println("Text length: " + text.length());
} catch (NullPointerException e) {
System.out.println("Caught a NullPointerException: " + e.getMessage());
}
}
public static void main(String[] args) {
System.out.println("==> Generating NullPointerException:");
try {
generateNullPointerException(); // This will throw an exception 10
} catch (NullPointerException e) {
System.out.println("Caught in main: " + e.getMessage());
}
System.out.println("\n==> Handling NullPointerException gracefully:");
handleNullPointerException(); // This handles it inside the method
}
}