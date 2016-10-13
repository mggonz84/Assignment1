
public class TestPayroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Payroll worker = new Payroll("", 123);
			//worker.setHourlyPayRate(30);
			//worker.setHoursWorked(100);
		}
		catch(InvalidNameException | InvalidIDException e)
		{
			System.out.println("Error - " + e.getMessage());
		}
		
		
	}

}
