package module1;

public class Manager extends Employee{
	
	private String department;
	
	public Manager ()  {
		salary = 0;
	}
	
	public void setDepartment (String dpt)  {
		department = dpt;
	}
	
	@Override
	public void employeeSummary ()  {
		super.employeeSummary();
		System.out.printf("Department: %s%n", department);
		System.out.println("");
	}

}
