package hwpracticelab;

public class TestPerson {
      
	public static void main(String[] args) {
	Employee e=new Employee();
	Manager m=new Manager();
	Employee e1=new Employee();
	Manager m1=new Manager();
	//Habits h=new Employee();
	e.setEmpId(101);
	e.setEmpName("fatima");
	e.setEmpSalary(75000.00);
	System.out.println("Employee Id  " + e.getEmpId());
	System.out.println("Employee name  " + e.getEmpName());
	System.out.println("Employee salary  " + e.getEmpSalary());
	e.eat();
	e.sleep();
	e.reading();
	e.working();
	m.setmId(1);
	m.setManName("john");
	m.setManSalary(120000.00);
	System.out.println("Manager Id is " +m.getmId());
	System.out.println("Manager name  " + m.getManName());
	System.out.println("Manager salary  " + m.getManSalary());
	m.eat();
	m.reading();
	m.sleep();
	e.setEmpId(102);
	e.setEmpName("Fayyaz");
	e.setEmpSalary(85000.00);
	System.out.println("Employee Id  " + e.getEmpId());
	System.out.println("Employee name  " + e.getEmpName());
	System.out.println("Employee salary  " + e.getEmpSalary());
	e.eat();
	e.sleep();
	m.setmId(2);
	m.setManName("Mike");
	m.setManSalary(130000.00);
	System.out.println("Manager Id is " +m.getmId());
	System.out.println("Manager name  " + m.getManName());
	System.out.println("Manager salary  " + m.getManSalary());
	m.eat();
    //System.out.println(Employee.counte+Manager.countm);
	//System.out.println("Total no of employees "+ totalEmployees);
	System.out.println("Total no of Employees " +Employee.counte);
	System.out.println("Total no of Managers  " +Manager.countm);
	System.out.println("Total no of Employees  " + (Manager.countm+Employee.counte));
	}	
	}
