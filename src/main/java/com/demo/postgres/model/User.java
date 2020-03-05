/**
 * 
 */
package com.demo.postgres.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Mehul
 *
  */

/**
 * @author Mehul
 *
  */
/**
 * @author Mehul
 *
  */
@Entity
@Table(name = "user_master")
public class User {

	@Id
	@GeneratedValue
	private int userId;
	private String userName;
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}
	
}
