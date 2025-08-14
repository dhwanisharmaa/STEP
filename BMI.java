import java.util.Scanner;
public class BMI{
public static String[][] computeBMIStatus(double[][] data) {
String[][] result = new String[10][4];
for(int i=0;i<10;i++) {
double weight = data[i][0];
double height = data[i][1]/100;
double bmi = weight/(height*height);
String status = "";
if(bmi<=18.4)status="Underweight";
else if(bmi>=18.5&&bmi<24.9)status="Normal weight";
else if(bmi>=25&&bmi<39.9)status="Overweight";
else if(bmi>=40)status="Obese";
result[i][0] = data[i][1] + " cm";
result[i][1] = weight + " kg";
result[i][2] = String.format("%.2f", bmi);
result[i][3] = status;
}
return result;
}
public static void displayBMIStatus(String[][] data) {
System.out.println("Height\t\tWeight\t\tBMI\t\tStatus");
for(int i=0;i<10;i++) {
System.out.println(data[i][0] + "\t" + data[i][1] + "\t" + data[i][2] + "\t" + data[i][3]);
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double[][] data = new double[10][2];
for(int i=0;i<10;i++) {
System.out.println("Enter weight (kg) and height (cm) for person " + (i+1));
data[i][0] = sc.nextDouble();
data[i][1] = sc.nextDouble();
}
String[][] result = computeBMIStatus(data);
displayBMIStatus(result);
}
}