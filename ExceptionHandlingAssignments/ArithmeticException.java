package Practice;

import java.util.Scanner;

public class ArithmeticException {
	public static void main(String args[]) {
		
		System.out.println("Main method start..");
		try
		{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Dividend number:");
		int dividend = sc.nextInt();
		
		System.out.println("Enter Divisor number:");
		int divisor = sc.nextInt();
		
		int result= dividend/divisor;
		
		System.out.println("Result is:"+result);
		sc.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Can't divide by zero");
		
		
	}

}
