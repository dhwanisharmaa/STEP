import java.util.Scanner;
import java.util.Random;

public class StudentScorecard {

    // Generate random marks for PCM
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] marks = new int[numStudents][3]; // [][0] = Physics, [][1] = Chemistry, [][2] = Math

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = 40 + rand.nextInt(61); // Random marks from 40 to 100
            }
        }

        return marks;
    }

    // Calculate total, average and percentage
    public static double[][] calculateScores(int[][] marks) {
        int numStudents = marks.length;
        double[][] results = new double[numStudents][3]; // [][0] = Total, [][1] = Avg, [][2] = Percentage

        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percent * 100.0) / 100.0;
        }

        return results;
    }

    // Display scorecard
    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("ID\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\n",
                (i + 1), marks[i][0], marks[i][1], marks[i][2],
                results[i][0], results[i][1], results[i][2]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        int[][] studentMarks = generateScores(numStudents);
        double[][] scoreData = calculateScores(studentMarks);
        displayScorecard(studentMarks, scoreData);
    }
}
