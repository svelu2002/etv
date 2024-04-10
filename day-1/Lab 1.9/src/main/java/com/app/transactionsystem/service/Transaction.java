package com.app.transactionsystem.service;

import com.app.transactionsystem.model.BankAccount;

public class Transaction implements Runnable {
    private BankAccount account;
    private double amount;
    private boolean isDeposit;

    public Transaction(BankAccount account, double amount, boolean isDeposit) {
        // TODO: Initialize the transaction with the provided account, amount, and transaction type.
        this.account = account;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    @Override
    public void run() {
        // TODO: Implement the run method to perform either a deposit or withdrawal based on the transaction type.
        // Call the respective method in the BankAccount class.
        if (this.isDeposit) {
            this.account.deposit(this.amount);
        } else {
            this.account.withdraw(this.amount);
        }
    }
}

