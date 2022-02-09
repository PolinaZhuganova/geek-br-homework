package sevices;


import jakarta.persistence.OptimisticLockException;
import model.ItemEntity;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.Random;
import java.util.concurrent.CountDownLatch;


/**
 * Класс Services
 */


public class Services {


	public Services() {
		this.makeFactory();
	}

	private SessionFactory factory;
	private int lineCount = 40;
	public static CountDownLatch countDownLatch = new CountDownLatch(8);


	public void makeFactory() {

		factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(ItemEntity.class)
			.buildSessionFactory();

	}

	public int random() {
		Random random = new Random();
		return random.nextInt(lineCount) + 1;
	}

	public static void unchSleep() {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	public void makeThread() {
		try {
			new Thread(() -> {
				System.out.println("Thread started.");

				for (int i = 0; i < 100; i++) {
					boolean updated = false;
					while (!updated) {
						Session session = factory.getCurrentSession();

						session.beginTransaction();
						int index = random();
						ItemEntity item = session.get(ItemEntity.class, index);
						if (item != null) {
							int currentVal = item.getVal();
							item.setVal(++currentVal);
						}
						unchSleep();
						try {
							session.save(item);
							session.getTransaction().commit();
							updated = true;
						} catch (OptimisticLockException e) {
							session.getTransaction().rollback();
						}
						if (session != null) {
							session.close();
						}
					}
				}
				countDownLatch.countDown();
			}).start();


		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	public void printValSum() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		int valSum = 0;
		for (int i = 1; i <= 40; i++) {
			ItemEntity item = session.get(ItemEntity.class, i);
			if (item != null) {
				valSum += (item.getVal());

			}
		}
		session.getTransaction().commit();
		session.close();
		System.out.println("val sum = " + valSum);
	}
}