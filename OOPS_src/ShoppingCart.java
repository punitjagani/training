
public class ShoppingCart {
	private double total;
	private Product[] products;
	private int idx;
	
	public ShoppingCart() {
		products = new Product[5];
	}
	
	public void addProduct(Product p) {
		products[idx ++] = p;
		total += p.getPrice();
	}
	
	public void showCart() {
		System.out.println("Your Shopping Cart: ");
		for (int i = 0; i < idx; i++) 
			products[i].description();
		System.out.println("Cart Total: " +total);
		}

	

}
