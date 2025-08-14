import java.util.Arrays;

public class NumberChecker {
    public static void main(String[] args) {
        int number = 153; // Example number to demonstrate functionality

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Number of digits in " + number + ": " + digitCount);

        // Store digits
        int[] digits = storeDigits(number);
        System.out.println("Digits of " + number + ": " + Arrays.toString(digits));

        // Check duck number
        boolean isDuck = isDuckNumber(digits);
        System.out.println(number + " is a duck number? " + isDuck);

        // Check Armstrong number
        boolean isArmstrong = isArmstrongNumber(number, digits);
        System.out.println(number + " is an Armstrong number? " + isArmstrong);

        // Find largest and second largest digits
        int[] largestTwo = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestTwo[0] + ", Second largest digit: " + largestTwo[1]);

        // Find smallest and second smallest digits
        int[] smallestTwo = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestTwo[0] + ", Second smallest digit: " + smallestTwo[1]);
    }

    /**
     * Counts the number of digits in the given number.
     * @param number The number to count digits of.
     * @return The count of digits.
     */
    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        int count = 0;
        number = Math.abs(number); // Handle negative numbers
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    /**
     * Stores each digit of the number in an array.
     * @param number The number to extract digits from.
     * @return An array containing each digit of the number.
     */
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        number = Math.abs(number); // Handle negative numbers
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    /**
     * Checks if the number is a duck number (contains at least one non-zero digit).
     * @param digits The array of digits of the number.
     * @return true if the number is a duck number, false otherwise.
     */
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if the number is an Armstrong number.
     * @param number The original number.
     * @param digits The array of digits of the number.
     * @return true if the number is an Armstrong number, false otherwise.
     */
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == Math.abs(number);
    }

    /**
     * Finds the largest and second largest digits in the array.
     * @param digits The array of digits.
     * @return An array where the first element is the largest digit and the second is the second largest.
     */
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    /**
     * Finds the smallest and second smallest digits in the array.
     * @param digits The array of digits.
     * @return An array where the first element is the smallest digit and the second is the second smallest.
     */
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
}