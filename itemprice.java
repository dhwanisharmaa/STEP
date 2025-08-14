import java.util.Scanner;
public class itemprice{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	//user input
	float unit = input.nextFloat();
	int quantity = input.nextInt();
	//calculating total price
	double price = unit*quantity;
	//print result
	System.out.println("the price of the item is " + price);
	}}
	
