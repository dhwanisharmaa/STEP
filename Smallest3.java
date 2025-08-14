import java.util.Scanner;
class  Smallest3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		if (number1 < number2) {
			if (number1 < number3) {
				System.out.println("number1 is smallest of 3");
			}
		}
		else {
			System.out.println("number1 isn't the smallest of 3");
		}
		input.close();
	}
}
			