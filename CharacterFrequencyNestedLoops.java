import java.util.Scanner;
public class CharacterFrequencyNestedLoops {
// Method to find the frequency of characters using nested loops
public static String[] findCharacterFrequency(String text) {
// Convert the string to a character array
char[] characters = text.toCharArray();
int length = characters.length;
String[] result = new String[length]; // Store the characters and frequencies
boolean[] counted = new boolean[length]; // Track characters that have been counted
// Outer loop to go through each character
int resultIndex = 0;
for (int i = 0; i < length; i++) {
// Skip if character is already counted
if (counted[i]) {
continue;
}
char currentChar = characters[i];
int frequency = 1;
// Inner loop to find duplicates 17
for (int j = i + 1; j < length; j++) {
if (characters[j] == currentChar) {
frequency++;
counted[j] = true; // Mark duplicate as counted
}
}
// Store the character and its frequency in the result array
result[resultIndex] = currentChar + ": " + frequency;
resultIndex++;
}
return result;
}
// Method to display the frequency results
public static void displayFrequency(String[] result) {
System.out.println("Character | Frequency");
System.out.println("----------------------");
for (String entry : result) {
if (entry != null) {
System.out.println(entry);
}
}
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Take user input for the string 18
System.out.print("Enter a string: ");
String input = scanner.nextLine();
// Find the character frequencies
String[] frequencyResult = findCharacterFrequency(input);
// Display the frequency results
displayFrequency(frequencyResult);
scanner.close();
}
}