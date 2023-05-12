package com.mutualfunds.mf.entity.portfilio;

import java.util.Date;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customerPortfolio")
public class CustomerPortfolio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int portfolioId;
	private int customerId;
	@Nullable
	private String mfName;
	@Nullable
	private String mfFundHouse;
	private int mfUnitAvailable = 0;
	private String currency;
	@Nullable
	private Date transactionDate;

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

	public int getMfUnitAvailable() {
		return mfUnitAvailable;
	}

	public void setMfUnitAvailable(int mfUnitAvailable) {
		this.mfUnitAvailable = mfUnitAvailable;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public CustomerPortfolio(int portfolioId, int customerId, String mfName, String mfFundHouse, int mfUnitAvailable,
			String currency, Date transactionDate) {
		super();
		this.portfolioId = portfolioId;
		this.customerId = customerId;
		this.mfName = mfName;
		this.mfFundHouse = mfFundHouse;
		this.mfUnitAvailable = mfUnitAvailable;
		this.currency = currency;
		this.transactionDate = transactionDate;
	}

	public CustomerPortfolio() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustomerPortfolio [portfolioId=" + portfolioId + ", customerId=" + customerId + ", mfName=" + mfName
				+ ", mfFundHouse=" + mfFundHouse + ", mfUnitAvailable=" + mfUnitAvailable + ", currency=" + currency
				+ ", transactionDate=" + transactionDate + "]";
	}
}
