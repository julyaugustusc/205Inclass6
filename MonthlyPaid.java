public class MonthlyPaid extends Employee {
	
	private double annualSalary;
	
	public MonthlyPaid(String name, double annualSalary) {
		super(name);
	}
	
	public MonthlyPaid(String name, double salary, double taxRate, double annualSalary) {
		super(name, salary, taxRate);
		this.annualSalary = annualSalary;
	}
	
	public void calculateSalary() {
		salary = annualSalary/12;
	}
	
	public String toString() {
		return "Name: " + name + " Monthly Salary: " + salary + " Taxes Paid: " + taxRate;
	}

}
