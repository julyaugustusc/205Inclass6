import java.util.ArrayList;
public class Company {
	
	public static void main(String[] args) {
		ArrayList<Employee> empList= new ArrayList<Employee>(); // store employee objects

		// create employee object instances
		MonthlyPaid mpE1 = new MonthlyPaid("John William" , 55675.00);
		MonthlyPaid mpE2 = new MonthlyPaid("Nancy William" , 65675.00);
		HourlyPaid hpE1 = new HourlyPaid("Samira Monid", 7.50, 35);

		// add employee objects to the array list
		empList.add(mpE1);
		empList.add(mpE2);
		empList.add(hpE1);

		// calculate salary of each employee and put the object instance back in the list
		for(int i=0; i<empList.size() ; i++) {
			Employee e= empList.get(i);
			e.calculateSalary();
			empList.set(i,e);
		}
		// display each employee information
		for(int i=0; i<empList.size() ; i++){
			System.out.println(empList.get(i));
				}
		}
}