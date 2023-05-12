package com.mutualfunds.mf.entity.wishlist;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customerWishlist")
public class CustomerWishlistEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int wishlistId;
	private int customerId;
	@Nullable
	private String mfName;
	@Nullable
	private String mfFundHouse;
	private int mfSchemaId;

	public int getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(int wishlistId) {
		this.wishlistId = wishlistId;
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

	public int getMfSchemaId() {
		return mfSchemaId;
	}

	public void setMfSchemaId(int mfSchemaId) {
		this.mfSchemaId = mfSchemaId;
	}

	public CustomerWishlistEntity(int wishlistId, int customerId, String mfName, String mfFundHouse, int mfSchemaId) {
		super();
		this.wishlistId = wishlistId;
		this.customerId = customerId;
		this.mfName = mfName;
		this.mfFundHouse = mfFundHouse;
		this.mfSchemaId = mfSchemaId;
	}

	public CustomerWishlistEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustomerWishlistEntity [wishlistId=" + wishlistId + ", customerId=" + customerId + ", mfName=" + mfName
				+ ", mfFundHouse=" + mfFundHouse + ", mfSchemaId=" + mfSchemaId + "]";
	}

}
