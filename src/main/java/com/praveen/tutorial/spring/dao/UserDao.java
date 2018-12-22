/**
 * 
 */
package com.praveen.tutorial.spring.dao;

import java.util.List;

import com.praveen.tutorial.spring.model.User;

/**
 * @author Praveenkumar.S
 *
 */
public interface UserDao {

	long save(User user);
	User get(long id);
	List<User> list();
}
