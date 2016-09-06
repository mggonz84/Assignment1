
public class Ship {
	 String ship;
	 String yr;
	 
	 public Ship(){
		 
	 }
	 
	 public Ship(String s, String y){
		 ship = s;
		 yr = y;
	 }

	public String getShip() {
		return ship;
	}

	public void setShip(String ship) {
		this.ship = ship;
	}

	public String getYr() {
		return yr;
	}

	public void setYr(String yr) {
		this.yr = yr;
	}
	 
	 public String toString(){
		 return "Name: " + ship + "\nYear built: " + yr;
	 }
	 

}
