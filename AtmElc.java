// package com.TaskBrainWaveSolutions;
import java.util.Scanner;

public class AtmElc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Bank object with account details
        scanner.nextLine();
        
        Bank account = new Bank("123456", 1000.0, "1234"); 

        while (true) {
            System.out.println("\nATM Interface:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    System.out.print("Enter target account number: ");
                    String targetAccount = scanner.next();
                    account.transfer(transferAmount, targetAccount);
                    break;
                case 5:
                    System.out.println("! Visit Again"
                    		+ "Thank you for using SbI Atm Service");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
