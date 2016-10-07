import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner user = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Enter the 1st Integer: ");
		a = user.nextInt();
		System.out.println("Enter the 2nd Integer: ");
		b = user.nextInt();
		
		try{
			System.out.println(a/b);
		}
		catch(ArithmeticException e){//ArithmeticException (if b == 0)
			System.out.println(e.getMessage());
			System.out.println("Please try again.");//b can't be a 0 or letter(not valid num)
		}
		catch(InputMismatchException e){//InputMismatchException(for placing a String instead of int)
			System.out.println(e.getMessage());
			System.out.println("Please only enter an Integer.");
		}
		
		
		user.close();

	}

}
