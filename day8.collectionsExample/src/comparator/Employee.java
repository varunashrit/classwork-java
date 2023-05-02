package comparator;

public class Employee{
	private int empId;
	private String fName;
	private String lName;
	private double salary;
	private int age;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(int empId, String fName, String lName, double salary, int age) {
		super();
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.salary = salary;
		this.age = age;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fName=" + fName + ", lName=" + lName + ", salary=" + salary + ", age="
				+ age + "]";
	}
	

	
	
}
