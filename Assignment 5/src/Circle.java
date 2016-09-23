
public class Circle extends GeometricObject {
	double radius;
	
	public Circle(String c, boolean f, double radius) {
		setColor(c);
		setFilled(f);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	public String toString() {
		return "radius = " + radius + ", Area = " + getArea() + ", Perimeter = " + getPerimeter()
				+ ", Color = " + getColor() + ", Filled = " + isFilled();
	}
	
	

}
