import java.util.Scanner;
public class run{
	public static void main(String[]args){
	Scanner  input = new Scanner(System.in);
	//creating variables
	float side1 = input.nextFloat();
	float side2 = input.nextFloat();
	float side3 = input.nextFloat();
	//perimeter
	float perimeter = side1+ side2 + side3;
	float distance= 5;
	float rounds = distance/perimeter;
	//print result 
	System.out.println("the perimeter of park is " + perimeter + " and the number of rounds is " + rounds);
	}}
	