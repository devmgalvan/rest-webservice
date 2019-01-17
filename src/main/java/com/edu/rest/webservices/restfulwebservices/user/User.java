package com.edu.rest.webservices.restfulwebservices.user;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="All details about the user.")
@Entity
public class User {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min=2, message="Name should have atleast 2 characters")
	@ApiModelProperty(notes="Name should have atleast 2 characters")
	private String name;
	
	@Past
	@ApiModelProperty(notes="Birth date should be in the past")
	private Date birthDate;
	
	//Relacion de un usuario puede tener muchos post, en este caso el 'N' es el post y el '1' es el user
	@OneToMany(mappedBy = "user")//"user": nombre en la relación
	private List<Post> posts;
	
	//Constructor
	public User(Integer _id, String _name, Date _birthDate) {
		
		super();
		
		id = _id;
		
		name = _name;
		
		birthDate = _birthDate;
	}
	
	//Default constructor
	protected User() {
	}

	//Get id 
	public Integer getId() {
		
		return id;
	}

	//Set id
	public void setId(Integer _id) {
		
		id = _id;
	}

	//Get name
	public String getName() {
		
		return name;
	}

	//Set name
	public void setName(String _name) {
		
		name = _name;
	}

	//Get birth day
	public Date getBirthDate() {
		
		return birthDate;
	}

	//Set birth day
	public void setBirthDate(Date _birthDate) {
		
		birthDate = _birthDate;
	}
	

	//to string
	@Override
	public String toString() {
		
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	
	/**
	 * Get posts
	 * @return List of posts
	 */
	
	public List<Post> getPosts() {
		return posts;
	}

	/**
	 * Set post
	 * @param posts post
	 */
	
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
}
