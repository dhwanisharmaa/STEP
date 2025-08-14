import java.util.Scanner; 
public class DistanceConverter2 {
public static void main(String[] args) { 
// Create Scanner object to take user input 
Scanner input = new Scanner(System.in); 
// Ask user for distance in kilometers 
System.out.print("Enter distance in kilometers: "); 
double km = input.nextDouble(); 
// Conversion formula (1 mile = 1.6 km) 
double miles = km / 1.6; 
// Print the converted distance 
System.out.println(km + " kilometers is equal to " + miles + " miles."); 
// Close the Scanner object 
input.close();
} 
}
