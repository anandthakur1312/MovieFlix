package org.anand.oist.moviefliks.dao;

import org.anand.oist.moviefliks.model.UserDetails;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDaoImpl implements UserDao {
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	public void save() {
		UserDetails user = new UserDetails("1", "Anand", "Thakur", "anand.thakur1312", "anand.thakur1312@gmail.com", "Myfmlyzbst1", "Admin");
		
		Session session = sessionFactory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         session.save(user); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	}

}
