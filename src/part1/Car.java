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
        this.carStartPosition = carStartPosition;
    }


    public Car(int carLength, int carEndPosition){
        setCarLength(carLength);
        setCarEndPosition(carEndPosition);
        setCarStartPosition(carLength);




    }

}
