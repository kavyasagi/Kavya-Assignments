package Lambda;
import java.util.function.Supplier;

public class Supplierdemo {
	public static void main(String args[]) {
		int n = 15;
		display(() -> n+10);
		display(() -> n+100);
		
	
		
	}

	static void display(Supplier arg) {
		System.out.println(arg.get());
	}

}
