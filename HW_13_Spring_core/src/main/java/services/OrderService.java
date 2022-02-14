package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import repository.ProductService;

import java.util.Scanner;

/**
 * Класс services.OrderService
 */

@Service
public class OrderService {

	private final ProductService productService;
	private final CartService cartService;

	Scanner scanner = new Scanner(System.in);
	String title = scanner.nextLine();

@Autowired
	public OrderService(ProductService productService, CartService cartService) {

		this.productService = productService;
		this.cartService = cartService;
	}

	public void createOrder() {
		productService.showProdList();
		productService.printGoods();
		cartService.addToCart(productService.findByTitle(title));
		cartService.addToCart(productService.findByTitle(title));
		cartService.addToCart(productService.findByTitle(title));
		cartService.addToCart(productService.findByTitle(title));
		cartService.printCart();

//		распечатка всех позиций в консоли, с выводом
//		итоговой стоимости выбранных товаров


	}
}