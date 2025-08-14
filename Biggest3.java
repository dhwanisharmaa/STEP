import java.util.Scanner;
class  Biggest3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		if (number1 > number2) {
			if (number1 > number3) {
				System.out.println("number1 is biggest of 3");
			}
		}
		else if (number2 > number1 && number2 > number3) {
			System.out.println("number2 is biggest of 3");
		}
		else {
			System.out.println("number3 is the biggest of 3");
		}
		input.close();
	}
}
	