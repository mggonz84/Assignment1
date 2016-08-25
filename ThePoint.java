
public class ThePoint {
	
	int x;
	int y;
	
	public ThePoint(){
		x = 0;
		y = 0;
	}
	public ThePoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String toString(){
		return "(" + x + "," + y + ")";
	}
	public int distance(int x1, int y1, int x2, int y2){
		int x = x2-x1;
		int y = y2-y1;
		int d = (int)(Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2))));
		return d;
	}
}
