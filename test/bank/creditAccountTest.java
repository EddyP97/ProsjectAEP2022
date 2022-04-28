package bank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class creditAccountTest {

    @Test
    public void aNewBankAccountShouldHaveBalanceEqualToCredit() {
        var bankAccount = new creditAccount(5000);
        assertEquals(5000, bankAccount.balance());
    }

    @Test (expected = IllegalArgumentException.class)
    public void creditCannotZeroOrNegative() {
        var bankAccount = new creditAccount(0);
    }
}
