public class PenDistributor {
 public static void main(String[] args) {
 // Define total pens and number of students 
int totalPens = 14; 
int students = 3; 
// Calculate pens per student and remaining pens 
int pensPerStudent = totalPens / students;
int remainingPens = totalPens % students; 
// Print the result in a single statement 
System.out.println( "The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens ); 
}
} 
