import java.util.Scanner;
public class PalindromeCheck {
// Logic 1: Compare characters from the start and end of the string.
public static boolean isPalindromeByComparing(String text) {
int start = 0;
int end = text.length() - 1;
while (start < end) {
if (text.charAt(start) != text.charAt(end)) {
return false; // Return false if characters don't match
}
start++;
end--;
}
return true; // Return true if all characters match
}
// Logic 2: Recursive method to check for palindrome
public static boolean isPalindromeRecursive(String text, int start, int end) {
if (start >= end) {
return true; // Base case: If the indices cross, it's a palindrome
}
if (text.charAt(start) != text.charAt(end)) { 20
return false; // If characters don't match, it's not a palindrome
}
// Recursive case: Check the next pair of characters
return isPalindromeRecursive(text, start + 1, end - 1);
}
// Logic 3: Using character arrays to check for palindrome
public static boolean isPalindromeByReversal(String text) {
// Convert string to char array
char[] originalArray = text.toCharArray();
// Create reversed array
char[] reversedArray = new char[originalArray.length];
int j = 0;
for (int i = originalArray.length - 1; i >= 0; i--) {
reversedArray[j] = originalArray[i];
j++;
}
// Compare original and reversed arrays
for (int i = 0; i < originalArray.length; i++) {
if (originalArray[i] != reversedArray[i]) {
return false; // If characters don't match, it's not a palindrome
}
}
return true; // Return true if arrays match
}
public static void main(String[] args) { 21
Scanner scanner = new Scanner(System.in);
// Take user input for the text
System.out.print("Enter a text: ");
String input = scanner.nextLine();
// Check using Logic 1
boolean isPalindrome1 = isPalindromeByComparing(input);
System.out.println("Palindrome check (Logic 1 - Comparing from start and end): " + isPalindrome1);
// Check using Logic 2 (Recursive method)
boolean isPalindrome2 = isPalindromeRecursive(input, 0, input.length() - 1);
System.out.println("Palindrome check (Logic 2 - Recursion): " + isPalindrome2);
// Check using Logic 3 (Character arrays and reversal)
boolean isPalindrome3 = isPalindromeByReversal(input);
System.out.println("Palindrome check (Logic 3 - Character array reversal): " + isPalindrome3);
scanner.close();
}
}