import java.util.Scanner;
public class LowerCaseComparison {
// Method to convert uppercase letters to lowercase using ASCII and charAt
public static String convertToLowerCustom(String text) {
StringBuilder result = new StringBuilder();
19
for (int i = 0; i < text.length(); i++) {
char ch = text.charAt(i);
// Check if character is uppercase
if (ch >= 'A' && ch <= 'Z') {
// Convert to lowercase by adding 32 to ASCII
ch = (char) (ch + 32);
}
result.append(ch);
}
return result.toString();
}
// Method to compare two strings using charAt()
public static boolean compareStrings(String s1, String s2) {
if (s1.length() != s2.length()) return false;
for (int i = 0; i < s1.length(); i++) {
if (s1.charAt(i) != s2.charAt(i)) {
return false;
}
}
return true;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Take full sentence input 20
System.out.print("Enter a sentence: ");
String input = scanner.nextLine();
// Convert using custom method
String customLower = convertToLowerCustom(input);
// Convert using built-in method
String builtInLower = input.toLowerCase();
// Compare both results
boolean isEqual = compareStrings(customLower, builtInLower);
// Display results
System.out.println("\nCustom lowercase conversion: " + customLower);
System.out.println("Built-in lowercase conversion: " + builtInLower);
System.out.println("Are both results equal? " + isEqual);
scanner.close();
}
}