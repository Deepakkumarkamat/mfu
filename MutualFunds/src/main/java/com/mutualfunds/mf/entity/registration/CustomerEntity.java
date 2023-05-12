package com.mutualfunds.mf.entity.registration;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String firstName;
	private String lastName;
	private String emailId;
	private int verificationStatus;
	private Date birthDate;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getVerificationStatus() {
		return verificationStatus;
	}

	public void setVerificationStatus(int verificationStatus) {
		this.verificationStatus = verificationStatus;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public CustomerEntity(int customerId, String firstName, String lastName, String emailId, int verificationStatus,
			Date birthDate) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.verificationStatus = verificationStatus;
		this.birthDate = birthDate;
	}

	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustomerEntity [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", verificationStatus=" + verificationStatus + ", birthDate=" + birthDate
				+ "]";
	}

}
