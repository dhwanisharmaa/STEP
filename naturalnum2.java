import java.util.Scanner;

class naturalnum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
        } else {
            int sumLoop = 0;
            
            // Corrected loop: iterate from n to 1 without unnecessary increment
            for (int i = n; i >= 1; i--) {
                sumLoop += i;
            }

            int sumFormula = n * (n + 1) / 2;

            // Print correct sum
            System.out.println("Sum is: " + sumLoop);
            System.out.println("Sum using formula: " + sumFormula);

            if (sumLoop == sumFormula) {
                System.out.println("Both computations are same.");
            } else {
                System.out.println("There is an error in the calculations.");
            }
        }
        input.close();
    }
}
