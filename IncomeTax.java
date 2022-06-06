import java.util.Scanner;
public class IncomeTax {
	double inputIncome() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your gross income in INR: Rs.");
		double income=sc.nextDouble();
		
		return income;
	}
	double calculateTax(double income) {
		double tax=0;
		double appIncome=0;
		
		if(income<=180000) {
			tax=0;
		}else if(income<=181001 && income<=300000) {
			appIncome = income -180000;
			tax = 0.1 * appIncome;
		}else if(income >= 300001 && income<=500000) {
			appIncome= income - 300000;
			tax= 0.20*appIncome;
		}else if(income<=500001 && income<=1000000) {
			appIncome=income-500000;
			tax=0.30*appIncome;
		}
		return tax;
	}
	void displayResult(double income, double tax) {
		System.out.println("\nIncome Tax calculated on Gross Income of Rs."+income+" is Rs."+tax);
	}
	public static void main(String args[]) {
		IncomeTax ob=new IncomeTax();
		double income=ob.inputIncome();
		double tax=ob.calculateTax(income);
		ob.displayResult(income, tax);
		
	}

}
