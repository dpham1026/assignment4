package com.meritamerica.assignment4;

import java.text.ParseException;
import java.util.*;

public abstract class Transaction {
	protected BankAccount sourceAccount;
	protected BankAccount targetAccount;
	protected double amount;
	protected String reason;
	protected Date transactionDate;
	protected boolean isProcessed;

	public BankAccount getSourceAccount() {
		return sourceAccount;
	}

	public void setSourceAccount(BankAccount sourceAccount) {
		this.sourceAccount = sourceAccount;
	}

	public BankAccount getTargetAccount() {
		return targetAccount;
	}

	public void setTargetAccount(BankAccount targetAccount) {
		this.targetAccount = targetAccount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public java.util.Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(java.util.Date date) {
		transactionDate = date;
	}

	public String writeToString() {
		String write = "";
		if (sourceAccount == targetAccount)
			write += "-1,";
		else
			write += sourceAccount.getAccountNumber() + ",";
		write += targetAccount.getAccountNumber() + "," + amount + "," + transactionDate;
		return write;
	}

	public static Transaction readFromString(String transactionDataString) throws ParseException { 

		return null;
	}

	public abstract void process()
			throws NegativeAmountException, ExceedsAvailableBalanceException, ExceedsFraudSuspicionLimitException;

	public boolean isProcessedByFraudTeam() {
		return isProcessed;
	}

	public void setProcessedByFraudTeam(boolean isProcessed) {
		this.isProcessed = isProcessed;
	}

	public String getRejectionReason() {
		return reason;
	}

	public void setRejectionReason(String reason) {
		this.reason = reason;
	}

}
