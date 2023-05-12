package com.mutualfunds.mf.controller.updateCustomerWallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mutualfunds.mf.service.updateCustomerWallet.UpdateCustomerWalletService;

@Controller
@RequestMapping("mutualfunds/wallet/update")
public class UpdateCustomerWalletController {
	@Autowired
	UpdateCustomerWalletService updateCustomerWalletService;

	@PatchMapping(value = "/addMoney")
	@ResponseBody
	public ResponseEntity<String> addMoneyToWallet(@RequestParam("customerId") int customerId,
			@RequestParam("amount") double amount) {
		return ResponseEntity.ok(updateCustomerWalletService.addMoneyToWallet(customerId, amount));
	}

	@PatchMapping(value = "/withdrawMoney")
	@ResponseBody
	public ResponseEntity<String> withdrawMoneyFromWallet(
			@RequestParam("customerId") int customerId, @RequestParam("amount") double amount) {
		if (updateCustomerWalletService.getAccountBalance(customerId) >= amount) {
			return ResponseEntity.ok(updateCustomerWalletService.withdrawMoneyFromWallet(customerId, amount));
		}
		else {
			return ResponseEntity.ok("Insufficient balance");
		}
		
	}
}
