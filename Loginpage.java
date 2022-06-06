import java.util.Scanner;
public class Loginpage {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		String username="Kavya";
		String password="12345";
		int i=1;
		while(i>0) 
		{
		System.out.println("username");
		String uname=sc.nextLine();
		System.out.println("password");
		String pssd=sc.nextLine();
		if(username.equals(uname) && password.equals(pssd)) 
		{
			System.out.println("Welcome "+uname);
			break;
		}
		else
		{
			System.out.println("username and password are wrong! Re-enter");
			i++;
		}
		if(i>3) 
		{
			System.out.println("contact Admin");
			break;
		}
		}
	
	}

}
