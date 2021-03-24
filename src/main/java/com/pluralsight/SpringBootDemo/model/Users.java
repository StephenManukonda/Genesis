package com.pluralsight.SpringBootDemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="users")
@NamedQuery(name = "userFetch", query = "Select user from Users user where user.userName= :user")
public class Users{
	
	@Column(name="id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="user_name", nullable = false)
	private String userName;
	
	@Column(name="password", nullable=false)
	private String password;
	
	@Column(name="last_name", nullable = true)
	private String lastName;
	
	@Column(name="phone", nullable = false)
	private long phone;
	
	public Users() {
	}

	public Users(Long id, String userName, String password, String lastName, long phone) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.lastName = lastName;
		this.phone = phone;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
