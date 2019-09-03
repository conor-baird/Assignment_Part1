package part1;

public class Main {
    public static void main(String[] args){
        int time = 25;
        Car car = new Car(4);
        Road road = new Road();
        road.setRoadArray();
        for (int value : road.roadArray) {
            TrafficLight trafficLight = new TrafficLight();
            for (int i = 0; i<time; i++) {
                System.out.println(" Car Position " + car.carStartPosition + "-" + car.carEndPosition+ " "+trafficLight.lightColorArray[trafficLight.lightColor]);
                if (trafficLight.lightColorArray[trafficLight.lightColor].equals("Green")) {
                    if (car.carStartPosition < value) {
                        car.moveCar();
                    } else {
                        break;
                    }
                }
                trafficLight.lightColorArray[trafficLight.lightColor] = "Green";
            }
            car.carStartPosition -= (value-car.carLength);
            car.carEndPosition = 0;
        }
    }
}
