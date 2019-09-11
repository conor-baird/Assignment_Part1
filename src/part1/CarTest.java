package part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test void checkGetAndSet(){
        Car car = new Car(2);
        assertEquals(2,car.getCarLength());
        assertEquals(0,car.getCarEndPosition());
        if (car.carLength<=1){
            assertEquals(0,car.getCarStartPosition());
        }
        else{
            assertEquals(2,car.getCarStartPosition());
        }
    }
    @Test void checkMoveCar(){
        Car car = new Car(2);
        car.moveCar();
        assertEquals(3,car.carStartPosition);
        assertEquals(1,car.carEndPosition);
    }
    @Test void checkSetCarToOriginalPosition(){
        Car car = new Car(2);
        car.setCarToOriginalPos();
        if (car.carLength<=1){
            assertEquals(0,car.carStartPosition);
            assertEquals(0,car.carEndPosition);
        }
        else{
            assertEquals(2,car.carStartPosition);
            assertEquals(0,car.carEndPosition);
        }
    }

}