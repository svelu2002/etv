package com.app.transactionsystem.model;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double initialBalance) {
        // TODO: Initialize the account with the provided account number and balance.
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;

    }

    public double getBalance() {
        return balance;
    }

    public synchronized void withdraw(double amount) {
        // TODO: Implement a thread-safe withdrawal method.
        // Deduct the specified amount from the balance, ensuring sufficient funds.
        // Print a message indicating the withdrawal transaction.
        if (this.balance > amount) {
            this.balance -= amount;
            System.out.println("Amount withdrawn: " + amount + " and balance is: " + this.balance);
        } else {
            System.err.println("Insufficient balance");
        }
    }

    public synchronized void deposit(double amount) {
        // TODO: Implement a thread-safe deposit method.
        // Add the specified amount to the balance, ensuring a valid amount.
        // Print a message indicating the deposit transaction.
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Amount " + amount + " deposited and the new balance is: " + this.balance);
        } else {
            System.err.print("Amount is less than 1");
        }
    }
}

