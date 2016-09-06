
public class ThePoint {
	
	double x;
	double y;
	
	public ThePoint(){
		x = 0;
		y = 0;
	}
	public ThePoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String toString(){
		return "(" + x + "," + y + ")";
	}
	public double distance(double x1, double y1, double x2, double y2){
		double x = x2-x1;
		double y = y2-y1;
		double d = Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2)));
		return d;
	}
	/* It would be better to write the distance using public double distance(p2) {  
	
	you can use p1.distance(p2); This may be the most object-oriented way to write this program as no static methods are used.
	
	If you do it the way you did it above, you should make it static:
	
	public static double distance(int x1, int y1, int x2, int y2) {
	*/
}
