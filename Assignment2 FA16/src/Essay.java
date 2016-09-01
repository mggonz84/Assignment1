
public class Essay extends GradedActivity{
	
	double Grammar;  //Grammar 25 points
	double Spelling; //Spelling 35 points
	double Content;  //Content 40 points
	public Essay()
	{
		Grammar = 0;
		Spelling = 0;
		Content = 0;
	}
	
	public Essay(double gScore, double sScore, double cScore)
	{
		double s; //hold the total score
		
		Grammar = gScore;
		if(Grammar > 25 || Grammar < 0)//Grammar 25 points
		{
			System.out.println("You entered a number that isn't within the Grammar grading range.\nPlease check the number you entered again.");
			Grammar = 0;
		}
		Spelling = sScore;
		if(Spelling > 35 || Spelling < 0)//Spelling 35 points
		{
			System.out.println("You entered a number that isn't within the Spelling grading range.\nPlease check the number you entered again.");
			Spelling = 0;
		}
		Content = cScore;
		if(Content > 40 || Content < 0)//Content 40 points
		{
			System.out.println("You entered a number that isn't within the Content grading range.\nPlease check the number you entered again.");
			Content = 0;
		}
		
		s = Grammar + Spelling + Content;
		
		setScore(s);
	}
	
	public double getGrammar() {
		return Grammar;
	}
	public void setGrammar(double grammar) {
		Grammar = grammar;
	}
	public double getSpelling() {
		return Spelling;
	}
	public void setSpelling(double spelling) {
		Spelling = spelling;
	}
	public double getContent() {
		return Content;
	}
	public void setContent(double content) {
		Content = content;
	}
	
	

}
