package part1;
import java.util.Random;
// This intialises the traffic lights colour and randomly changes it depending on a rnadom number
public class TrafficLight {
    String lightColour;

    // This method randomly selects a number less than 100 and if this number is less than 30 the light colour becomes Red else it is green
    public void operatorLight(){
        Random random = new Random();
        int percentage = random.nextInt(100);
        if (percentage<30){
            lightColour = "Red";
        }
        else{
            lightColour = "Green";
        }
    }

    public TrafficLight(){
    }
}
