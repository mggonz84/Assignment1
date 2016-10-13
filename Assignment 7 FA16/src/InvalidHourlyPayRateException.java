
public class InvalidHourlyPayRateException extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//gives me error unless I have this

	//invalid hourly pay rate
	//negative number or number greater than 25
	
	public InvalidHourlyPayRateException()
	   {
	      super("Error: Invalid Hourly Pay Rate");
	   }


	   public InvalidHourlyPayRateException(double hpr)
	   {
	      super("Error: Invalid Hourly Pay Rate: " +
	            hpr);
	   }

}
