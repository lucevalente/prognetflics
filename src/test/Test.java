package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public @interface Test {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session em = sf.openSession(); //
	Transaction et = em.beginTransaction();

}
