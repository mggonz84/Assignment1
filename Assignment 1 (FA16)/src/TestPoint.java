import java.text.DecimalFormat;
import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		ThePoint p = new ThePoint();
		Scanner user = new Scanner (System.in);
		DecimalFormat space = new DecimalFormat("0.0000");
		
		System.out.println("Enter the first coordinates.");
		System.out.print("Enter x: ");
		double x1 = user.nextInt();
		System.out.print("Enter y: ");
		double y1 = user.nextInt();
		
		System.out.println("Enter the second coordinates.");
		System.out.print("Enter x: ");
		double x2 = user.nextInt();
		System.out.print("Enter y: ");
		double y2 = user.nextInt();
		
		p = new ThePoint(x1,y1);
		System.out.println("1st Coordinates: " + p.toString());
		
		p = new ThePoint(x2,y2);
		System.out.println("2nd Coordinates: " + p.toString());
		
		System.out.println("Distance: " + space.format(p.distance(x1, y1, x2, y2)));
		
		user.close();

	}

}
