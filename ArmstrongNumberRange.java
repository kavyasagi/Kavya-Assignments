
public class Range {
	public static void main(String args[]) {
		int r, sum=0, n;
		System.out.println("Armstrong numbers from 100 to 999 are:");
		for(n=100;n<1000;n++)
		{
			int a=n;
			sum=0;
			while(a>0)
			{
				r=a%10;
				sum=sum+r*r*r;
				a=a/10;
			}
			if(sum==n)
			{
				System.out.println(n+"");
			}
		}
	}

}
