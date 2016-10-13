
public class InvalidHoursWorkedException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//gives me error unless I have this

	//invalid number of hours worked
	//could be negative or greater than 84
	
	public InvalidHoursWorkedException()
	   {
	      super("Error: Invalid Number of Hours Worked");
	   }


	   public InvalidHoursWorkedException(double h)
	   {
	      super("Error: Invalid Number of Hours Worked: " +
	            h);
	   }
}
