import java.util.Scanner;
class Naturalnum {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		double sum = number*(number+1)/2;
		if (number > 0) {
			System.out.println("The number is a natural number");
			System.out.println(sum);
		}
		else {
			System.out.println("The number is not a natural number");
		}
		input.close();
	}
}