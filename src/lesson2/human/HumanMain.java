package lesson2.human;

public class HumanMain {

    public static void main(String[] args) {
        Human bob = new Human();
        bob.name = "Bob";
        bob.age = 20;
        bob.sayHi();

        Human jack = new Human();
        jack.name = "Jack";
        jack.age = 45;
        jack.sayHi();

        //object state can be changed
        jack.name = "Jack Ivanov";
        jack.sayHi();
    }

}
