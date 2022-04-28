package bank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class debitAccountTest {

    @Test
    public void aNewBankAccountShouldHaveBalanceZero() {
        var bankAccount = new debitAccount();
        assertEquals(0, bankAccount.balance());
    }



}
