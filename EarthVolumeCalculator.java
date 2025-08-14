public class EarthVolumeCalculator { 
public static void main(String[] args) { 
// Define the radius of Earth in kilometers 
double radiusKm = 6378; 
// Define the value of pi 
double pi = Math.PI;
// Calculate the volume in cubic kilometers (formula: V = (4/3) * pi * r^3) 
double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3); 
// Conversion factor: 1 km^3 = 0.239913 cubic miles 
double volumeMiles3 = volumeKm3 * 0.239913; 
// Print the result 
System.out.println( "The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3 );
 }
} 
