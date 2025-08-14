import java.util.Scanner; 
public class HeightConverter {
public static void main(String[] args) { 
// Create Scanner object to take user input 
Scanner input = new Scanner(System.in); 
// Take input for height in centimeters 
System.out.print("Enter your height in centimeters: "); 
double heightCm = input.nextDouble(); 
// Conversion constants 
double cmInInch = 2.54; 
int inchesInFoot = 12;
// Convert height to inches 
double heightInInches = heightCm / cmInInch; 
// Convert height to feet and inches 
int feet = (int) heightInInches / inchesInFoot; 
int inches = (int) heightInInches % inchesInFoot; 
// Print the result 
System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches); 
// Close the Scanner object 
input.close(); 
} 
}
