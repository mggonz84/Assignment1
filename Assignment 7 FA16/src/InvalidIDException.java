

public class InvalidIDException extends Exception{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//gives me error unless I have this
	
	//Invalid value is given for employee's ID num (could be negative)

	public InvalidIDException()
	   {
	      super("Error: Invalid Employee's ID Value");
	   }


	   public InvalidIDException(int id)
	   {
	      super("Error: Invalid Employee's ID Value: " +
	            id);
	   }
	
}
