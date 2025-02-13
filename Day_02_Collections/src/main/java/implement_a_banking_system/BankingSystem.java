package implement_a_banking_system;

import java.util.*;

public class BankingSystem {
    private final Map<String, Double> accounts = new HashMap<>();
    private final TreeMap<Double, String> sortedAccounts = new TreeMap<>();
    private final Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    public void addAccount(String accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
        sortedAccounts.put(initialBalance, accountNumber);
    }

    public void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double newBalance = accounts.get(accountNumber) + amount;
            sortedAccounts.remove(accounts.get(accountNumber));
            accounts.put(accountNumber, newBalance);
            sortedAccounts.put(newBalance, accountNumber);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void requestWithdrawal(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
        } else {
            System.out.println("Account not found.");
        }
    }

    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            String accountNumber = request.accountNumber;
            double amount = request.amount;

            if (accounts.get(accountNumber) >= amount) {
                sortedAccounts.remove(accounts.get(accountNumber));
                accounts.put(accountNumber, accounts.get(accountNumber) - amount);
                sortedAccounts.put(accounts.get(accountNumber), accountNumber);
                System.out.println("Withdrawal of " + amount + " from account " + accountNumber + " successful.");
            } else {
                System.out.println("Insufficient funds for account " + accountNumber + ".");
            }
        }
    }

    public void displaySortedAccounts() {
        System.out.println("\nAccounts Sorted by Balance:");
        sortedAccounts.forEach((balance, accountNumber) -> System.out.println(accountNumber + ": " + balance));
    }
}
