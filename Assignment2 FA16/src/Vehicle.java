
public class Vehicle {
	int year;
	double weight;
	
	public Vehicle(){
		year = 0;
		weight = 2000;
	}
	public Vehicle(int y, double w){
		year = y;
		weight = w;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String toString()
	{
		return "Year: " + year + " weight: " + weight;
	}
}
