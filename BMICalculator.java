import java.util.Scanner;
public class BMICalculator {
// Method to compute BMI and status
public static String[] computeBMI(double weight, double heightCm) {
double heightM = heightCm / 100; // convert cm to m
double bmi = weight / (heightM * heightM);
String status; 3
if (bmi < 18.5) {
status = "Underweight";
} else if (bmi < 25) {
status = "Normal";
} else if (bmi < 30) {
status = "Overweight";
} else {
status = "Obese";
}
return new String[] {
String.format("%.2f", heightCm),
String.format("%.2f", weight),
String.format("%.2f", bmi),
status
};
}
// Method to compute BMI for all persons
public static String[][] processAllBMI(double[][] data) {
String[][] result = new String[10][4];
for (int i = 0; i < 10; i++) {
double weight = data[i][0];
double height = data[i][1];
result[i] = computeBMI(weight, height);
}
return result; 4
}
// Method to display results in a table
public static void displayResults(String[][] result) {
System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
System.out.println("-------------------------------------------------------");
for (int i = 0; i < result.length; i++) {
System.out.printf("%-10s %-10s %-10s %-15s\n",
result[i][0], result[i][1], result[i][2], result[i][3]);
}
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double[][] data = new double[10][2]; // 10 persons, columns: weight, height
System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
for (int i = 0; i < 10; i++) {
System.out.printf("Person %d - Weight (kg): ", i + 1);
data[i][0] = scanner.nextDouble();
System.out.printf("Person %d - Height (cm): ", i + 1);
data[i][1] = scanner.nextDouble();
}
String[][] result = processAllBMI(data);
System.out.println("\nBMI Report:");
displayResults(result);
5
scanner.close();
}
}