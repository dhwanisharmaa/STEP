import java.util.Scanner;
public class temp2{
	 public static void main(String[]args){
	 Scanner input = new Scanner(System.in);
	 //defien variables
	 float farenheit = input.nextFloat();
	 //Use the Formulae farenheit to celcius:  (°F − 32) x 5/9 = °C
	 double CelciusResult = (farenheit-32)*5/9;
	 //print rwsult
	 System.out.println("the temperature in farenheit " + farenheit + " is " + CelciusResult + " in celcius. ");
	 }}