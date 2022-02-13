import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

/**
 * Класс Main
 */
@ComponentScan
public class Main {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		Main maim = new Main();
		maim.orderService.createOrder();
	}
}