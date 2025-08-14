import java.util.Scanner;
public class UniqueCharacters {
public static int getLength(String text) {
int length = 0;
while(true) {
if(text.charAt(length) == '\0') break;
length++;
}
return length;
}
public static char[] findUniqueCharacters(String text) {
int length = getLength(text);
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
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String input = sc.nextLine();
char[] uniqueChars = findUniqueCharacters(input);
System.out.print("Unique characters: ");
for(char c : uniqueChars) {
System.out.print(c + " ");
}
}
}