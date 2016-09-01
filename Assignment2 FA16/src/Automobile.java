
public class Automobile extends Vehicle{
	String licensePlate;
	String make;
	
	public Automobile(){
		licensePlate = "unknown";
		make = "unknown";
	}
	public Automobile(int y, double w, String l, String m){
		setYear(y);
		setWeight(w);
		licensePlate = l;
		make = m;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public String toString(){
		return make + ": Year: " + getYear() + " weight: " + getWeight() + " License Plate: " + licensePlate + " Make: " + make;
	}

}
