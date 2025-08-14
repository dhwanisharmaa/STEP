import java.util.Scanner;
public class weight{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	//user input
	float pounds = input.nextFloat();
	//convert
	double kilograms = pounds*2.2;
	//display rsult
	System.out.println("weight in pounds is " + pounds + "and in kilograms is " + kilograms);
	}
	}