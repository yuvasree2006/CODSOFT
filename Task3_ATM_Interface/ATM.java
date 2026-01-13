import java.util.Scanner;

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000);

        int choice;
        double amount;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    account.deposit(amount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();
                    account.withdraw(amount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
