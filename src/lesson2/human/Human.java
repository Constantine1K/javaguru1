package lesson2.human;

public class Human {

    /*
    * class Human has state : name and age
    * These variables are called fields
    * */

    String name;
    int age;

    /*
    * And it has 1 behaviour -
    * Human can print his name and age
    * */
    void sayHi(){
        System.out.println("Hi! My name is " + name
                + ", I'm " + age + " years old");
    }

}
