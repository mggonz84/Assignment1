import java.util.Scanner;

public class TestEssay {

	public static void main(String[] args) {
		
		Essay e = new Essay(); //This is a redundant statement as you instantiate essay object later on.
		Scanner user = new Scanner(System.in);
		
		System.out.println("Please enter the test scores for the essay:");
		System.out.print("Grammar: ");
		double g = user.nextDouble();
		
		System.out.print("Spelling: ");
		double s = user.nextDouble();
		
		System.out.print("Content: ");
		double c = user.nextDouble();
		
		e = new Essay(g,s,c);
		
		System.out.println("Grammar score: " + e.getGrammar());
		System.out.println("Spelling score: " + e.getSpelling());
		System.out.println("Content score: " + e.getContent());
		System.out.println("Total Score: " + e.getScore());
		System.out.println("Grade: " + e.getGrade());
		
		user.close();
	}

}
