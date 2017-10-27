package lesson3.light;

public class LightMain {

    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        Switcher switcher = new Switcher();
        switcher.connect(lightBulb);

        switcher.switchOn();
        switcher.switchOff();

        switcher.switchOn();
        switcher.switchOff();

        switcher.switchOn();
        switcher.switchOff();

        switcher.switchOn();
        switcher.switchOff();

        switcher.switchOn();
        switcher.switchOff();

        lightBulb = new LightBulb();
        switcher.connect(lightBulb);
        switcher.switchOn();
        switcher.switchOff();
    }

}
