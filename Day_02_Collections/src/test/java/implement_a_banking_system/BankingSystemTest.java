package implement_a_banking_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankingSystemTest {
    private BankingSystem bank;

    @BeforeEach
    void setUp() {
        bank = new BankingSystem();
        bank.addAccount("ACC001", 5000);
        bank.addAccount("ACC002", 2000);
        bank.addAccount("ACC003", 8000);
    }

    @Test
    void testDeposit() {
        bank.deposit("ACC002", 1000);
        bank.displaySortedAccounts();
    }

    @Test
    void testWithdrawalProcessing() {
        bank.requestWithdrawal("ACC001", 1000);
        bank.processWithdrawals();
        bank.displaySortedAccounts();
    }
}
