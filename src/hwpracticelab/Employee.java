package hwpracticelab;

public class Employee extends Habits implements  Person{
   static int counte;
	private int empId;
	private String empName;
	private Double empSalary;
	Employee()
	{
		counte++;
		//System.out.println("total number of employees" + counte);
	}
	public void eat()
	{
		System.out.println("employee can eat");
	}
	public void sleep()
	{
		System.out.println("employee can sleep");
	}
	public void reading()
	{
		System.out.println("employee can read");
	}
	public void working() {
		System.out.println("employees can work");
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	
		}
