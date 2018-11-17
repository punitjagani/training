
public class TestShopping {
	public static void main(String[] args) {
		ShoppingCart myCart = new ShoppingCart();
		
		Product p1 = new Product("iPhone XS", 99990);
		myCart.addProduct(p1);
		
		myCart.addProduct(new Product("iPad Pro", 44990));
		myCart.addProduct(new Product("MacBook Air", 122990));
		
		myCart.showCart();
		}
}
