package HW4;

public class NoiseLevelDetectorTest {

    public static void main (String[] args) {
        NoiseLevelDetector noiseLevelDetector = new NoiseLevelDetector();
        String result = noiseLevelDetector.detect(37);
        System.out.println("Result: " + result);
    }
}