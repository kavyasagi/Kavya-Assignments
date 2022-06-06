package Practice;

import java.util.Scanner;

public class Marks {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the marks of three subjects");
		int sub1= in.nextInt();
		int sub2= in.nextInt();
		int sub3= in.nextInt();
		if(sub1>60 && sub2>60 && sub3>60) {
			System.out.println("Passed");
		}
		else if(sub1>60 && sub2>60 || sub1>60 && sub3>60 || sub2>60 && sub3>60) {
			System.out.println("Promoted");
		}
		else if(sub1<60 || sub2<60 || sub3<60) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Fail");
		}
		
	}
	

}
