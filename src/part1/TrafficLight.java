package part1;
import java.util.Random;
public class TrafficLight {
    int percentage;
    String lightColour;


    public void operatorLight(){
        Random random = new Random();
        int percentage = random.nextInt(100);
        if (percentage<90){
            lightColour = "Red";
        }
        else{
            lightColour = "Green";
        }
    }

    public TrafficLight(){
    }
}
