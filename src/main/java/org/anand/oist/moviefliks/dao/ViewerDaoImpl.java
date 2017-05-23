package org.anand.oist.moviefliks.dao;

import java.util.List;

import org.anand.oist.moviefliks.model.Viewer;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ViewerDaoImpl implements ViewerDao {
	
	private static final Logger logger = LoggerFactory.getLogger(ViewerDaoImpl.class);
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	public void save() {
		Viewer user = new Viewer("1", "Anand", "Thakur", "anand.thakur1312", "anand.thakur1312@gmail.com", "Myfmlyzbst1", "Admin");
		
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

	@Override
	public List<Viewer> getAllViewers() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<Viewer> userList = session.createQuery("from Viewer").list();
		for(Viewer v : userList){
			logger.info("Person List::"+v);
		
		}
		return userList;
	}

}
