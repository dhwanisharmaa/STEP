import java.util.Scanner;
public class PalindromeChecker {
public static boolean isPalindromeIterative(String text) {
int start = 0;
int end = text.length() - 1;
while(start < end) {
if(text.charAt(start) != text.charAt(end)) {
return false;
}
start++;
end--;
}
return true;
}
// Logic 2: Recursive approach to check palindrome
public static boolean isPalindromeRecursive(String text, int start, int end) {
if(start >= end) {
return true;
}
if(text.charAt(start) != text.charAt(end)) {
return false;
}
return isPalindromeRecursive(text, start + 1, end - 1);
}
// Logic 3: Using character arrays to check palindrome
public static boolean isPalindromeUsingCharArrays(String text) {
char[] original = text.toCharArray();
char[] reversed = new char[original.length];
for(int i = 0; i < original.length; i++) {
reversed[i] = original[original.length - 1 - i];
}
for(int i = 0; i < original.length; i++) {
if(original[i] != reversed[i]) {
return false;
}
}
return true;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string to check if it's a palindrome:");
String input = sc.nextLine();
boolean resultIterative = isPalindromeIterative(input);
boolean resultRecursive = isPalindromeRecursive(input, 0, input.length() - 1);
boolean resultCharArrays = isPalindromeUsingCharArrays(input);
System.out.println("Palindrome check (Iterative): " + resultIterative);
System.out.println("Palindrome check (Recursive): " + resultRecursive);
System.out.println("Palindrome check (Char Arrays): " + resultCharArrays);
}
}