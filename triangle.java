import java.util.Scanner;
public class triangle{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		//user input
		float base = input.nextFloat();
		float height = input.nextFloat();
		//area of triangle
		double area = (base*height)/2;
		System.out.println("area of traingle is" + area);
		double area_inch = area*0.39;
		System.out.println("area of traingle in inches is" + area_inch);
		}
		}


