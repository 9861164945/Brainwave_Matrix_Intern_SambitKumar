// package com.TaskBrainWaveSolutions;

public interface Atm{
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
    void transfer(double amount, String targetAccount);
}
