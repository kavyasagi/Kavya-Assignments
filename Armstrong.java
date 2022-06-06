
public class Armstrong {
	public static void main(String args[]) {
		int n=153,number, r, sum=0;
		number=n;
		while(number!=0)
		{
			r=number%10;
			sum=sum+r*r*r;
			number=number/10;
		}
		if(sum==n)
			System.out.println("It is an Armstrong number");
		else
			System.out.println("It is not an Armstrong");
		
	}

}
