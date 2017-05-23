package org.anand.oist.moviefliks.dao;

import java.util.List;

import org.anand.oist.moviefliks.model.Viewer;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ViewerDaoImpl implements ViewerDao {
	
	private static final Logger logger = LoggerFactory.getLogger(ViewerDaoImpl.class);
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	

	@Override
	public List<Viewer> getAllViewers() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<Viewer> viewerList = session.createQuery("FROM Viewer").list();
		for(Viewer v : viewerList){
			logger.info("Person List::"+v);
		}
		return viewerList;
	}

	@Override
	public List<Viewer> createViewer(Viewer viewer) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int newId = (int) session.save(viewer);
		String hql = "FROM Viewer V WHERE V.id = :newId";
		Query query = session.createQuery(hql);
		query.setParameter("newId",newId);
		List<Viewer> newViewer = query.list();
		tx.commit();
		session.close();
		return newViewer;
		
	}

	@Override
	public String updateViewer(int id, Viewer viewer){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(viewer);
		tx.commit();
		session.close();
		return "Updated Succesfully";
	}

	@Override
	public String deleteViewer(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "delete from Viewer where id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("id",id);
        int rowCount = query.executeUpdate();
        tx.commit();
		session.close();
		return rowCount + " Rows Affected";
	}
	

	   public void shutdown()
	   {
		   sessionFactory.close();
	   }

}
