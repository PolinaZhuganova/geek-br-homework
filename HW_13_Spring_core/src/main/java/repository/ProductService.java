package repository;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.*;

import java.util.*;

/**
 * Класс repository.ProductService
 */
@Component
public class ProductService {


	private List<Product> goods;


	public void showProdList() {
		goods = Arrays.asList(
			new Product(1, "a", 10),
			new Product(2, "b", 20),
			new Product(3, "c", 20),
			new Product(4, "d", 20),
			new Product(5, "e", 20),
			new Product(6, "f", 20),
			new Product(7, "g", 20),
			new Product(8, "h", 20),
			new Product(9, "i", 20),
			new Product(10, "j", 20))
		;
	}

	public void printGoods() {
		System.out.println("Choose from list ");
		for (var g : goods) {
			System.out.println("Choose from list " + g.getTitle());
		}
	}

	public Product findByTitle(String title) {
		for (var good : goods) {
			if ((good.getTitle()).equals(title)) {
				return good;

			}

		} return null;
	}


}