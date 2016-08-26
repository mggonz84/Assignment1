import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		int random = (int)(Math.random()* 1000 + 1);
		int num;
		int counter = 0;
		int guess = 0;
		
		System.out.println("Guess a number berween 1 and 1000");
		while(counter == 0)
		{
			guess++;
			System.out.println("Enter your guess: ");
			num = user.nextInt();
			
			if(num > random)
			{
				System.out.println("Too high. Try again");
			}
			if(num < random)
			{
				System.out.println("Too low. Try again");
			}
			if(num == random)
			{
				counter = 1;
			}
		}
		
		System.out.println("Congratulations! You guessed the number! It took you " + guess + " tries to find it.");
		
		user.close();

		
	}

}
