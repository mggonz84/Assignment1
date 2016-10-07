import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in);
		double[] a = new double[3];
		int counter = 0;
		while(counter != a.length){
			System.out.println("Enter a score: ");
			a[counter] = user.nextDouble();
			
			counter++;
		}
		
		Score s = new Score(a);
		
		System.out.println(s.getAverage());
		
		user.close();

	}

}
