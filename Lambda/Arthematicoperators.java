package Lambda;

@FunctionalInterface
interface Arthematic{
	int operations(int a, int b);
}

public class Arthematicoperators {
	
	public static void main(String args[]) {
		
		Arthematic add = (int a, int b) -> (a+b);
		System.out.println("Addition: "+ add.operations(10, 15));
		
		Arthematic subtract = (int a, int b) -> (a-b);
		System.out.println("Subtraction: "+ subtract.operations(34,20));
		
		Arthematic multiply = (int a, int b) -> (a * b);
		System.out.println("Multiplication: "+ multiply.operations(5, 3));
		
		Arthematic divide = (int a, int b) -> (a/b);
		System.out.println("Division: "+ divide.operations(10,2));
		}
	}
	

