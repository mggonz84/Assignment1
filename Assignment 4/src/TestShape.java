//OK

import java.util.Scanner;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner user = new Scanner(System.in);
		Shape[] sh = new Shape[3];
		
		//get users response
		System.out.print("Shape color: ");
		String color = user.nextLine();
		sh[0] = new Shape(color);

		System.out.println("**** Circle ****");
		System.out.print("Color: ");
		String co = user.nextLine();
		System.out.print("Radius: ");
		double ra = user.nextDouble();
		sh[1] = new Circle(co,ra);
		
		System.out.println("*** Rectangle ***");
		System.out.print("Color: ");
		String c2 = user.nextLine();
		System.out.print("Width: ");
		double wi = user.nextDouble();
		System.out.print("Height: ");
		double he = user.nextDouble();
		sh[2] = new Rectangle(c2, wi, he);
		
		//printout all toStrings
		for(int i = 0; i < sh.length; i++)
		{
			System.out.println(sh[i].toString());
			System.out.println("Area: " + sh[i].getArea());	//recheck with the other class
			System.out.println("-------------------------");
		}
					

		user.close();
 

	}

}
