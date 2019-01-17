package com.edu.rest.webservices.restfulwebservices.user;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Post {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String description;
	
	//Relacion de un usuario puede tener muchos post, en este caso el 'N' es el post y el '1' es el user
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private User user;
	
	/**
	 * Get id
	 * @return id
	 */

	public Integer getId() {
		return id;
	}

	/**
	 * Set id
	 * @param id id
	 */
	
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Get description
	 * @return description
	 */
	
	public String getDescription() {
		return description;
	}
	
	/**
	 * Set description
	 * @param description description
	 */

	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Get user
	 * @return user
	 */

	public User getUser() {
		return user;
	}
	
	/**
	 * Set user
	 * @param user user
	 */

	public void setUser(User user) {
		this.user = user;
	}
	
	/**
	 * To string
	 */

	@Override
	public String toString() {
		return "Post [id=" + id + ", description=" + description + "]";
	}
	
	
}
