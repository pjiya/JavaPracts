package practicals;
import java.util.*;

		class BankAccount {

		    private double balance;


		    public BankAccount(double balance) {

		        this.balance = balance;

		    }


		    public void deposit(double amount) {

		        balance += amount;

		        System.out.println("Deposited: $" + amount);

		        displayBalance();

		    }


		    public void withdraw(double amount) {

		        if (amount <= balance) {

		            balance -= amount;

		            System.out.println("Withdrawn: $" + amount);

		        } else {

		            System.out.println("Insufficient funds. Withdrawal not allowed.");

		        }

		        displayBalance();

		    }


		    public void displayBalance() {

		        System.out.println("Current Balance: $" + balance);

		    }

		    public double getBalance() {

		        return balance;

		    }

		}


		class SavingsAccount extends BankAccount {

		    private static final double WITHDRAWAL_LIMIT = 500;


		    public SavingsAccount(double balance) {

		        super(balance);

		    }


		    @Override

		    public void withdraw(double amount) {

		        if (amount <= WITHDRAWAL_LIMIT && amount <= getBalance()) {

		            super.withdraw(amount);

		        } else {

		            System.out.println("Withdrawal limit exceeded or insufficient funds. Withdrawal not allowed.");

		        }

		    }

		}


		class CurrentAccount extends BankAccount {

		    private static final double WITHDRAWAL_FEE = 2.5;


		    public CurrentAccount(double balance) {

		        super(balance);

		    }


		    @Override

		    public void withdraw(double amount) {

		        if (amount <= getBalance()) {

		            super.withdraw(amount + WITHDRAWAL_FEE);

		            System.out.println("Withdrawal fee applied: $" + WITHDRAWAL_FEE);

		        } else {

		            System.out.println("Insufficient funds. Withdrawal not allowed.");

		        }

		    }

		}


		public class Exp21 {

		    public static void main(String[] args) {

		        SavingsAccount savingsAccount = new SavingsAccount(1000);

		        CurrentAccount currentAccount = new CurrentAccount(2000);


		        System.out.println("Savings Account:");

		        savingsAccount.withdraw(200);

		        savingsAccount.deposit(20000);

		        savingsAccount.withdraw(600);


		        System.out.println("\nCurrent Account:");

		        currentAccount.withdraw(300);

		        currentAccount.deposit(500);

		        currentAccount.withdraw(2500);

		    }





	}


