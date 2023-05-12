package com.mutualfunds.mf.repository.updateCustomerWallet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mutualfunds.mf.entity.wallet.CustomerWalletEntity;

@Repository
public interface UpdateCustomerWalletRepository extends JpaRepository<CustomerWalletEntity, Integer> {
	@Modifying
	@Query(value = "UPDATE CUSTOMER_WALLET SET WALLET_BALANCE=(WALLET_BALANCE + ?) WHERE CUSTOMER_ID=?", nativeQuery = true)
	public void addMoneyToWallet(double amount, int custId);

	@Modifying
	@Query(value = "UPDATE CUSTOMER_WALLET SET WALLET_BALANCE=(WALLET_BALANCE - ?) WHERE CUSTOMER_ID=?", nativeQuery = true)
	public void withdrawMoneyFromWallet(double amount, int custId);

	@Query(value = "SELECT WALLET_BALANCE FROM CUSTOMER_WALLET WHERE CUSTOMER_ID=?", nativeQuery = true)
	public double getAccountBalance(int customerId);
}
