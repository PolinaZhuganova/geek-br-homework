import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Scanner;

/**
 * Класс OrderService
 */

@Component
public class OrderService {

	private final ProductService productService;
	private final Cart cart;

	Scanner scanner = new Scanner(System.in);
	String title = scanner.nextLine();

	@Autowired
	public OrderService(ProductService productService, Cart cart) {

		this.productService = productService;
		this.cart = cart;
	}

	public void createOrder() {
		productService.showProdList();
		productService.printGoods();
		cart.addToCart(productService.findByTitle(title));
		cart.addToCart(productService.findByTitle(title));
		cart.addToCart(productService.findByTitle(title));
		cart.addToCart(productService.findByTitle(title));
		cart.printCart();

//		распечатка всех позиций в консоли, с выводом
//		итоговой стоимости выбранных товаров


	}
}