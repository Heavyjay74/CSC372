package module1;

public class Test extends Employee{

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setFirstName("Jason");
		employee.setLastName("Smith");
		employee.setEmployeeID(1);
		
		employee.employeeSummary();
		
		Manager manager = new Manager();
		manager.setFirstName("Michael");
		manager.setLastName("Scott");
		manager.setEmployeeID(2);
		
		manager.setDepartment("Sales");
			
		manager.employeeSummary();
		
		
			Piano piano = new Piano();
			piano.manufacturer = "Casio";
			piano.model = "SA-77";
			piano.numberOfKeys = 44;
			
			piano.printInfo();
		
	}

}
