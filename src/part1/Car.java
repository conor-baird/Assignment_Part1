package part1;

public class Car {
    int carLength;
    int carStartPosition;
    int carEndPosition;

    public int getCarLength() {
        return carLength;
    }

    public int getCarEndPosition() {
        return carEndPosition;
    }
    public int getCarStartPosition() {
        return carStartPosition;
    }

    public void setCarLength(int carLength) {
        this.carLength = carLength;
    }

    public void setCarEndPosition(int carEndPosition) {
        this.carEndPosition = carEndPosition;
    }

    public void setCarStartPosition(int carStartPosition) {
        if (carLength<=1){
            this.carStartPosition = 0;
        }
        else {
            this.carStartPosition = carStartPosition;
        }
    }

    public void moveCar(){
        carStartPosition += 1;
        carEndPosition += 1;
    }

    public void setCarToOriginalPos(){
        if (carLength<=1){
            carStartPosition = 0;
            carEndPosition =0 ;
        }
        else {
            carStartPosition = carLength;
            carEndPosition = 0;
        }
    }

    public Car(int carLength){
        setCarLength(carLength);
        setCarEndPosition(0);
        setCarStartPosition(carLength);
    }

}
