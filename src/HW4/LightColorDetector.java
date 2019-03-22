package HW4;

public class LightColorDetector {
    public String detect (int wavelenght) {
       //wavelenght = 590;
       if (wavelenght>=380&&wavelenght<450) {
           return "Violet";
       }else if (wavelenght>=450&&wavelenght<495){
           return "Blue";
        }else if(wavelenght>=495&&wavelenght<570) {
           return "Green";
       }else if (wavelenght>=570&&wavelenght<590){
           return "Yellow";
       }else if (wavelenght>=590&&wavelenght<620){
           return "Orange";
       }else if (wavelenght>=620&&wavelenght<750){
           return "Red";
       }else {
           return "Light is not visible";
       }
    }
}
