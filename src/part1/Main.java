package part1;
// This class initialises the car, road and traffic light classes and has loops that update the cars position based on a time variable
public class Main {
    // This method initialises all of the classes and loops through the time while updating the cars position.
    public static void main(String[] args){
        int time = 25;
        Car car = new Car(3);
        Road road = new Road(3, new int[]{10, 20, 30});
        TrafficLight trafficLight = new TrafficLight();
        // This initial for loop goes through the number of roads in the roads segments array
        for (int value : road.roadSegements) {
            trafficLight.operatorLight();
            // THis for loop is what loops through the time and updates the position of the car.
            for (int i = 0; i<time; i++) {
                System.out.println(" Car Position " + car.carStartPosition + "-" + car.carEndPosition+ " "+trafficLight.lightColour);
                trafficLight.operatorLight();
                // These if statements test if the car has reached a red light or if it has reached the end of the road.
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
