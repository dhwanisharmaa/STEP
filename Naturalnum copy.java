import java.util.Scanner;

public class Naturalnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            int sumLoop = 0, i = 1;
            while (i <= n) {
                sumLoop += i;
                i++;
            }
            
            int sumFormula = n * (n + 1) / 2;
            
            System.out.println("Sum using while loop: " + sumLoop);
            System.out.println("Sum using formula: " + sumFormula);
            
            if (sumLoop == sumFormula) {
                System.out.println("Both computations are same");
            } else {
                System.out.println("There is an error in the calculations.");
            }
        }
        
       input.close();
    }
}
