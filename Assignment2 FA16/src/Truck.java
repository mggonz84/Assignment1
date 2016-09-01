
public class Truck extends Automobile{
	double towCapacity;
	
	public Truck(){
		towCapacity = 0;
	}
	public Truck(int y, double w, String l, String m, double t){
		setYear(y);
		setWeight(w);
		setLicensePlate(l);
		setMake(m);
		towCapacity = t;
	}
	public double getTowCapacity() {
		return towCapacity;
	}
	public void setTowCapacity(double towCapacity) {
		this.towCapacity = towCapacity;
	}
	public String toString(){
		return getMake() + ": Year: " + getYear() + " weight: " + getWeight() + " License Plate: " + getLicensePlate() + " Make: " + getMake() + " Tow Capacity: " + towCapacity;
	}

}
