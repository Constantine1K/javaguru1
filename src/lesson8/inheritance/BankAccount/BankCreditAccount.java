package lesson8.inheritance.BankAccount;

public class BankCreditAccount extends BankAccount{

    private double creditBalance;

    @Override
    public void increaseBalance(double amount){
        System.out.println("BankCreditAccount increaseBalance");
        if (creditBalance - amount > 0.01){
            creditBalance = creditBalance - amount;

    } else {
            creditBalance = 0;
            super.increaseBalance(amount);
        }

    }

    @Override
    public String toString() {
        return "BankCreditAccount{" +
                "creditBalance=" + creditBalance +
                ", balance" + getBalance() +
                '}';
    }
}
