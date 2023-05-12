package com.mutualfunds.mf.entity.registration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customerOtp")
public class CustomerOtp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int customerId;
	private int otp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public CustomerOtp(int id, int customerId, int otp) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.otp = otp;
	}

	public CustomerOtp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustomerOtp [id=" + id + ", customerId=" + customerId + ", otp=" + otp + "]";
	}

}
