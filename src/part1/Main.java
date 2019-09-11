package part1;

public class Main {
    public static void main(String[] args){
        int time = 25;
        Car car = new Car(3);
        Road road = new Road(3, new int[]{10, 20, 30});
        TrafficLight trafficLight = new TrafficLight();

        for (int value : road.roadSegements) {
            trafficLight.operatorLight();
            for (int i = 0; i<time; i++) {
                System.out.println(" Car Position " + car.carStartPosition + "-" + car.carEndPosition+ " "+trafficLight.lightColour);
                trafficLight.operatorLight();
                if (trafficLight.lightColour.equals("Green") || car.carStartPosition < value) {
                    if (car.carStartPosition < value) {
                        car.moveCar();
                    } else {

                        break;
                    }
                }
            }
            car.setCarToOriginalPos();
        }
    }
}
