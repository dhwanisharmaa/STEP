import java.util.Scanner;
public class CharacterFrequency {
public static String[][] findCharacterFrequency(String text) {
int[] frequency = new int[256];
for(int i=0;i<text.length();i++) {
frequency[text.charAt(i)]++;
}
int uniqueCount = 0;
for(int i=0;i<256;i++) {
if(frequency[i] > 0) {
uniqueCount++;
}
}
String[][] result = new String[uniqueCount][2];
int index = 0;
for(int i=0;i<256;i++) {
if(frequency[i] > 0) {
result[index][0] = Character.toString((char)i);
result[index][1] = Integer.toString(frequency[i]);
index++;
}
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