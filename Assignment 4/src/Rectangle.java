
public class Rectangle extends Shape{
	double width;
	double height;
	
	public Rectangle(){
		width = 0;
		height = 0;
	}
	public Rectangle(String c, double w, double h){
		super(c);
		width = w;
		height = h;
		
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
	public double getArea(){
		return height*width;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getColor()=" + getColor() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
