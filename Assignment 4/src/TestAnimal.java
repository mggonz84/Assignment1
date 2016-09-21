//OK

import java.util.Scanner;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner user = new Scanner(System.in);
		
		//make variables
		
		 System.out.print("Enter the Dog's breed: ");
		 String bA = user.nextLine();
		 System.out.print("Enter the Dog's name: ");
		 String nA = user.nextLine();
		 System.out.print("Enter the Dog's age: ");
		 int aA = user.nextInt();
		 
		 System.out.print("Enter the Lizard's breed: ");
		 String bB = user.next();
		 System.out.print("Enter the Lizard's name: ");
		 String nB = user.next();
		 System.out.print("Enter the Lizard's age: ");
		 int aB = user.nextInt();
		
		
		//enter variables to class
		Animal a = new Dog(bA,nA,aA);//breed, name, age
		Animal b = new Lizard(bB,nB,aB);//String, String, int
		
		//call other methods
		System.out.println(a.toString());
		System.out.println(a.makeNoise());
		System.out.println(a.groupBehavior());
		System.out.println("----------------");
		System.out.println(b.toString());
		System.out.println(b.makeNoise());
		System.out.println(b.groupBehavior());
		
		user.close();

	}

}
