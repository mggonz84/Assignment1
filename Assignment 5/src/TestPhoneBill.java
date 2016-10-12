
import java.text.DecimalFormat;
import java.util.Scanner;

public class TestPhoneBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in);
		DecimalFormat space = new DecimalFormat("#.##");
		
		System.out.println("This program will calculate your phone bill for you.");
		System.out.println("What is your call rate?");
		double cr = user.nextDouble();
		System.out.println("What is your monthly rate?");
		double mr = user.nextDouble();
		System.out.println("How many minutes did you talk?");
		int time = user.nextInt();
		
		PhoneBill l = new LongDistanceBill(mr,cr);
		
		System.out.println("Your monthly bill is $" + space.format(l.calculateBill(time)));
		
		user.close();

	}

}
