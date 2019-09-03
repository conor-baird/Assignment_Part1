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

    public void setRoadArray(){
        System.out.println(roads);
        System.out.println(roadSegements);
        int[] roadArray = new int[roads];
        for (int i=0; i<roads;i++){
            roadArray[i] = roadSegements;
        }
    }

    public Road(){
        roads = 3;
        roadSegements = 10;
    }

}
