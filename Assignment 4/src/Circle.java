
public class Circle extends Shape{
	double radius;
	
	public Circle(){
		radius = 0;
	}
	public Circle(String c, double r){
		setColor(c);
		radius = r;
	}
	
	public double getArea(){
		return Math.PI*radius*radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getColor()=" + getColor() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
