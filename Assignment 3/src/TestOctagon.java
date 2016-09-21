
//OK
import java.util.Scanner;

public class TestOctagon {

	public static void main(String[] args) {
		
		Octagon o = new Octagon();
		Scanner user = new Scanner(System.in);
		
		System.out.print("Side length = ");
		int l = user.nextInt();
		
		o = new Octagon(l);
		
		System.out.println(o.toString());
		
		System.out.println(o.getDateCreated());
		
		user.close();
		
	}

}

