package Lambda;

import java.util.function.Consumer;


public class Consumer1{
	public static void main(String args[]) {
		Consumer<Product> updatePrice = p -> p.setPrice(10.8);
		Product p = new Product();
		updatePrice.accept(p);
		p.printPrice();
	
	
	}
}
class Product {
	private double price = 0.0;
	
	public void setPrice(double price) {
		this.price = price;
	}
	public void printPrice() {
		System.out.println(price);
	}

}
