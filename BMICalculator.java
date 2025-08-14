import java.util.Scanner; // Scanner import
public class BMICalculator {
 public static void main(String args[]) {
 Scanner input = new Scanner(System.in); // Scanner object
 double[][] personData = new double[10][3]; // 2D array for 10 persons[weight, height, BMI]
 String[] bmiStatus = new String[10]; // Array to store BMI status

 // Get weight and height for all team members
 for (int i = 0; i < 10; i++) {
 System.out.println("Enter weight (in kg) for person " + (i + 1) +": "); // Prompt for weight
 personData[i][0] = input.nextDouble(); // Read weight

 System.out.println("Enter height (in cm) for person " + (i + 1) +": "); // Prompt for height
 personData[i][1] = input.nextDouble(); // Read height
 }

 // Calculate BMI for each person
 calculateBMI(personData);

 // Determine BMI status for each person
 bmiStatus = determineBMIStatus(personData);

 // Display results
 System.out.println("\nBMI Results:");
 System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");

 for (int i = 0; i < 10; i++) {
 System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n",
 (i + 1), personData[i][0], personData[i][1],personData[i][2], bmiStatus[i]);
 }
 }

 // Method to calculate BMI for all persons
 public static void calculateBMI(double[][] personData) {
 for (int i = 0; i < personData.length; i++) {
 double weight = personData[i][0];
 double heightInMeters = personData[i][1] / 100; // Convert cm tometers

 // Calculate BMI = weight / (height * height)
 personData[i][2] = weight / (heightInMeters * heightInMeters);
 }
 }

 // Method to determine BMI status for all persons
 public static String[] determineBMIStatus(double[][] personData) {
 String[] status = new String[personData.length];

 for (int i = 0; i < personData.length; i++) {
 double bmi = personData[i][2];

 if (bmi < 18.5) {
 status[i] = "Underweight";
 } else if (bmi < 25.0) {
 status[i] = "Normal weight";
 } else if (bmi < 30.0) {
 status[i] = "Overweight";
 } else {
 status[i] = "Obese";
 }
 }

 return status;
 }
}
