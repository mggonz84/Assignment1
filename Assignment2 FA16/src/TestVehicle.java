
public class TestVehicle {

	public static void main(String[] args) {
		Truck t = new Truck(2009,2500.45,"2tu123","Dodge",1200.0);
		Car c = new Car(2006,2100.56,"1RT245","Honda",5);
		Tank tk = new Tank(2011,7000.56,4.56);
		
		System.out.println(c.toString());
		System.out.println(t.toString());
		System.out.println(tk.toString());

	}

}
