public class Score {

	double[] scores;
	
	public Score(double[] b){
		scores = b;
	}
	
	public double getAverage(){//returns the average of the scores
		double sum = 0;
		for(int i = 0; i<scores.length; i++){
			if(scores[i]<0 || scores[i]>100){
				throw new IllegalArgumentException("This is an IllegalArgumentException.");
			}
			else{
				sum = sum + scores[i];
			}
		}
		
		return sum / scores.length;
	}

}
