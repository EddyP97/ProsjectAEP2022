package bank;

public class creditAccount {
    private int balance;
    private final int creditLimit;

    public creditAccount(int creditLimit) {
        if (creditLimit <= 0) {
            throw new IllegalArgumentException("Credit limit must be bigger than zero");
        }
        this.creditLimit = creditLimit;
        this.balance = 0;
    }

    public int balance() {
        return balance + creditLimit;
    }

    public void deposit(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Can't deposit negative amount");
        }
        balance += value;
    }
}
