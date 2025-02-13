package implement_a_banking_system;

public class Main {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.addAccount("ACC001", 5000);
        bank.addAccount("ACC002", 2000);
        bank.addAccount("ACC003", 8000);

        bank.deposit("ACC002", 1000);

        bank.requestWithdrawal("ACC001", 1000);
        bank.requestWithdrawal("ACC002", 5000);

        bank.processWithdrawals();

        bank.displaySortedAccounts();
    }
}
