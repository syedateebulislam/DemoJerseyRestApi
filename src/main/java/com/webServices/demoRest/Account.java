package com.webServices.demoRest;


public class Account {
	private int account_number;
	private int  balance;
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	@Override
	public String toString() {
		return "Account [account_number=" + account_number + ", balance=" + balance + ", status=" + status + "]";
	}
}