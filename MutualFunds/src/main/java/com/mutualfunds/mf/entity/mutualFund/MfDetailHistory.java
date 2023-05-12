package com.mutualfunds.mf.entity.mutualFund;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mfDetailHistory")
public class MfDetailHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date date;
	private int schemaId;
	private int nav;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getSchemaId() {
		return schemaId;
	}

	public void setSchemaId(int schemaId) {
		this.schemaId = schemaId;
	}

	public int getNav() {
		return nav;
	}

	public void setNav(int nav) {
		this.nav = nav;
	}

	public MfDetailHistory(int id, Date date, int schemaId, int nav) {
		super();
		this.id = id;
		this.date = date;
		this.schemaId = schemaId;
		this.nav = nav;
	}

	public MfDetailHistory() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MfDetailHistory [id=" + id + ", date=" + date + ", schemaId=" + schemaId + ", nav=" + nav + "]";
	}

}
