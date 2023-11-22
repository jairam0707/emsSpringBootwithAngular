package com.example2.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Registration")
@Inheritance(strategy=InheritanceType.JOINED)
public class User 
{
	@Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private int userId;
	   
	   @NotNull
	   @Column(length=30)
	   private String userName;
	   
	   @NotNull
	   @Column(length=30)
	   private String password;

	public User(int userId, @NotNull String userName, @NotNull String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	}
	   
	  

