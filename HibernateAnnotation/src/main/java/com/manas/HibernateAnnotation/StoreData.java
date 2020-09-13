package com.manas.HibernateAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee=new Employee();
		employee.setId(506);
		employee.setFirstName("lipika");
		employee.setLastName("jena");
		session.save(employee);
		transaction.commit();
		session.close();
		System.out.println(employee);

	}

}
