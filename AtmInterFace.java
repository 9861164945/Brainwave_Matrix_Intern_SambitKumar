package com.TaskBrainWaveSolutions;

import java.util.Scanner;

public class AtmInterFace 
{
    private static final String USER_PIN = "1234"; //Default Pin
    private static double balance = 500.0; // Initial balance

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------Welcome to the ATM---------------------");

       
        if (!login(scanner)) 
        {
            System.out.println("Too many failed attempts. Exiting...");
            return;
        }

        boolean exit = false;

        while (!exit) 
        {
           
            System.out.println("\nChoose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Logout");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using Union Bank Of India Atm");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static boolean login(Scanner scanner) {
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            String enteredPin = scanner.next();
            if (enteredPin.equals(USER_PIN)) {
                System.out.println("Login successful!");
                return true;
            } else {
                System.out.println("Invalid PIN. Try again.");
                attempts++;
            }
        }
        return false;
    }

    private static void checkBalance() {
        System.out.printf("Your current balance is: $%.2f%n", balance);
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.printf("Successfully deposited $%.2f. New balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Successfully withdrew $%.2f. New balance: $%.2f%n", amount, balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            System.out.println("Invalid amount. Withdrawal failed.");
        }
    }
}
