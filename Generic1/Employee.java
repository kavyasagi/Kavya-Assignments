package Generic1;
import java.util.HashSet;

public class Employee {
	int id;
	String name;
	double salary;
	String department;
	Employee() {}
	public Employee(int id,String name, double salary,String department) {
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
	}
	void display(HashSet<Employee> O) {
		for(Employee b:O) {
			System.out.println(b.id+" "+b.name+" "+b.salary+" "+b.department);
		}
	}
}

