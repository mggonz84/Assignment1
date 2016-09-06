
public class Octagon extends Polygon {
	public Octagon(){
		side = 8;
		sideLength = 0;
	}
	public Octagon(int l){
		side = 8;
		sideLength = l;
	}
	public double getArea(){
		return (2+2*Math.sqrt(2))*getSideLength()*getSideLength();
	}
	public String toString(){
		return "An octagon has " + getSide() + " sides\nA side length of " + getSideLength() + "\nAn area of " + getArea() + "\nA perimeter of " + getPerimeter() + "\nAn internal angle of " + getAngle();
		
	}

}