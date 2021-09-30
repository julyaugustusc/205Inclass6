public class Employee {
	
	protected String name;
	protected double salary;
	protected double taxRate;
	protected double taxPaid;
	
	public Employee(String name) {
		this.name = name;
		this.salary = 0;
		taxRate = 0;
	}

	public Employee(String name, double salary, double taxRate) {
		this.name = name;
		this.salary = salary;
		this.taxRate = taxRate;
	}
	
	public void calculateSalary() {
		//in children, no application here
	}
	
	public String toString() {
		return "This will always be overridden";
	}
	
	public void taxPaid() {
		taxPaid = salary * taxRate;
	}

}
