package com.app.transactionsystem;

import com.app.transactionsystem.model.BankAccount;
import com.app.transactionsystem.service.Transaction;

public class BankingSystem {
    public static void main(String[] args) throws InterruptedException {
        // TODO: Create an instance of the BankAccount class for testing, providing an account number and initial balance.
        BankAccount bankAccount = new BankAccount(123, 1000);
        // TODO: Create two instances of the Transaction class (one for deposit, one for withdrawal) using the same account.
        Transaction depositTransaction = new Transaction(bankAccount, 500, true);
        Transaction withdrawalTransaction = new Transaction(bankAccount, 700, false);

        // TODO: Create two threads (using the Thread class) for concurrent execution of the deposit and withdrawal transactions.
        Thread depositThread = new Thread(depositTransaction);
        Thread withdrawThread = new Thread(withdrawalTransaction);

        // TODO: Start the threads using the start method.
        depositThread.start();
        withdrawThread.start();
        // TODO: Use the join method to wait for both threads to finish execution.
        depositThread.join();
        withdrawThread.join();

        // TODO: Display the final balance in the account after the transactions are completed.
        System.out.println("Balance after both the transactions is: " + bankAccount.getBalance());
    }
}