package bank;

public class creditAccount {
    private final int balance;
    private int creditLimit;

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
}
