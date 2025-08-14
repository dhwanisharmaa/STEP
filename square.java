import java.util.Scanner;
public class square{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		//user input
		float peri = input.nextFloat();
		//finding side 
		float side = peri/4;
		System.out.println("side of the traingle is " + side);
}
}		