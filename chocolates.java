import java.util.Scanner;
public class chocolates{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	//creating variables user input
	int numberofchocolates = input.nextInt();
	int numberofchildren = input.nextInt();
	//distribution
	int distribution = numberofchocolates/numberofchildren;
	int remaining = numberofchocolates%numberofchildren;
	//print result
	System.out.println("number of chocolates each child will get is " + distribution + " and remaining chocolates are " + remaining);
	}
	}