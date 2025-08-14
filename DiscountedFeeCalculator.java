import java.util.Scanner; 
public class DiscountedFeeCalculator {
public static void main(String[] args) { 
// Create Scanner object to take user input 
Scanner input = new Scanner(System.in); 
// Take input for fee and discount percentage 
System.out.print("Enter the fee amount: INR "); 
double fee = input.nextDouble(); 
System.out.print("Enter the discount percentage: "); 
double discountPercent = input.nextDouble(); 
// Calculate discount amount 
double discount = (discountPercent / 100) * fee; 
// Calculate final discounted fee 
double discountedFee = fee - discount; 
// Print the result 
System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee); 
// Close the Scanner object
input.close(); 
} 
}
