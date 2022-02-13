import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Класс Cart
 */
@Component
public class Cart {

	static List<Product> orderList;

	public void addToCart(Product product) {
		orderList.add(product);

	}

	public void printCart() {
		int cost = 0;
		for (var g : orderList) {
			cost += g.getCost();
			System.out.println("You ordered " + g.getTitle());
		}
		System.out.println("Total cost: " + cost);
	}
}