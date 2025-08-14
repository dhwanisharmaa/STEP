public class NumberChecker6 {

    // Method to find factors of a number
    public static int[] findFactors(int number) {
        int count = 0;
        // First loop: Count how many factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        // Second loop: Store factors in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find greatest factor (excluding the number itself if needed)
    public static int findGreatestFactor(int[] factors) {
        int max = 0;
        for (int i = 0; i < factors.length - 1; i++) { // exclude last factor (which is the number itself)
            if (factors[i] > max) max = factors[i];
        }
        return max;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find product of cubes of factors using Math.pow()
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if number is a perfect number
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) { // Proper divisors only
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }

    // Method to check if number is an abundant number
    public static boolean isAbundant(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) { // Proper divisors only
            if (number % i == 0) sum += i;
        }
        return sum > number;
    }

    // Method to check if number is a deficient number
    public static boolean isDeficient(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) { // Proper divisors only
            if (number % i == 0) sum += i;
        }
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Helper method to calculate factorial
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        int number = 28; // Try with 12 (abundant), 6 (perfect), 145 (strong)

        System.out.println("Number: " + number);

        // Get factors
        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        // Greatest factor
        int greatest = findGreatestFactor(factors);
        System.out.println("Greatest Factor (excluding itself): " + greatest);

        // Sum of factors
        int sum = sumOfFactors(factors);
        System.out.println("Sum of Factors: " + sum);

        // Product of factors
        long product = productOfFactors(factors);
        System.out.println("Product of Factors: " + product);

        // Product of cube of factors
        double cubeProduct = productOfCubeOfFactors(factors);
        System.out.println("Product of Cubes of Factors: " + cubeProduct);

        // Perfect number check
        System.out.println("Is Perfect Number? " + (isPerfect(number) ? "Yes" : "No"));

        // Abundant number check
        System.out.println("Is Abundant Number? " + (isAbundant(number) ? "Yes" : "No"));

        // Deficient number check
        System.out.println("Is Deficient Number? " + (isDeficient(number) ? "Yes" : "No"));

        // Strong number check
        System.out.println("Is Strong Number? " + (isStrong(number) ? "Yes" : "No"));
    }
}
