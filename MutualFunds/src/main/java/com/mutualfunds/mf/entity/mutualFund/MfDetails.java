package com.mutualfunds.mf.entity.mutualFund;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mfDetails")
public class MfDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int schemaId;
	private String fundHouse;
	private String symbol;
	private String schemaName;
	private String schemaCategory;
	private String description;
	private double currPrice;
	private double delta;

	public int getSchemaId() {
		return schemaId;
	}

	public void setSchemaId(int schemaId) {
		this.schemaId = schemaId;
	}

	public String getFundHouse() {
		return fundHouse;
	}

	public void setFundHouse(String fundHouse) {
		this.fundHouse = fundHouse;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getSchemaName() {
		return schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

	public String getSchemaCategory() {
		return schemaCategory;
	}

	public void setSchemaCategory(String schemaCategory) {
		this.schemaCategory = schemaCategory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCurrPrice() {
		return currPrice;
	}

	public void setCurrPrice(double currPrice) {
		this.currPrice = currPrice;
	}

	public double getDelta() {
		return delta;
	}

	public void setDelta(double delta) {
		this.delta = delta;
	}

	public MfDetails(int schemaId, String fundHouse, String symbol, String schemaName, String schemaCategory,
			String description, double currPrice, double delta) {
		super();
		this.schemaId = schemaId;
		this.fundHouse = fundHouse;
		this.symbol = symbol;
		this.schemaName = schemaName;
		this.schemaCategory = schemaCategory;
		this.description = description;
		this.currPrice = currPrice;
		this.delta = delta;
	}

	public MfDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MfDetails [schemaId=" + schemaId + ", fundHouse=" + fundHouse + ", symbol=" + symbol + ", schemaName="
				+ schemaName + ", schemaCategory=" + schemaCategory + ", description=" + description + ", currPrice="
				+ currPrice + ", delta=" + delta + "]";
	}

}
