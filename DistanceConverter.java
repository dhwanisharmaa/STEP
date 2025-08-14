public class DistanceConverter {
 // Distance conversions
 public static double convertKmToMiles(double km) {
 double km2miles = 0.621371;
 return km * km2miles;
 }

 public static double convertMilesToKm(double miles) {
 double miles2km = 1.60934;
 return miles * miles2km;
 }

 public static double convertMetersToFeet(double meters) {
 double meters2feet = 3.28084;
 return meters * meters2feet;
 }

 public static double convertFeetToMeters(double feet) {
 double feet2meters = 0.3048;
 return feet * feet2meters;
 }

 public static double convertYardsToFeet(double yards) {
 double yards2feet = 3;
 return yards * yards2feet;
 }

 public static double convertFeetToYards(double feet) {
 double feet2yards = 0.333333;
 return feet * feet2yards;
 }

 public static double convertMetersToInches(double meters) {
 double meters2inches = 39.3701;
 return meters * meters2inches;
 }

 public static double convertInchesToMeters(double inches) {
 double inches2meters = 0.0254;
 return inches * inches2meters;
 }

 public static double convertInchesToCentimeters(double inches) {
 double inches2cm = 2.54;
 return inches * inches2cm;
 }

 // Main method for testing
 public static void main(String[] args) {
 // Test examples
 System.out.println("5 kilometers = " + convertKmToMiles(5) + "miles");
 System.out.println("3 meters = " + convertMetersToFeet(3) + " feet");
 System.out.println("10 inches = " + convertInchesToCentimeters(10) + "centimeters");
 }
}
