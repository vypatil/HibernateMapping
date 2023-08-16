package com.demo.onetomany_bidirectional;

import java.util.List;

import javax.sound.midi.Soundbank;

import org.hibernate.Query;
import org.hibernate.Session;

import com.demo.util_class.HibernateUtil;

public class Test {

	public static List<Employee> getEmployeeList() {

		Session session = null;

		List<Employee> empList = null;

		try {
			session = HibernateUtil.getSession();
			String queryStr = "select emp from Employee emp";

			Query query = session.createQuery(queryStr);

			empList = query.list();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (session != null)
					session.close();
			} catch (Exception e) {

			}
			return empList;
		}
	}

	public static void main(String[] args) {

		List<Employee> empList = getEmployeeList();
		
		System.out.println("emp size: " + empList.size());
		
		System.out.println("----------------------");
		
		for(Employee eobj : empList) {
			
			System.out.println(eobj);
		}
		System.out.println("----------------------");
	}

}
