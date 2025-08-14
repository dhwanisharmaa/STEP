import java.util.Arrays;
import java.util.Random;

public class FootballTeamHeights {
    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11, 150, 250);
        System.out.println("Player heights (cm): " + Arrays.toString(heights));
        
        int sum = sumOfHeights(heights);
        double mean = meanHeight(heights);
        int shortest = shortestHeight(heights);
        int tallest = tallestHeight(heights);
        
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.println("Mean height: " + mean + " cm");
    }
    
    /**
     * Generates an array of random heights within a specified range.
     * @param size The number of heights to generate.
     * @param min The minimum height value.
     * @param max The maximum height value.
     * @return An array of random heights.
     */
    public static int[] generateRandomHeights(int size, int min, int max) {
        int[] heights = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            heights[i] = random.nextInt(max - min + 1) + min;
        }
        return heights;
    }
    
    /**
     * Calculates the sum of all heights in the array.
     * @param heights The array of heights.
     * @return The sum of the heights.
     */
    public static int sumOfHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    
    /**
     * Calculates the mean height of the players.
     * @param heights The array of heights.
     * @return The mean height.
     */
    public static double meanHeight(int[] heights) {
        return (double) sumOfHeights(heights) / heights.length;
    }
    
    /**
     * Finds the shortest height in the array.
     * @param heights The array of heights.
     * @return The shortest height.
     */
    public static int shortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }
    
    /**
     * Finds the tallest height in the array.
     * @param heights The array of heights.
     * @return The tallest height.
     */
    public static int tallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}