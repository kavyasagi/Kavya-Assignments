package Practice;

import java.util.Scanner;

public class UnsupportedOperationException {
		public static void main(String args[]) {
			
			Scanner sc= new Scanner(System.in);

			int a[]= {0};
			try
			{
			int b = 0;
			
			int result= 10/b;
			
			System.out.println("Result is:"+result);
			sc.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Can't divide by zero");
			
		}
}


