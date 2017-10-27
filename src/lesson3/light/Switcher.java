package lesson3.light;

public class Switcher {

    LightBulb lightBulb;

    void connect(LightBulb bulb){
        lightBulb = bulb;
    }

    void switchOn(){
        lightBulb.turnOn();
    }

    void  switchOff(){
        lightBulb.turnOff();
    }

}
