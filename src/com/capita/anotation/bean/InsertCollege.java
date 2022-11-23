package com.capita.anotation.bean;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertCollege {

	public static void main(String[] args) {

		Configuration cf = new Configuration();
		cf.configure("DBConfiguration.cfg.xml");

		SessionFactory sf = cf.buildSessionFactory();

		Session session = sf.openSession();

		College college = new College();

		college.setCollegeName("YCCE12121");
		college.setCollegeDept("IT12");

		Transaction tx = session.beginTransaction();

		String cool = (String) session.save(college);
		System.out.println("Id is "+ cool);

		tx.commit();

		session.close();
		sf.close();

	}

}
