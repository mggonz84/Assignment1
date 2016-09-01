
public class Tank extends Vehicle{
	double armorWidth;
	
	public Tank(){
		armorWidth = 0;
	}
	public Tank(int y, double w, double a){
		setYear(y);
		setWeight(w);
		armorWidth = a;
	}
	public double getArmorWidth() {
		return armorWidth;
	}
	public void setArmorWidth(double armorWidth) {
		this.armorWidth = armorWidth;
	}
	
	public String toString() {
		return "Tank: Year: " + getYear() + " weight: " + getWeight() + " Armor Width: " + armorWidth;
	}
	

}
