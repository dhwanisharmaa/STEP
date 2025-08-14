import java.util.Scanner;
public class CharArrayComparison {
// Method to return characters in a string without using toCharArray()
public static char[] getCharsFromString(String text) { 7
char[] chars = new char[text.length()];
for (int i = 0; i < text.length(); i++) {
chars[i] = text.charAt(i);
}
return chars;
}
// Method to compare two char arrays
public static boolean compareCharArrays(char[] arr1, char[] arr2) {
if (arr1.length != arr2.length) {
return false;
}
for (int i = 0; i < arr1.length; i++) {
if (arr1[i] != arr2[i]) {
return false;
}
}
return true;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Take user input
System.out.print("Enter a string: ");
String input = scanner.next();
// Get char array using custom method 8
char[] customArray = getCharsFromString(input);
// Get char array using built-in toCharArray()
char[] builtInArray = input.toCharArray();
// Compare the two arrays
boolean isEqual = compareCharArrays(customArray, builtInArray);
// Display results
System.out.print("Characters using custom method: ");
for (char c : customArray) {
System.out.print(c + " ");
}
System.out.print("\nCharacters using toCharArray(): ");
for (char c : builtInArray) {
System.out.print(c + " ");
}
System.out.println("\nAre both character arrays equal? " + isEqual);
scanner.close();
}
}