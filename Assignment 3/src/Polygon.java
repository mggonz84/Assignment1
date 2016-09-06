
public class Polygon extends GeometricObject1{
	int side;
	int sideLength;
	
	public Polygon(){
		side = 0;
		sideLength = 0;
	}
	public Polygon(int s,int l){
		side = s;
		sideLength = l;
	}
	public double getPerimeter(){
		return sideLength*side;
	}
	public double getAngle(){
		return (side - 2)*(180/side);
	}
	public int getSide(){
		return side;
	}
	public int getSideLength(){
		return sideLength;
	}

}