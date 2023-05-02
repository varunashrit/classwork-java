package streamAPI;

public class Employee {
	private String department;
	private Double salary;
	private int empID;
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public Employee(String department, Double salary, int empID) {
		super();
		this.department = department;
		this.salary = salary;
		this.empID = empID;
	}
	
	@Override
	public String toString() {
		return "Employee [department=" + department + ", salary=" + salary + ", empID=" + empID + "]";
	}
	public Employee() {
		super();
	}
	
}