import java.util.Scanner;

public class andshakeCalculator1 {
    // Method to calculate maximum number of handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculating maximum number of handshakes
        int handshakes = calculateHandshakes(numberOfStudents);

        // Displaying the result
        System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is: " + handshakes);
    }
}