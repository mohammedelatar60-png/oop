import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<BankAccount2> accounts = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Bank Account System =====");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Display Account Information");
            System.out.println("6. Display Total Accounts");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    createSavingsAccount();
                    break;

                case 2:
                    createCurrentAccount();
                    break;

                case 3:
                    depositMoney();
                    break;

                case 4:
                    withdrawMoney();
                    break;

                case 5:
                    displayAccountInformation();
                    break;

                case 6:
                    displayTotalAccounts();
                    break;

                case 7:
                    System.out.println("Thank you for using Bank Account System.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void createSavingsAccount() {

        scanner.nextLine();

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        BankAccount2 account =
                new SavingsAccount(name, accountNumber, balance);

        accounts.add(account);

        System.out.println("Savings Account created successfully.");
    }

    private static void createCurrentAccount() {

        scanner.nextLine();

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        BankAccount2 account =
                new CurrentAccount(name, accountNumber, balance);

        accounts.add(account);

        System.out.println("Current Account created successfully.");
    }

    private static BankAccount2 findAccount() {

        scanner.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        for (BankAccount2 account : accounts) {

            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }

        System.out.println("Account not found.");
        return null;
    }

    private static void depositMoney() {

        BankAccount2 account = findAccount();

        if (account == null) {
            return;
        }

        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        account.deposit(amount);
    }

    private static void withdrawMoney() {

        BankAccount2 account = findAccount();

        if (account == null) {
            return;
        }

        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        account.withdraw(amount);
    }

    private static void displayAccountInformation() {

        BankAccount2 account = findAccount();

        if (account == null) {
            return;
        }

        System.out.println("\n===== Account Information =====");
        System.out.println(account);
    }

    private static void displayTotalAccounts() {

        System.out.println(
                "Total accounts: " + BankAccount2.getTotalAccounts()
        );
    }
}