package bank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class debitAccountTest {

    @Test
    public void aNewBankAccountShouldHaveBalanceZero() {
        var bankAccount = new debitAccount();
        assertEquals(0, bankAccount.balance());
    }

    @Test
    public void deposit500ShouldUpdateBalanceTo500() {
        var bankAccount = new debitAccount();
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.balance());
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldNotBeAbleToDepositNegativeAmount() {
        var bankAccount = new debitAccount();
        bankAccount.deposit(-500);

    }



}
