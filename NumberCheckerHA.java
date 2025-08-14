public class NumberCheckerHA {

    // Method to count the number of digits in a number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store each digit in an array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to calculate sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to calculate sum of squares of digits using Math.pow()
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if number is a Harshad number
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find frequency of each digit in the number
    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10]; // Digits 0 to 9
        for (int digit : digits) {
            freq[digit]++;
        }

        // Store digit and frequency in a 2D array
        int[][] freqArray = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freqArray[i][0] = i;         // digit
            freqArray[i][1] = freq[i];   // frequency
        }
        return freqArray;
    }

    // Main method to demonstrate all functionalities
    public static void main(String[] args) {
        int number = 1729;  // Example number

        System.out.println("Number: " + number);

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Digit Count: " + digitCount);

        // Get digits array
        int[] digits = getDigitsArray(number);
        System.out.print("Digits Array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Sum of digits
        int digitSum = sumOfDigits(digits);
        System.out.println("Sum of Digits: " + digitSum);

        // Sum of squares of digits
        int squareSum = sumOfSquares(digits);
        System.out.println("Sum of Squares of Digits: " + squareSum);

        // Check Harshad number
        boolean isHarshad = isHarshad(number, digits);
        System.out.println("Is Harshad Number? " + (isHarshad ? "Yes" : "No"));

        // Digit frequency
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1]);
            }
        }
    }
}
