
public class InvalidNameException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//gives me error unless I have this

	//Empty Sting is given for the employee's name
	
	public InvalidNameException()
	   {
	      super("Error: Empty String Name");
	      
	   }
	
	


}
