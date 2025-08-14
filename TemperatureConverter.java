public class TemperatureConverter {
 // Temperature conversions
 public static double convertFahrenheitToCelsius(double fahrenheit) {
 return (fahrenheit - 32) * 5 / 9;
 }

 public static double convertCelsiusToFahrenheit(double celsius) {
 return (celsius * 9 / 5) + 32;
 }

 // Main method for testing
 public static void main(String[] args) {
 // Test examples
 System.out.println("98.6 Fahrenheit = " +
convertFahrenheitToCelsius(98.6) + " Celsius");
 System.out.println("37 Celsius = " + convertCelsiusToFahrenheit(37) +" Fahrenheit");
 }
}
