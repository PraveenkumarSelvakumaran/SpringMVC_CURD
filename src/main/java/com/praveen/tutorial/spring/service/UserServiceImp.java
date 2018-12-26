/**
 * 
 */
package com.praveen.tutorial.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.praveen.tutorial.spring.dao.UserDao;
import com.praveen.tutorial.spring.model.User;

/**
 * @author Praveenkumar.S
 *
 */

@Service
@Transactional(readOnly = false)
public class UserServiceImp implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public long save(User user) {
		return userDao.save(user);
	}

	@Override
	public User get(long id) {
		return userDao.get(id);
	}

	@Override
	public List<User> list() {
		return userDao.list();
	}
	
	
	

}
