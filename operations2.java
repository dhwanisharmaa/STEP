import java.util.Scanner;
public class operations2{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	//input variables
	double a = input.nextDouble();
	double b = input.nextDouble();
	double c = input.nextDouble();
	// a + b *c, a * b + c, c + a / b, and a % b + c perform opertaions
	double result1 = a + b *c;
	double result2 = a * b + c;
	double result3 = c + a / b;
	double result4 = a % b + c;
	//print result
	System.out.println("the results of int operations are " + result1 + "," + result2 + "," + result3 + "," + result4 + ",");
	}}
	