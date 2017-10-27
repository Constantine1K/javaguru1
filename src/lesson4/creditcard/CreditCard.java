package lesson4.creditcard;

public class CreditCard {

    private double balance;

    public void topup(double amount){
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public boolean withdraw(double amount){
        if (amount < 0){
            return false;
        }
        if (balance - amount > 0.000001) {
            balance = balance - amount;
            return true;
        }
        return false;
    }

    public double getBalance(){
        return balance;
    }

}
