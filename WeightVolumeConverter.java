public class WeightVolumeConverter {
 // Weight conversions
 public static double convertPoundsToKilograms(double pounds) {
 double pounds2kilograms = 0.453592;
 return pounds * pounds2kilograms;
 }

 public static double convertKilogramsToPounds(double kilograms) {
 double kilograms2pounds = 2.20462;
 return kilograms * kilograms2pounds;
 }

 // Volume conversions
 public static double convertGallonsToLiters(double gallons) {
 double gallons2liters = 3.78541;
 return gallons * gallons2liters;
 }

 public static double convertLitersToGallons(double liters) {
 double liters2gallons = 0.264172;
 return liters * liters2gallons;
 }

 // Main method for testing
 public static void main(String[] args) {
 // Test examples
 System.out.println("10 pounds = " + convertPoundsToKilograms(10) + "kilograms");
 System.out.println("5 gallons = " + convertGallonsToLiters(5) + "liters");
 }
}
