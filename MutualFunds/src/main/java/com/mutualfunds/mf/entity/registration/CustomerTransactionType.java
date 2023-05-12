package com.mutualfunds.mf.entity.registration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customerTransactionType")
public class CustomerTransactionType {
	@Id
	private int id;
	private int typeId;
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CustomerTransactionType(int id, int typeId, String description) {
		super();
		this.id = id;
		this.typeId = typeId;
		this.description = description;
	}

	public CustomerTransactionType() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustomerTransactionType [id=" + id + ", typeId=" + typeId + ", description=" + description + "]";
	}

}
