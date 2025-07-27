package Day6.StaticVariable;

public class EmployeeExecute {
	public static void main(String[] args) {
		System.out.println(Employee.companyName);
		Employee e = new Employee("Ragavi", 123);
		System.out.println(e);
		
		e = new Employee("Thamizh", 321);
		System.out.println(e);
	}
}

