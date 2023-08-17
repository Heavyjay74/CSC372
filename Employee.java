package module1;

public class Employee {

	private String firstName;
	private String lastName;
	private int employeeID;
	protected double salary;
	
	public Employee () {
		salary = 0;
	}
	
	public String getFirstName ()  {
		return firstName;
	}
	public String getLastName()  {
		return lastName;
	}
	public int getEmployeeID()  {
		return employeeID;
	}
	public double getSalary ()  {
		return salary;
	}
	public void setFirstName( String fn)  {
		firstName = fn;
	}
	public void setLastName( String ln)  {
		lastName = ln;
	}
	public void setEmployeeID ( int id)  {
		employeeID = id;
	}
	public void setSalary (double sal)  {
		salary = sal;
	}
	
	public void employeeSummary()  {
		System.out.println("");
		System.out.printf("Name: %s, %s%n", lastName, firstName);
		System.out.printf("Employee ID: %06d%n", employeeID);
		System.out.printf("Salary: $%,.2f%n", salary);
		
	}
}
