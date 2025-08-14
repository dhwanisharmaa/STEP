import java.util.Scanner;
public class ArithmeticCalc
{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		//define variables
		float number1 = input.nextFloat();
		float number2 = input.nextFloat();
		//perform arithmetic operations
		double sum = number1+number2;
		double diff = number1-number2;
		double product = number1*number2;
		double division = number1/number2;
		//print the result
		System.out.println("addition  is" + sum + "subtraction is" + diff + " product is" + product + "division is" + division);
		}
		}
