// package com.TaskBrainWaveSolutions;

import java.util.Scanner;

public class Bank implements Atm {
    private String accountNumber;
    private double balance;
    private String pin;

    // Constructor to initialize account details 
    public Bank(String accountNumber, double initialBalance, String pin) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.pin = pin;
    }

    // Method to verify the PIN 
    public boolean verifyPin(String inputPin) {
        return this.pin.equals(inputPin);
    }
//Method To Deposit Balance
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount. Cannot deposit.");
        }
    }
//Method to Withdraw Balance
    @Override
    public void withdraw(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PIN to proceed: ");
        String inputPin = scanner.nextLine();

        if (!verifyPin(inputPin)) {
            System.out.println("Invalid PIN. Withdrawal canceled.");
            return;
        }

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
//Method to Check Balance
    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
//Method To Transfer Money
    @Override
    public void transfer(double amount, String targetAccount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Transferred: " + amount + " to Account: " + targetAccount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
        
    }
   
}
