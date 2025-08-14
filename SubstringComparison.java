import java.util.Scanner;
public class SubstringComparison {
// Method to create a substring using charAt
public static String createSubstringUsingCharAt(String text, int start, int end) {
String result = "";
for (int i = start; i < end && i < text.length(); i++) {
result += text.charAt(i);
}
return result;
}
// Method to compare two strings using charAt
public static boolean compareStringsCharByChar(String str1, String str2) {
if (str1.length() != str2.length()) {
return false;
}

for (int i = 0; i < str1.length(); i++) {
if (str1.charAt(i) != str2.charAt(i)) {
return false;
}
}
return true;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Input text and indices
System.out.print("Enter the main string: ");
String text = scanner.next();
System.out.print("Enter the start index: ");
int start = scanner.nextInt();
System.out.print("Enter the end index: ");
int end = scanner.nextInt();
// Create substring using charAt
String substringCharAt = createSubstringUsingCharAt(text, start, end);
// Create substring using built-in method
String substringBuiltIn = "";
if (start >= 0 && end <= text.length() && start < end) {
substringBuiltIn = text.substring(start, end);
} else { 
System.out.println("Invalid indices for substring.");
}
// Compare both substrings
boolean isEqual = compareStringsCharByChar(substringCharAt, substringBuiltIn);
// Output results
System.out.println("Substring using charAt: " + substringCharAt);
System.out.println("Substring using substring(): " + substringBuiltIn);
System.out.println("Are both substrings equal? " + isEqual);
scanner.close();
}
}
