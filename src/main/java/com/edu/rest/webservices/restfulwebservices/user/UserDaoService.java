package com.edu.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	
	private static int userCount = 3;
	
	static {
		
		users.add(new User(1, "Adam", new Date()));

		users.add(new User(2, "Evee", new Date()));

		users.add(new User(3, "Jack", new Date()));
	}
	
	/*
	 * Return all list user
	 */
	
	public List<User> findAll(){
		
		return users;
	}

	/*
	 * Save a user
	 */
	
	public User save(User user){
		
		if (user.getId() == null) 
			user.setId(++userCount);

		users.add(user);
		
		return user;
	}
	
	/*
	 * Find one user
	 */
	
	public User findOne(int id){
		
		for (User user:users) {
			
			if (user.getId() == id) 
				return user;
		}
		
		return null;
	}

	/**
	 * Delete a user
	 * @param id User id
	 * @return User deleted
	 */
	
	public User deleteById(int id){
		
		Iterator <User> iterator = users.iterator();
		
		while (iterator.hasNext()) {
			
			User user = iterator.next();
			
			if (user.getId() == id)  {

				iterator.remove();
				
				return user;
			}
		}
		
		return null;
	}
}