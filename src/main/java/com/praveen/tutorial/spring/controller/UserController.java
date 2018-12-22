/**
 * 
 */
package com.praveen.tutorial.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.praveen.tutorial.spring.model.User;
import com.praveen.tutorial.spring.service.UserService;

/**
 * @author Praveenkumar.S
 *
 */

@RestController
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	/*---Add User---*/
	@PostMapping("/user")
	public ResponseEntity<?> save(@RequestBody User user){
		long id = userService.save(user);
		return ResponseEntity.ok().body("New User has been saved with User Id:" +id);
	}
	
	/*---Get User by Id ---*/
	@GetMapping("/user/{id}")
	public ResponseEntity<User> get(@PathVariable("id") long id){
		User user = userService.get(id);
		return ResponseEntity.ok().body(user);
	}
	
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> list(){
		List<User> user = userService.list();
		return ResponseEntity.ok().body(user);
	}
	
}
