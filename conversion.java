import java.util.Scanner;
public class conversion{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		//user input
		float feet = input.nextFloat();
		//converting 
		double yards = feet*0.33;
		double miles = yards*1760;
		//print result
		System.out.println("the distance in feet is " + feet + " in yards is " + yards + "in miles is " + miles);
		}}