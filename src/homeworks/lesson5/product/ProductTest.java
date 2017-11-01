package homeworks.lesson5.product;

public class ProductTest {

    public static void main(String[] args) {

        Product milk = new Product("milk", 0.9);

        for (int i = 0; i < 10; i++) {
            milk.setDiscount(i + 5);
            System.out.println(milk);
        }

    }

}
