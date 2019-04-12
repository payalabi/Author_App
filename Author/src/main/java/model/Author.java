package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name="Author_Master")
public class Author {
	@Id
	@Column(name="Aut_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long id;
	
	@Column(name="First_Name")
	 @Size(max = 20, min = 3, message = "{Author.name.invalid }")
	private String firstName;
	
	@Column(name="Last_Name")
	 @Size(max = 20, min = 3, message = "{Author.name.invalid }")
	private String lastName;
	@Column(name = "EMAIL", unique = true)
	@Email(message = "{Author.email.invalid")
	 private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
