package part1;
import java.util.Random;
public class TrafficLight {
    String lightColorArray[] = {"Green","Red"};
    Random random = new Random();
    int lightColor = random.nextInt(lightColorArray.length);

    public TrafficLight(){
    }
}
