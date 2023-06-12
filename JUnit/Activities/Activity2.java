import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class Activity2 {
    import activityPrograms.BankAccount;
    import activityPrograms.NotEnoughFundsException;
    import static org.junit.jupiter.api.Assertions.*;

    class ExpectedExceptionTest {

        @Test
        <BankAccount>
        void notEnoughFunds() {
            // Create an object for BankAccount class
            BankAccount account = new BankAccount(9);

            // Assertion for exception
            assertThrows(NotEnoughFundsException.class, () -> account.withdraw(10),
                    "Balance must be greater than amount of withdrawal");
        }

        @Test
        <BankAccount>
        void enoughFunds() {
            // Create an object for BankAccount class
            BankAccount account = new BankAccount(100);

            // Assertion for no exceptions
            assertDoesNotThrow(() -> account.withdraw(100));
        }
    }
}
