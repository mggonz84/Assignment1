//OK
public class TestShip {

	public static void main(String[] args) {
		
		Ship [] s = new Ship[3];
		
		s[0] = new Ship("Triumph","1960");
		s[1] = new CruiseShip("Disney Magic",2400);
		s[2] = new CargoShip("Black Pearl",50000);
		
		for(int i = 0; i < s.length; i++)
		{
			System.out.println(s[i].toString());
			System.out.println("-------------------------");
		}
		
	}

}
