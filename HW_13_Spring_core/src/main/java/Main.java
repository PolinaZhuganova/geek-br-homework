import org.springframework.context.annotation.*;
import services.OrderService;

/**
 * Класс Main
 */
@ComponentScan
public class Main {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Main.class);
		context.refresh();

		OrderService orderService = context.getBean(OrderService.class);
		orderService.createOrder();
	}
}