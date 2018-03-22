package hwpracticelab;

public class TestPerson {
      
	public static void main(String[] args) {
	Employee e=new Employee();
	Manager m=new Manager();
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
	
	
	}	
	}
