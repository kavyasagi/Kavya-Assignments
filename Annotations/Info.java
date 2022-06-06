package Annotations;

import Annotations.TeatAnnotation.Testinfo;

public class Info {
	@Testinfo(Developer="Kavya", DeveloperID="07635",Supervisior="Saisree",Date="24/02/2022",Time="05:40pm",Description="i am happy")
	void fun1()
	{
		System.out.println("Test method 1");
	}

	@Testinfo(Developer="Rashi", DeveloperID="17635",Supervisior="Kavitha",Date="23/02/2022",Time="06:40pm",Description="i am soo happy")
	void fun2()
	{
		System.out.println("Test method 2");
	}
	public static void main(String args[])
	{
		System.out.println("Hello");
	}

}
