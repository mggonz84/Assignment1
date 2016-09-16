
public class Shape {
	String color; //private or protected?
	
	public Shape(){
		
	}
	public Shape(String c){
		color = c;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea(){
		return 0;
	}
	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	
	
	

}
