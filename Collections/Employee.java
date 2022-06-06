package Collections;

public class Employee {

	public int id;
	public String name;
	public String department;
	public int salary;

	Employee() {}

	Employee(int id, String name, int salary, String Department)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	@Override public String toString()
	{
		return "" + this.id + " " + this.name + " "
				+ this.salary+ " "+this.department;
	}
}
