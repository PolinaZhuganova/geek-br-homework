import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TestExecutorService;
import java.io.IOException;

/**
 * Класс Main
 */
public class Main {

	public static void main(String[] args) throws IOException {

		ClassPathXmlApplicationContext context =
			new ClassPathXmlApplicationContext("/context.xml");
		TestExecutorService t = context.getBean(TestExecutorService.class);
		t.startTest();


	}

}