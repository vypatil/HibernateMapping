package com.demo.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestQusetionAnswer {

	public static void main(String[] args) {
		Answer a1 = new Answer();

		Question q1 = new Question();
		q1.setQuestionId(121);
		q1.setQuestion("whats is java ?");
		q1.setAnswerObj(a1);
		
		a1.setAnswerId(100);
		a1.setAnswer("java is programming language..!!");
		a1.setQues(q1);

		Question q2 = new Question();
		
		Answer a2 = new Answer();
		a2.setAnswerId(101);
		a2.setAnswer("Application programming interface");
		a2.setQues(q2);

		q2.setQuestionId(122);
		q2.setQuestion("whats is API ?");
		q2.setAnswerObj(a2);

		Question q3 = new Question();
		
		Answer a3 = new Answer();
		a3.setAnswerId(102);
		a3.setAnswer("object oriented programming system");
		a3.setQues(q3);

		q3.setQuestionId(123);
		q3.setQuestion("what is oops?");
		q3.setAnswerObj(a3);

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(a1);
		session.save(q1);

		session.save(a2);
		session.save(q2);

		session.save(a3);
		session.save(q3);

//		session.delete(q2);

		
//		Question oue = session.get(Question.class, 121);
//		System.out.println(oue.getQuestion());
//		System.out.println(oue.getAnswerObj());
//		
//		Answer ans = session.load(Answer.class,100);
//		System.out.println(ans.getAnswer());
//		System.out.println(ans.getQues());
//		
		tx.commit();
		session.close();

	}

}
