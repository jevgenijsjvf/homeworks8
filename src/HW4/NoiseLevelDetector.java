package HW4;

public class NoiseLevelDetector {
    public String detect(int level) {
        if (level >= 130) {
            return "Jackhammer";
        }
        if (level >= 70) {
            return "Gas lawnmower";
        }
        if (level >= 40) {
        }
        return "Quiet room";
    }
}
