package org.anand.oist.moviefliks.service;

import org.anand.oist.moviefliks.dao.UserDao;
import org.anand.oist.moviefliks.dao.UserDaoImpl;
import org.anand.oist.moviefliks.model.UserDetails;

public class UserServiceImpl implements UserService {

	@Override
	public void save() {
		UserDao userDao = new UserDaoImpl();
		userDao.save();
		
	}

}
