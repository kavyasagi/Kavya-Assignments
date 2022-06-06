package Lambda;

import java.util.ArrayList;

public class Orders {
	public static void main(String args[]) {
		ArrayList<Order> orderList = new ArrayList<Order>();
		
		orderList.add(new Order("Ravi", 2000,"Accepted"));
		orderList.add(new Order("Kavya", 345,"Accepted"));
		orderList.add(new Order("Sreeja", 249,"Completed"));
		orderList.add(new Order("Ravi", 3000,"Denied"));
		orderList.add(new Order("Rashi", 252,"Accepted"));
		orderList.add(new Order("Jai", 500,"Completed"));
		
		orderList.removeIf(order -> (order.price <= 1000));
		
		System.out.println("The final list is: ");
		for(Order order : orderList) {
			System.out.println(order.name+" : "+order.price+" "+order.status);
		}
	}

}
