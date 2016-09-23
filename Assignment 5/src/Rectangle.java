
public class Rectangle extends GeometricObject{
	
	double width;
	double height;
	
	public Rectangle(String c, boolean f, double width, double height) {
		setColor(c);
		setFilled(f);
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return width*height;
	}

	@Override
	public double getPerimeter() {
		return width*2+height*2;
	}

	@Override
	public String toString() {
		return "width = " + width + ", height = " + height + ", Area = " + getArea() + ", Perimeter = "
				+ getPerimeter() + ", Color = " + getColor() + ", Filled = " + isFilled();
	}
	
	
	
}
