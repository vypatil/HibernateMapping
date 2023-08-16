package com.demo.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToOne {
	
	public static void main(String[] args) {
		
		Address a1 = new Address(2, 92224, "pune", "america");
		
		Student s1 = new Student(2, 44, "sush", a1);
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
//		session.save(s1);
		
//		session.delete(s1);
		
		Student getobj = session.get(Student.class, 1);
		
		System.out.println(getobj);
		
		tx.commit();
		session.close();
	}

}
