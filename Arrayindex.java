import java.util.Scanner;
public class Arrayindex {
	
	public static void main(String arg[]) {
		int num, i;
		int arr[]= new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int size = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = sc.nextInt();
		for(i=0;i<size-1;i++) {
			if(arr[i] == num) {
				System.out.println("index of the given number is: " +i);
				sc.close();
			}
		}
	}
}
