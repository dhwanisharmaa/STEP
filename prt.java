import java.util.Scanner;
public class prt{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	//variables user input
	float principal = input.nextInt();
	float rate = input.nextInt();
	float time = input.nextInt();
	//calculating simple intrest
	double simpleinterest = principal*rate*time/100;
	//print result
	System.out.println("the simple interest is " + simpleinterest);
	}
	}
	
	
	
	