import java.util.Scanner;
public class UnitConversion{
	public static void main(String ar[]){
		//GB to Bytes
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value in GB: ");
		int gb = scanner.nextInt();
		int bytes = gb * 1024 * 1024 * 1024;
		System.out.println(gb + "GB = "+ bytes + " Bytes");
		
		//Dollar to pkr
		System.out.println("Enter amount in dollars: ");
		double dollar = scanner.nextDouble();
		double rupees = 285.0 * dollar;
		System.out.println(dollar + " dollar = "+ rupees + " rupees");
		
		//feet to inches
		System.out.println("Enter value in feets: ");
		double feet = scanner.nextDouble();
		double inches = 12 * feet;
		System.out.println(feet + " feets = "+ inches + " inches");

		//meter to centimeter
		System.out.println("Enter value in meters: ");
		double meter = scanner.nextDouble();
		double centimeter = 100 * meter;
		System.out.println(meter + " meters = "+ centimeter + " centimeters");

		//hours to seconds
		System.out.println("Enter value in hours: ");
		int hours = scanner.nextInt();
		int seconds = hours * 60 * 60;
		System.out.println(hours + " hours = "+ seconds + " seconds");

		scanner.close();
	}
}
