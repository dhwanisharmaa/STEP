import java.util.Scanner;
public class UpperCaseComparison {
// Method to convert lowercase letters to uppercase using charAt and ASCII logic
public static String convertToUpperCustom(String text) {
StringBuilder result = new StringBuilder();
for (int i = 0; i < text.length(); i++) {
char ch = text.charAt(i);
// Check if character is lowercase
if (ch >= 'a' && ch <= 'z') {
// Convert to uppercase by subtracting 32 from ASCII
ch = (char) (ch - 32);
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
// Take full sentence input
System.out.print("Enter a sentence: ");
String input = scanner.nextLine();
// Convert using user-defined method
String customUpper = convertToUpperCustom(input);
// Convert using built-in method
String builtInUpper = input.toUpperCase();
// Compare both strings 18
boolean isEqual = compareStrings(customUpper, builtInUpper);
// Display results
System.out.println("\nCustom uppercase conversion: " + customUpper);
System.out.println("Built-in uppercase conversion: " + builtInUpper);
System.out.println("Are both results equal? " + isEqual);
scanner.close();
}
}