public class NumberChecker4 {

    // Method to count the number of digits in a number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store digits in an array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] original) {
        int[] reversed = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Method to check if number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] original = getDigitsArray(number);
        int[] reversed = reverseArray(original);
        return arraysEqual(original, reversed);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int i = 1; i < digits.length; i++) { // Skip the first digit (shouldn't be zero)
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Main method to test the utility methods
    public static void main(String[] args) {
        int number = 12021;

        System.out.println("Number: " + number);

        // Count of digits
        int count = countDigits(number);
        System.out.println("Digit Count: " + count);

        // Get digits array
        int[] digits = getDigitsArray(number);
        System.out.print("Digits Array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        // Reverse the digits array
        int[] reversed = reverseArray(digits);
        System.out.print("Reversed Digits: ");
        for (int d : reversed) System.out.print(d + " ");
        System.out.println();

        // Compare arrays
        boolean areEqual = arraysEqual(digits, reversed);
        System.out.println("Arrays Equal? " + (areEqual ? "Yes" : "No"));

        // Check Palindrome
        boolean isPalin = isPalindrome(number);
        System.out.println("Is Palindrome? " + (isPalin ? "Yes" : "No"));

        // Check Duck number
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is Duck Number? " + (isDuck ? "Yes" : "No"));
    }
}
