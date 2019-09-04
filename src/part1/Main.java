package part1;

public class Main {
    public static void main(String[] args){
        int time = 25;
        Car car = new Car(3);
        Road road = new Road(3, new int[]{10, 20, 30});

        for (int value : road.roadSegements) {
            TrafficLight trafficLight = new TrafficLight();
            for (int i = 0; i<time; i++) {
                System.out.println(" Car Position " + car.carStartPosition + "-" + car.carEndPosition+ " "+trafficLight.lightColorArray[trafficLight.lightColor]);
                if (trafficLight.lightColorArray[trafficLight.lightColor].equals("Green")|| car.carStartPosition < value) {
                    car.moveCar();
                }
                else {
                    break;
                }
                trafficLight.lightColorArray[trafficLight.lightColor] = "Green";
            }
            car.setCarToOriginalPos();
        }
    }
}
