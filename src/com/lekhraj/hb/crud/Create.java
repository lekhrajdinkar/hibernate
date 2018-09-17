package com.lekhraj.hb.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Create {

	public static void main(String[] args) {
		
		String configFile = "";
		configFile = "hibernate.cfg.local.ng6.xml"; 
		configFile = "hibernate.cfg.aws.ng6.xml"; 
		
		// create session factory
		SessionFactory factory = new Configuration().configure(configFile).addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			// create a student object
			System.out.println("Creating new student object...");
			Student tempStudent = new Student("Lekhraj", "Dinkar", "LekhrajDinkar@gmail.com");

			// start a transaction
			session.beginTransaction();

			// save the student object
			System.out.println("Saving the student...");
			session.save(tempStudent);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

}
