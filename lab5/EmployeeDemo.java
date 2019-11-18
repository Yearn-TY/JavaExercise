
public class EmployeeDemo {

	public static void main(String[] args) {
		//Create the first employee,
		//use the no-arg constructor.
		Employee employee1 = new Employee();
		employee1.setName("Susan Meyers");
		employee1.setIdNumber(47899);
		employee1.setDepartment("Accounting");
		employee1.setPosition("Vice President");
		//Create the second employee, 
		//use the constructor that accepts argument 
		//for all of the fields.
		Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
		
		//Create the third employee, 
		//use the constructor that accepts the name and ID number.
		Employee employee3 = new Employee("Joy Rogers",81774);
		employee3.setDepartment("Manufacturing");
		employee3.setPosition("Engineer");
		
		int i=1;
		System.out.println("Employee #"+(i++));
		System.out.printf("Name: %s\nID Number: %d\nDepartment: %s\nPosition: %s\n"
				,employee1.getName(),employee1.getIdNumber(),employee1.getDepartment(),employee1.getPosition());
		System.out.println("\nEmployee #"+(i++));
		System.out.printf("Name: %s\nID Number: %d\nDepartment: %s\nPosition: %s\n"
				,employee2.getName(),employee2.getIdNumber(),employee2.getDepartment(),employee2.getPosition());
		System.out.println("\nEmployee #"+(i++));
		System.out.printf("Name: %s\nID Number: %d\nDepartment: %s\nPosition: %s\n"
				,employee3.getName(),employee3.getIdNumber(),employee3.getDepartment(),employee3.getPosition());

	}

}
