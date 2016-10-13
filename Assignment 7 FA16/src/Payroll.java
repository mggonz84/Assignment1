
public class Payroll {
	String name;
	int id;
	double HourlyPayRate;
	double HoursWorked;
	
	public Payroll(){
		
	}
	
	public Payroll(String n, int i) throws InvalidNameException, InvalidIDException {
		name = n;
		id = i;
		
		 if(name == "")
	    	  throw new InvalidNameException();
		 
		 if(id < 0)
			 throw new InvalidIDException();
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getHourlyPayRate() {
		return HourlyPayRate;
	}
	public void setHourlyPayRate(double hourlyPayRate) {
		HourlyPayRate = hourlyPayRate;
	}
	public double getHoursWorked() {
		return HoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		HoursWorked = hoursWorked;
	}
	
	//Calculate gross pay (num of hrs worked * hr pay rate)
	public double CalculateGrossPay(double hrs, double hpr) throws InvalidHoursWorkedException, InvalidHourlyPayRateException{
		
		if(hrs < 0 || hrs > 84)
			 throw new InvalidHoursWorkedException();

		if(hpr < 0 || hpr > 25)
			 throw new InvalidHourlyPayRateException();

		
		return hrs*hpr;
	}
	
	

}
