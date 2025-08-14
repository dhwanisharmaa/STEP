import java.util.Scanner;
public class swap{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	//taking user input on variables
	int number1 = input.nextInt();
	int number2 = input.nextInt();
	System.out.println("the original digits are " + number1 + number2); 
	//swapping numbers
	int temp;
	temp = number1;
	number1 = number2;
	number2 = temp;
	//print result
	System.out.println(" the swapped digits are " + number1 + number2);
	}}
	