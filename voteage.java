import java.util.Scanner;
class voteage {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int age = input.nextInt();
	if (age >= 18) {
		System.out.println("The person can vote");
	}
	else {
		System.out.println("The person cannot vote");
	}
  	input.close();
	}
}