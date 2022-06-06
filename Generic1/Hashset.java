package Generic1;

import java.util.HashSet;

public class Hashset {
	public static void main(String args[]) {
		Employee emp=new Employee();
		
		Employee emp1 = new Employee(1,"A",42000,"CSE");
		Employee emp2 = new Employee(2,"B",34000,"ECE");
		Employee emp3 = new Employee(3,"C",26000,"EEE");
		
		HashSet<Employee> set=new HashSet<Employee>();
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		emp.display(set);
	}

}
