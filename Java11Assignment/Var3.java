package Java11Assignment;

public class Var3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// var cannot be used since they
				// require explicit target type
				var obj = (a, b) -> (a + b);

				// calling add method
				System.out.println(obj.add(2, 3));
	}

}
