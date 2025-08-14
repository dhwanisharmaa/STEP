import java.util.Scanner;
public class StringComparison {
// Method to compare two strings using charAt
public static boolean compareStringsCharByChar(String str1, String str2) {
// If lengths are not equal, strings are not equal
if (str1.length() != str2.length()) {
return false;
}
// Compare each character
for (int i = 0; i < str1.length(); i++) {
if (str1.charAt(i) != str2.charAt(i)) {
return false;
}
}
return true;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Take input
System.out.print("Enter first string: ");
String str1 = scanner.next();
System.out.print("Enter second string: ");
String str2 = scanner.next();
// Compare using custom method
boolean resultCharAt = compareStringsCharByChar(str1, str2);
// Compare using built-in equals()
boolean resultEquals = str1.equals(str2);
// Output results
System.out.println("Result using charAt comparison: " + resultCharAt);
System.out.println("Result using equals() method: " + resultEquals);
// Check if both methods give the same result
if (resultCharAt == resultEquals) {
System.out.println("Both comparison methods gave the same result.");
} else {
System.out.println("Comparison methods gave different results.");
}
scanner.close();
}
}