import java.util.Scanner;
public class income{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	//craeting variables user input
	double salary = input.nextDouble();
	double bonus = input.nextDouble();
	//total icnome
	double income = salary + bonus;
	//print rwsult
	System.out.println("the total income is " + income);
	}
	}
	