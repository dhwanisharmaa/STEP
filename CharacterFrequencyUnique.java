import java.util.Scanner;
public class CharacterFrequencyUnique {
13
// Method to find unique characters in a string using charAt()
public static char[] findUniqueCharacters(String text) {
int length = text.length();
char[] uniqueChars = new char[length];
int uniqueIndex = 0;
// Nested loop to find unique characters
for (int i = 0; i < length; i++) {
char currentChar = text.charAt(i);
boolean isUnique = true;
// Check if the current character is unique
for (int j = 0; j < i; j++) {
if (uniqueChars[j] == currentChar) {
isUnique = false;
break;
}
}
// If the character is unique, add it to the uniqueChars array
if (isUnique) {
uniqueChars[uniqueIndex] = currentChar;
uniqueIndex++;
}
}
// Return a new array with only the unique characters
char[] result = new char[uniqueIndex];
System.arraycopy(uniqueChars, 0, result, 0, uniqueIndex);
return result; 14
}
// Method to find the frequency of characters in a string using unique characters
public static String[][] findCharacterFrequency(String text) {
// Create an array to store the frequency of characters (256 for ASCII)
int[] frequency = new int[256];
// Loop through the text to find the frequency of each character
for (int i = 0; i < text.length(); i++) {
char ch = text.charAt(i);
frequency[ch]++;
}
// Find the unique characters
char[] uniqueChars = findUniqueCharacters(text);
// Create a 2D array to store the characters and their frequencies
String[][] result = new String[uniqueChars.length][2];
for (int i = 0; i < uniqueChars.length; i++) {
result[i][0] = String.valueOf(uniqueChars[i]); // Character
result[i][1] = String.valueOf(frequency[uniqueChars[i]]); // Frequency
}
return result;
}
// Method to display the frequency results
public static void displayFrequency(String[][] result) {
System.out.println("Character | Frequency");
System.out.println("----------------------"); 15
for (int i = 0; i < result.length; i++) {
System.out.println(result[i][0] + " | " + result[i][1]);
}
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Take user input for the string
System.out.print("Enter a string: ");
String input = scanner.nextLine();
// Find the character frequencies
String[][] frequencyResult = findCharacterFrequency(input);
// Display the frequency results
displayFrequency(frequencyResult);
scanner.close();
}
}