package lesson3.light;

public class LightBulb {

    int availableTurnOnCount = 5;
    boolean turnedOn;

    boolean canBeTurnedOn(){
        boolean result = availableTurnOnCount > 0;
        return result;
    }

    void turnOn(){
        if (!turnedOn && canBeTurnedOn()){
            availableTurnOnCount = availableTurnOnCount - 1;
            turnedOn = true;
            System.out.println("Light turned on");
        }
    }

    void turnOff(){
        if (turnedOn) {
            turnedOn = false;
            System.out.println("Light turned off");
        }
    }



}
