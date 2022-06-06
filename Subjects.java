import java.util.Scanner;

public class Subjects {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Students");
		int num=input.nextInt();
		System.out.println("Enter marks of student");
		int A=input.nextInt();
		int B=input.nextInt();
		int C=input.nextInt();
		switch(num) {
		case 1:System.out.println("Selected 1st student");
		System.out.println(A+B+C);
		System.out.println((A+B+C)/3);
		break;
		case 2:System.out.println("Selected 2nd student");
		System.out.println(A+B+C);
		System.out.println((A+B+C)/3);
		break;
		case 3:System.out.println("Selected 3rd student");
		System.out.println(A+B+C);
		System.out.println((A+B+C)/3);
		input.close();
		}
	}
	
}
