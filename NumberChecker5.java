public class NumberChecker5 {

    // Method to check if a number is a Prime number
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a Neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Method to check if a number is a Spy number
    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an Automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // Method to check if a number is a Buzz number
    public static boolean isBuzz(int number) {
        return (number % 7 == 0 || number % 10 == 7);
    }

    // Main method to call all static methods
    public static void main(String[] args) {
        int number = 7;

        System.out.println("Number: " + number);

        // Prime check
        System.out.println("Is Prime? " + (isPrime(number) ? "Yes" : "No"));

        // Neon check
        System.out.println("Is Neon Number? " + (isNeon(number) ? "Yes" : "No"));

        // Spy check
        System.out.println("Is Spy Number? " + (isSpy(number) ? "Yes" : "No"));

        // Automorphic check
        System.out.println("Is Automorphic Number? " + (isAutomorphic(number) ? "Yes" : "No"));

        // Buzz check
        System.out.println("Is Buzz Number? " + (isBuzz(number) ? "Yes" : "No"));
    }
}
