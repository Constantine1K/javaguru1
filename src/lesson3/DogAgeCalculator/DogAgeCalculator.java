package lesson3.DogAgeCalculator;

public class DogAgeCalculator {
    int toHumanAge(int dogAge) {
        int age = 0;
        dogAge = dogAge - 1;
        age = 15;
        if (dogAge >= 1){
            dogAge = dogAge - 1;
            age = age + 9;
        }
        if (dogAge >= 1){
            age = age + (dogAge*4);
        }
        System.out.println("Dog age to Human age " + age);
        return age;
    }

    int toDogAge(int humanAge){
        int age = 0;
        humanAge = humanAge - 15;
        age = 1;
        if (humanAge >= 1) {
            humanAge = humanAge - 9;
            age = age + 1;
        }
        if (humanAge >= 1) {
            age = age + (humanAge / 4);
        }
        System.out.println("Human age to dog age " + age);
        return age;

    }

}


