package part1;

public class Main {
    public static void main(String[] args){
        int time = 25;
        Car car = new Car(2,1);
        Road road = new Road();
        int[] roadArray = new int[road.roads];
        for (int i=0; i<road.roads;i++){
            roadArray[i] = road.roadSegements;
        }
        for (int value : roadArray) {
            while (time > 0) {
                TrafficLight trafficlight = new TrafficLight();
                if (trafficlight.lightColorArray[trafficlight.lightColor].equals("Green")) {
                    while (time > 0) {
                        System.out.println(" Car Position " + car.carStartPosition + " " + car.carEndPosition);
                        if (car.carStartPosition < value) {
                            car.carStartPosition += 1;
                            car.carEndPosition += 1;
                        } else {
                            break;
                        }
                        time -= 1;
                    }
                    car.carStartPosition -= (value-2);
                    car.carEndPosition -= (value-2);
                }
                else {
                    System.out.println(" Light Color " + trafficlight.lightColorArray[trafficlight.lightColor]);
                }

                time -= 1;
            }
        }




    }
}
