package atm_simulation;

import java.util.Scanner;

public class BankAccount {
	static Scanner scn = new Scanner(System.in);
	double balance = 100.0;

	public static void printMenu() {
		System.out.println("========== MAIN MENU ==========");
		System.out.println("\t1: Check Balance");
		System.out.println("\t2: Withdraw");
		System.out.println("\t3: Deposit");
		System.out.println("\t4: Exit");
		System.out.println("===============================");
	}

	public static int getInt() {
		System.out.print("Enter a choice: ");
		while (!scn.hasNextInt()) {
			scn.nextLine(); // Clear bad entry
			System.out.println("Invalid entry, please enter a whole number using digits.");
			System.out.print("Enter a choice: ");
		}
		int choice = scn.nextInt();
		scn.nextLine(); // Clear scanner
		return choice;
	}

	public static int getChoice() {
		boolean isValid = false;
		int choice;
		do {
			choice = getInt();
			if (choice < 1 || choice > 4) {
				System.out.println("Please enter a number between 1 and 4.");
			} else {
				isValid = true;
			}
		} while (!isValid);
		return choice;
	}

	public static double getDouble(String message) {
		System.out.print(message);
		while(!scn.hasNextDouble()) {
			scn.nextLine();
			System.out.println("Invalid entry, please enter an amount using digits.");
			System.out.print(message);
			
		}
		double amount = scn.nextDouble();
		scn.nextLine();
		return amount;
	}

	public static double getAmount(String message) {
		double amount;
		boolean isValid = false;
		do {
			amount = getDouble(message);
			if (amount < 0.0) {
				System.out.println("Please enter a positive value.");
			} else {
				isValid = true;
			}
		} while (!isValid);
		return amount;
	}

	public void checkBalance() {
		System.out.printf("Your balance is : $%.2f\n\n", balance);
	}

	public boolean withdraw() {
		double amount = getAmount("Enter the amount you want to withdraw : ");
		if (amount <= balance) {
			System.out.printf("Successfully withdrew $%.2f\n", amount);
			this.balance -= amount;
			checkBalance();
			return true;
		} else {
			System.out.println("You do not have enough balance. Transaction unsuccessful.");
			return false;
		}
	}

	public boolean deposit() {
		double amount = getAmount("Enter the amount you want to deposit : ");
		System.out.printf("Successfully deposited $%.2f\n", amount);
		this.balance += amount;
		checkBalance();
		return true;
	}

	public static void main(String[] args) {
		int userChoice = 0;
		BankAccount myAccount = new BankAccount();
		do {
			printMenu();
			userChoice = getChoice();
			switch (userChoice) {
			case 1:
				myAccount.checkBalance();
				break;
			case 2:
				myAccount.withdraw();
				break;
			case 3:
				myAccount.deposit();
				break;
			default:
			}
		} while (userChoice != 4);
		System.out.println("Thank you! Have a nice day.");
	}
}
