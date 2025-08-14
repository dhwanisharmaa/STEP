import java.util.Scanner;
public class qr{
	 public static void main(String[] args){
	 Scanner input = new Scanner(System.in);
	 //user input 
	 float number1 = input.nextFloat();
	 float number2 = input.nextFloat();
	 //calculations
	 double quotient = number1/number2;
	 double remainder = number1%number2;
	 //print result
	 System.out.println("the quotient is " + quotient + "the remainder is " + remainder);
	 }}