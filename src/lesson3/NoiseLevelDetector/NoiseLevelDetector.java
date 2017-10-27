package lesson3.NoiseLevelDetector;

public class NoiseLevelDetector {

    String detect(int level) {

        if (level >= 130) {
            return "Jackhammer";
        } else if ((level > 70) && (level < 130)) {
            return "Gas lawnmower";
        } else if ((level > 40) && (level <= 70)) {
            return "Alarm clock";
        } else if ((level <= 40)) ;
        {
            return "Quiet room";
        }
    }
}