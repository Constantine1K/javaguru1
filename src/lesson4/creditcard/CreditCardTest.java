package lesson4.creditcard;

public class CreditCardTest {

    public static void main(String[] args) {
        CreditCard card = new CreditCard();
        card.topup(-20);
        card.topup(20);
        System.out.println(card.getBalance());
        card.withdraw(30);
        System.out.println(card.getBalance());
        card.withdraw(10);
        System.out.println(card.getBalance());
    }

}
