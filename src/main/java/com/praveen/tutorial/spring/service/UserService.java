/**
 * 
 */
package com.praveen.tutorial.spring.service;

import java.util.List;

import com.praveen.tutorial.spring.model.User;

/**
 * @author Praveenkumar.S
 *
 */
public interface UserService {
	
	   long save(User user);
	   User get(long id);
	   List<User> list();
}
