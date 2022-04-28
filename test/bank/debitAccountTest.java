package bank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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

    @Test
    public void withdrawing500AfterDepositing500ShouldGiveBalanceZero() {
        var bankAccount = new debitAccount();
        bankAccount.deposit(500);
        bankAccount.withdraw(500);
        assertEquals(0,bankAccount.balance());
    }

    @Test (expected = IllegalStateException.class)
    public void notAbleToWithdrawMoreMoneyThanYouHave() {
        var bankAccount = new debitAccount();
        bankAccount.withdraw(600);
    }

    @Test
    public void twoBankAccountsWithSameBalanceShouldBeDifferent() {
        var bankAccount = new debitAccount();
        var anotherBankAccount = new debitAccount();
        assertNotEquals(bankAccount,anotherBankAccount);
    }



}
