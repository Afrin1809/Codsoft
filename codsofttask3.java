package codsoft;

	import java.util.Scanner;

	class BankAccount {
	    private double balance;

	    public BankAccount(double balance) {
	        this.balance = balance;
	    }

	    public String deposit(double amount) {
	        balance += amount;
	        return "Deposited " + amount + ". New balance: " + balance;
	    }

	    public String withdraw(double amount) {
	        if (amount > balance) {
	            return "Insufficient balance.";
	        } else {
	            balance -= amount;
	            return "Withdrew " + amount + ". New balance: " + balance;
	        }
	    }

	    public String checkBalance() {
	        return "Current balance: " + balance;
	    }
	}

	class ATM {
	    private BankAccount account;

	    public ATM(BankAccount account) {
	        this.account = account;
	    }

	    public void interfaceATM() {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("\nWelcome to the ATM");
	            System.out.println("1. Withdraw");
	            System.out.println("2. Deposit");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    System.out.println(account.withdraw(withdrawAmount));
	                    break;
	                case 2:
	                    System.out.print("Enter amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    System.out.println(account.deposit(depositAmount));
	                    break;
	                case 3:
	                    System.out.println(account.checkBalance());
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	                    break;
	            }
	        }
	    }
	}

	public class codsofttask3 {
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(1000);
	        ATM atm = new ATM(account);
	        atm.interfaceATM();
	    }
	}


