package com.mutualfunds.mf.entity.portfilio;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customerMfHistory")
public class CustomerMfHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int portfolioId;
	private int customerId;
	private int mfSchemaId;
	private String mfName;
	private String mfFundHouse;
	private int mfUnit;
	private String currency;
	private int mfTransactionType;
	private Date TransactionDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(int portfolioId) {
		this.portfolioId = portfolioId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getMfSchemaId() {
		return mfSchemaId;
	}

	public void setMfSchemaId(int mfSchemaId) {
		this.mfSchemaId = mfSchemaId;
	}

	public String getMfName() {
		return mfName;
	}

	public void setMfName(String mfName) {
		this.mfName = mfName;
	}

	public String getMfFundHouse() {
		return mfFundHouse;
	}

	public void setMfFundHouse(String mfFundHouse) {
		this.mfFundHouse = mfFundHouse;
	}

	public int getMfUnit() {
		return mfUnit;
	}

	public void setMfUnit(int mfUnit) {
		this.mfUnit = mfUnit;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getMfTransactionType() {
		return mfTransactionType;
	}

	public void setMfTransactionType(int mfTransactionType) {
		this.mfTransactionType = mfTransactionType;
	}

	public Date getTransactionDate() {
		return TransactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		TransactionDate = transactionDate;
	}

	public CustomerMfHistory(int id, int portfolioId, int customerId, int mfSchemaId, String mfName, String mfFundHouse,
			int mfUnit, String currency, int mfTransactionType, Date transactionDate) {
		super();
		this.id = id;
		this.portfolioId = portfolioId;
		this.customerId = customerId;
		this.mfSchemaId = mfSchemaId;
		this.mfName = mfName;
		this.mfFundHouse = mfFundHouse;
		this.mfUnit = mfUnit;
		this.currency = currency;
		this.mfTransactionType = mfTransactionType;
		TransactionDate = transactionDate;
	}

	public CustomerMfHistory() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustomerMfHistory [id=" + id + ", portfolioId=" + portfolioId + ", customerId=" + customerId
				+ ", mfSchemaId=" + mfSchemaId + ", mfName=" + mfName + ", mfFundHouse=" + mfFundHouse + ", mfUnit="
				+ mfUnit + ", currency=" + currency + ", mfTransactionType=" + mfTransactionType + ", TransactionDate="
				+ TransactionDate + "]";
	}

}
