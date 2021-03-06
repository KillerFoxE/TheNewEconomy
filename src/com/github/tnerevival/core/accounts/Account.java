package com.github.tnerevival.core.accounts;

import java.io.Serializable;

import com.github.tnerevival.TheNewEconomy;
import com.github.tnerevival.core.accounts.banks.Bank;

/**
 * Class used to hold all economy-based information about a specific player on the server.
 * @author creatorfromhell
 *
 */
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * The account number for this account.
	 * This number is unique to the account.
	 */
	int accountNumber = 0;
	
	/**
	 * The name of the player who this account belongs to.
	 */
	String owner;
	
	/**
	 * A special pin that can be set to help secure the account from any unwanted access.
	 */
	String pinCode;
	
	/**
	 * The Bank associated with this account.
	 */
	Bank bank;
	
	/**
	 * The account's balance of in-game virtual currency.
	 */
	double balance;
	
	/**
	 * The status of this account in String form.
	 */
	String status;
	
	/**
	 * Creates a new Account for the specified Player using their username.
	 * @param username
	 */
	public Account(String username) {
		this.accountNumber = TheNewEconomy.instance.config.getInt("highest-accountnumber") + 1;
		this.owner = username;
		this.pinCode = "default";
		this.balance = TheNewEconomy.instance.config.getDouble("starting-balance");
		this.status = "Normal";
		TheNewEconomy.instance.config.set("highest-accountnumber", this.accountNumber);
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the pinCode
	 */
	public String getPinCode() {
		return pinCode;
	}

	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	/**
	 * @return the bank
	 */
	public Bank getBank() {
		return bank;
	}

	/**
	 * @param bank the bank to set
	 */
	public void setBank(Bank bank) {
		this.bank = bank;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
}