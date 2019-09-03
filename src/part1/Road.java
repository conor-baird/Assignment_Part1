package part1;

public class Road {
    int roads;
    int roadSegements;
    int[] roadArray;


    public int getRoads() {
        return roads;
    }

    public int getRoadSegements() {
        return roadSegements;
    }

    public void setRoads(int roads) {
        this.roads = roads;
    }

    public void setRoadSegements(int roadSegements) {
        this.roadSegements = roadSegements;
    }


    public Road(){
        roads = 3;
        roadSegements = 10;
    }

}
