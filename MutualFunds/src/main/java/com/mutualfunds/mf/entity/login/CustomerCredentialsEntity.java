package com.mutualfunds.mf.entity.login;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customerCredentials")
public class CustomerCredentialsEntity {
	@Id
	private String userid;
	private String password;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CustomerCredentialsEntity(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}

	public CustomerCredentialsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustomerCredentialsEntity [userid=" + userid + ", password=" + password + "]";
	}

}
