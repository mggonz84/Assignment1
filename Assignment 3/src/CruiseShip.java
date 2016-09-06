
public class CruiseShip extends Ship{
	int maxPassengers;
	
	public CruiseShip() {
		
	}

	public CruiseShip(String s, int m) {
		setShip(s);
		maxPassengers = m;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	public String toString(){
		return "Name: " + ship + "\nMaximum passengers: " + maxPassengers;
		//figure out if ships name still comes 
	}

}
