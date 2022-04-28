package bank;

//Understands a bank with a customers balance sheet
public class debitAccount {


    private int balance;

    public debitAccount() {
        this.balance=0;
    }

    public int balance() {
        return balance;
    }

    public void deposit(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Can't deposit negative amount");
        }
        balance +=value;
    }

    public void withdraw(int value) {
        if (value > balance) {
            throw new IllegalStateException("Can't withdraw more money than you have");
        }
        balance -= value;
    }
}
