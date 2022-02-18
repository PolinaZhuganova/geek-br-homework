import org.springframework.context.annotation.*;
import services.OrderService;

/**
 * Класс Main
 */
@Configuration
@ComponentScan
public class Main {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		OrderService orderService = context.getBean("orderService", OrderService.class);
		orderService.createOrder();
		context.close();
	}
}