package services;

import model.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 * Класс services.Service
 */
public class Service {

	public Service() {
		this.makeFactory();
	}

	private SessionFactory factory;


	public void makeFactory() {
		factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(BuyerGood.class)
			.addAnnotatedClass(BuyerInfo.class)
			.addAnnotatedClass(Good.class)
			.buildSessionFactory();

	}


	public void showGoods() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Good goods = session.get(Good.class, 0);
		session.getTransaction().commit();
		System.out.println(goods);

	}

	public void buy(Good good, BuyerInfo buyer ) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		BuyerGood bg = new BuyerGood(good,buyer);
		session.save(bg);
		session.getTransaction().commit();

	}

//	//посмотреть какие товары покупал клиент
	public void showProductsByPerson(String bName) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		BuyerGood buyerGood = session.get(BuyerGood.class, bName);


		session.getTransaction().commit();


	}
//
//	//какие клиенты купили определенный товар
//	public void findPersonsByProductTitle() {
//
//		session = factory.getCurrentSession();
//
//	}
//
//	public void removePerson(removeProduct)
//	//имя_элемента - предоставить возможность удалять из базы 	товары/покупателей,() {
//
//	session =factory.getCurrentSession();
//
//}
//
//

}