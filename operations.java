import java.util.Scanner;
public class operations{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	//input variables
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	// a + b *c, a * b + c, c + a / b, and a % b + c perform opertaions
	int result1 = a + b *c;
	int result2 = a * b + c;
	int result3 = c + a / b;
	int result4 = a % b + c;
	//print result1
	System.out.println("the results of int operations are " + result1 + "," + result2 + "," + result3 + "," + result4 + ",");
	}}
	