
public class Car extends Automobile{
	int maxPassengers;
	
	public Car(){
		maxPassengers = 0;
	}
	public Car(int y, double w, String l, String m, int p){
		setYear(y);
		setWeight(w);
		setLicensePlate(l);
		setMake(m);
		maxPassengers = p;
	}
	public int getMaxPassengers() {
		return maxPassengers;
	}
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	public String toString(){
		return getMake() + ": Year: " + getYear() + " weight: " + getWeight() + " License Plate: " + getLicensePlate() + " Make: " + getMake() + " Max Passegers: " + maxPassengers;
	}

}
