
public class Employee {
	private String name;    //The employee's name.
	private int idNumber;    //The employee's ID number.
	private String department;    //Hold the name of the department where the employee works.
	private String position;    //Hold the employee's job title.
	
	public Employee(String name,int idNumber,String department,String position) {
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;
	}
	public Employee(String name,int idNumber) {
		this.name = name;
		this.idNumber = idNumber;
		this.department = "";
		this.position = "";
	}
	public Employee() {
		this.name = "";
		this.idNumber = 0;
		this.department = "";
		this.position = "";
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public String getDepartment() {
		return department;
	}
	public String getPosition() {
		return position;
	}
}
