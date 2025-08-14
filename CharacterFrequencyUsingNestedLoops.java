import java.util.Scanner;
public class CharacterFrequencyUsingNestedLoops {
public static String[] findCharacterFrequency(String text) {
char[] characters = text.toCharArray();
int[] frequency = new int[characters.length];
for(int i=0;i<characters.length;i++) {
if(characters[i] != '0') {
frequency[i] = 1;
for(int j=i+1;j<characters.length;j++) {
if(characters[i] == characters[j]) {
frequency[i]++;
characters[j] = '0'; // Mark duplicate characters
}
}
}
}
String[] result = new String[characters.length];
int resultIndex = 0;
for(int i=0;i<characters.length;i++) {
if(characters[i] != '0' && frequency[i] > 0) {
result[resultIndex] = characters[i] + " - " + frequency[i];
resultIndex++;
}
}
String[] finalResult = new String[resultIndex];
for(int i=0;i<resultIndex;i++) {
finalResult[i] = result[i];
}
return finalResult;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String input = sc.nextLine();
String[] result = findCharacterFrequency(input);
System.out.println("Character Frequency:");
for(String res : result) {
System.out.println(res);
}
}
}