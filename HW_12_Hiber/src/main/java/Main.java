import sevices.Services;

/**
 * Класс Main
 */
public class Main {
	public static void main(String[] args) {
		Services services = new Services();
		System.out.println(services.random());
		for (int i = 0; i < 8; i++) {
			services.makeThread();
		}

		try {
			Services.countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		services.printValSum();
	}

}