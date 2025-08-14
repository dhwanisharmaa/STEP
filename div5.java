import java.util.Scanner;
public class div5{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);
	int a = input.nextInt();
	if (a%5=0) {
	System.out.println("The number" + a + "is divisible by 5");
	}
	else{
	System.out.println("The number" + a + "is not divisible by 5");
	}
	}
}