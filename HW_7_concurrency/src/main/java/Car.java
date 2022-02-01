import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Класс Car
 */

public class Car implements Runnable {

	private static int CARS_COUNT;

	static {
		CARS_COUNT = 0;
	}

	private Race race;
	private int speed;
	private String name;
	static CyclicBarrier cyclicBarrier = new CyclicBarrier(Main.CARS_COUNT);
	static CountDownLatch countDownLatch1 = new CountDownLatch(1);
	static CountDownLatch countDownLatchAll = new CountDownLatch(Main.CARS_COUNT);
	static AtomicInteger counter = new AtomicInteger(1);
	static AtomicInteger allCounter = new AtomicInteger(1);


	public String getName() {
		return name;
	}

	public int getSpeed() {
		return speed;
	}

	public Car(Race race, int speed) {
		this.race = race;
		this.speed = speed;
		CARS_COUNT++;
		this.name = "Участник #" + CARS_COUNT;
	}

	@Override
	public void run() {
		try {
			System.out.println(this.name + " готовится");
			Thread.sleep(500 + (int) (Math.random() * 800));
			System.out.println(this.name + " готов");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			cyclicBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < race.getStages().size(); i++) {
			race.getStages().get(i).go(this);
		}
		countDownLatch1.countDown();

		try {
			countDownLatch1.await();
			if (counter.compareAndSet(1, 0)) {
				System.out.println(this.name + " is the WINNER!!!");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		countDownLatchAll.countDown();
		try {
			countDownLatchAll.await();
			if (allCounter.compareAndSet(1, 0)) {
				System.out.println("ATTENTION >>> Гонка закончилась!!!");
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
