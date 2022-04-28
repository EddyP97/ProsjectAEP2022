package bank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class creditAccountTest {

    @Test
    public void aNewBankAccountShouldHaveBalanceEqualToCredit() {
        var bankAccount = new creditAccount(5000);
        assertEquals(5000, bankAccount.balance());
    }
}
