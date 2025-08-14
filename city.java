import java.util.Scanner;
public class city{
	public static void main(String[]args){
    Scanner input = new Scanner(System.in);
	//creating varibles
	String name = input.nextLine();
	String fromCity = input.nextLine();
	String viaCity = input.nextLine();
	String FinalCity = input.nextLine();
	double distanceFromToVia = input.nextDouble();
	double timeFromToVia = input.nextDouble();
	double distanceViaToFinal = input.nextDouble();
	double timeViaToFinal = input.nextDouble();
	//total distrances and time
	double total_distance = distanceFromToVia + distanceViaToFinal;
	double total_time = timeFromToVia + timeViaToFinal;
	//print result
	System.out.println("the total distance travelled by " + name + " is " + total_distance + " and total time taken is " + total_time);
	}
	}

