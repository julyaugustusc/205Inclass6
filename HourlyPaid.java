public class HourlyPaid extends Employee {
	
	private double hoursWorked;
	private double hourlyRate;
	
	public HourlyPaid(String name, double hoursWorked, double hourlyRate) {
		super(name);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	public HourlyPaid(String name, double salary, double taxRate, double hoursWorked, double hourlyRate) {
		super(name, salary, taxRate);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	public void calculateSalary() {
		salary = hoursWorked * hourlyRate;
	}
	
	public String toString() {
		return "Name: " + name + " Monthly Salary: " + salary + " Taxes Paid: " + taxRate;
	}

}
