package Lambda;

import java.util.ArrayList;

public class Test {
	public static void main(String args[]) throws CloneNotSupportedException {
		ArrayList<String> list = new ArrayList<>();
		list.add("Kavya");
		list.add("Akhila");
		list.add("lucky");
		System.out.println("Contents of the list: \n"+ list);
		list.replaceAll(new Remove());
		System.out.println("Contents of the list after replace: \n"+list);
	}

}
