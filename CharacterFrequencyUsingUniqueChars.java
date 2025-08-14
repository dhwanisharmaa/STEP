import java.util.Scanner;
public class CharacterFrequencyUsingUniqueChars {
public static char[] uniqueCharacters(String text) {
int length = text.length();
char[] uniqueChars = new char[length];
int uniqueCount = 0;
for(int i=0;i<length;i++) {
char currentChar = text.charAt(i);
boolean isUnique = true;
for(int j=0;j<i;j++) {
if(currentChar == text.charAt(j)) {
isUnique = false;
break;
}
}
if(isUnique) {
uniqueChars[uniqueCount] = currentChar;
uniqueCount++;
}
}
char[] result = new char[uniqueCount];
for(int i=0;i<uniqueCount;i++) {
result[i] = uniqueChars[i];
}
return result;
}
public static String[][] findCharacterFrequency(String text) {
int[] frequency = new int[256];
for(int i=0;i<text.length();i++) {
frequency[text.charAt(i)]++;
}
char[] uniqueChars = uniqueCharacters(text);
String[][] result = new String[uniqueChars.length][2];
for(int i=0;i<uniqueChars.length;i++) {
result[i][0] = Character.toString(uniqueChars[i]);
result[i][1] = Integer.toString(frequency[uniqueChars[i]]);
}
return result;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String input = sc.nextLine();
String[][] result = findCharacterFrequency(input);
System.out.println("Character\tFrequency");
for(int i=0;i<result.length;i++) {
System.out.println(result[i][0] + "\t\t" + result[i][1]);
}
}
}