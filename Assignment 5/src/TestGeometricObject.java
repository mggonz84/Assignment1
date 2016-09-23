
public class TestGeometricObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GeometricObject[] g = new GeometricObject[4];
		//2 R, 2 C
		
		//System.out.println();
		g[0] = new Rectangle("Red", false, 48, 63); // Rectangle 1
		g[1] = new Rectangle("Red", true, 4, 14);	// Rectangle 2
		g[2] = new Circle("Red", false, 4.5);		// Circle 1
		g[3] = new Circle("Purple", false, 4.5);	// Circle 2
		
		System.out.println("Rectangle 1: " + g[0].toString());
		System.out.println("Rectangle 2: " + g[1].toString());
		System.out.println("Circle 1: " + g[2].toString());
		System.out.println("Circle 2: " + g[3].toString());
		
		System.out.println();
		
		// compare R vs. R, C vs. C, R vs. C
		//color, perimeter, area
		System.out.println("******* Rectangle 1 vs. Rectangle 2 *******"); // R1 & R2
		System.out.println("Color: " + g[0].compareColor(g[0],g[1]));
		System.out.println("Perimeter: " + g[0].comparePerimeter(g[0],g[1]));
		System.out.println("Area: " + g[0].compareArea(g[0],g[1]));
		
		System.out.println("******* Circle 1 vs. Circle 2 *******"); // C1 & C2
		System.out.println("Color: " + g[0].compareColor(g[2],g[3]));
		System.out.println("Perimeter: " + g[0].comparePerimeter(g[2],g[3]));
		System.out.println("Area: " + g[0].compareArea(g[2],g[3]));
		
		System.out.println("******* Rectangle 1 vs. Circle 1 ********"); // R1 & C1
		System.out.println("Color: " + g[0].compareColor(g[0],g[2]));
		System.out.println("Perimeter: " + g[0].comparePerimeter(g[0],g[2]));
		System.out.println("Area: " + g[0].compareArea(g[0],g[2]));


	}

}
