import java.util.Scanner;
public class temp{
	 public static void main(String[]args){
	 Scanner input = new Scanner(System.in);
	 //defien variables
	 float celcius = input.nextFloat();
	 //Use the Formulae Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F
	 double farenheitResult = celcius*9/5 + 32;
	 //print rwsult
	 System.out.println("the temperature in celcius " + celcius + " is " + farenheitResult + " in farenheit. ");
	 }}