package part1;

public class Main {
    public static void main(String[] args){
        int time = 25;
        Car car = new Car(4,1);
        TrafficLight trafficLight = new TrafficLight();
        Road road = new Road();
        int[] roadArray = new int[road.roads];
        for (int i=0; i<road.roads;i++){
            roadArray[i] = road.roadSegements;
        }
        for (int value : roadArray) {
            trafficLight = new TrafficLight();
            while (time > 0) {
                if (trafficLight.lightColorArray[trafficLight.lightColor].equals("Green")) {
                    System.out.println(" Car Position " + car.carStartPosition + " " + car.carEndPosition);
                    if (car.carStartPosition < value) {
                        car.carStartPosition += 1;
                        car.carEndPosition += 1;
                    } else {
                        break;
                    }
                }
                else {
                    trafficLight = new TrafficLight();
                    System.out.println(" Light Color " + trafficLight.lightColorArray[trafficLight.lightColor]);
                }
                time -= 1;
            }
            car.carStartPosition -= (value-car.carLength);
            car.carEndPosition = 1;
        }
    }
}
