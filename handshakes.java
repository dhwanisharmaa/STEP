import java.util.Scanner;
public class handshakes{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	//user input n =  number of students
	int n = input.nextInt();
	//combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes
	int numberofhandshakes = (n * (n - 1)) / 2;
	//display result
	System.out.println("the number of possible handshakes is " + numberofhandshakes);
	}
	}