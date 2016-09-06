
public class CargoShip extends Ship{
	int cCapacity;
	
	public CargoShip() {
		
	}
	
	public CargoShip(String s, int c) {
		setShip(s);
		cCapacity = c;
	}

	public int getcCapacity() {
		return cCapacity;
	}

	public void setcCapacity(int cCapacity) {
		this.cCapacity = cCapacity;
	}
	public String toString(){
		return "Name: " + ship + "\nCargo Capacity: " + cCapacity;
	}

}
