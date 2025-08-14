import java.util.Scanner;
public class AnagramCheck {
// Method to check if two texts are anagrams
public static boolean areAnagrams(String text1, String text2) {
// If the lengths are different, they can't be anagrams
if (text1.length() != text2.length()) {
return false;
}
// Convert both strings to character arrays
char[] arr1 = text1.toCharArray();
char[] arr2 = text2.toCharArray();
// Create arrays to store frequency of characters
int[] freq1 = new int[256]; // Assuming ASCII characters
int[] freq2 = new int[256];
// Loop through both arrays and update the frequency count
for (int i = 0; i < arr1.length; i++) {
freq1[arr1[i]]++;
freq2[arr2[i]]++;
}
// Compare the frequency arrays
for (int i = 0; i < 256; i++) { 23
if (freq1[i] != freq2[i]) {
return false; // If frequencies are not equal, they are not anagrams
}
}
return true; // If all frequencies are equal, the strings are anagrams
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Take user input for two texts
System.out.print("Enter the first text: ");
String text1 = scanner.nextLine();
System.out.print("Enter the second text: ");
String text2 = scanner.nextLine();
// Check if the texts are anagrams
boolean result = areAnagrams(text1, text2);
// Display the result
if (result) {
System.out.println("The texts are anagrams.");
} else {
System.out.println("The texts are not anagrams.");
}
scanner.close();
} 24
}