package Collections;

import java.util.TreeSet;

public class CFG {
	public static void main(String[] args)
	{
		// TreeSet of user defined objects
		// we will create TreeSet of employees
		System.out.println(
				"Sorting on the basis of name ascending order");

		TreeSet<Employee> gfg
		= new TreeSet<>((Employee e1, Employee e2)
				->
		- (e1.name).compareTo(e2.name));
		gfg.add(new Employee(1, "Ravali", 24,"IT"));
		gfg.add(new Employee(2, "krishna", 23,"IT"));
		gfg.add(new Employee(3, "sita", 26,"IT"));
		gfg.add(new Employee(4, "lakshman", 25,"IT"));
		gfg.add(new Employee(1, "Vani", 24,"IT"));
		gfg.add(new Employee(2, "Kavya", 23,"IT"));
		gfg.add(new Employee(3, "Sunitha", 26,"IT"));
		gfg.add(new Employee(4, "Aliya", 25,"IT"));
		gfg.add(new Employee(1, "Shravya", 24,"IT"));
		gfg.add(new Employee(2, "Shiva", 23,"IT"));
		for (Employee employee : gfg) {
			System.out.println(employee);
		}

		// SecondComparator
		System.out.println(
				"Sorting on the basis of name ascending order");

		TreeSet<Employee> gfg2 = new TreeSet<>(
				(Employee e1,
						Employee e2) -> e1.name.compareTo(e2.name));

		// adding employee object to treeSet
		gfg2.add(new Employee(1, "Ravali", 24,"IT"));
		gfg2.add(new Employee(2, "krishna", 23,"IT"));
		gfg2.add(new Employee(3, "sita", 26,"IT"));
		gfg2.add(new Employee(4, "lakshman", 25,"IT"));
		gfg2.add(new Employee(1, "Vani", 24,"IT"));
		gfg2.add(new Employee(2, "Kavya", 23,"IT"));
		gfg2.add(new Employee(3, "Sunitha", 26,"IT"));
		gfg2.add(new Employee(4, "Aliya", 25,"IT"));
		gfg2.add(new Employee(1, "Shravya", 24,"IT"));
		gfg2.add(new Employee(2, "Shiva", 23,"IT"));
		// printing every employee object
		for (Employee employee : gfg2) {
			System.out.println(employee);
		}
	}
}


