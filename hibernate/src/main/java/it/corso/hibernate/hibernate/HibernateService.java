package it.corso.hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateService {

	public static Session getCurrentSessionFromConfig() {
		  // SessionFactory in Hibernate 5 example
		  Configuration config = new Configuration();
		  config.configure("/hibernate.cfg.xml");
		  // local SessionFactory bean created
		  SessionFactory sessionFactory = config.buildSessionFactory();
		  Session session = sessionFactory.getCurrentSession();
		  return session;
		}

	 public static void stampa() {

		System.out.println(HibernateService.getCurrentSessionFromConfig());

	 }




}
