package com.demo.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Account a1 = new Account();
		a1.setAccountNumber(123456);
		a1.setAccountId(4);

//		Account a2 = new Account();
//		a2.setAccountNumber(2222);
//		a2.setAccountId(2);
//
//		Account a3 = new Account();
//		a3.setAccountNumber(3333);
//		a3.setAccountId(3);

		Set<Account> accounts = new HashSet<Account>();
		accounts.add(a1);
//		accounts.add(a2);
//		accounts.add(a3);

		Employee emp = new Employee();
		emp.setEmpId(2);
		emp.setEmail("abc@gmail.com");
		emp.setFirstname("sush");
		emp.setLastname("kondekar");
		emp.setAccounts(accounts);

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.onetomany.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(emp);
		
//		Employee e1 = session.get(Employee.class, 1);
//		Employee e2 = session.get(Employee.class, 2);
//		System.out.println(e1);
//		System.out.println(e2);
//		
//		session.delete(e2);
		
		tx.commit();
		session.close();
	}

}
