package part1;

public class Road {
    int roads;
    int[] roadSegements;
    int[] roadArray;


    public int getRoads() {
        return roads;
    }


    public void setRoads(int roads) {
        this.roads = roads;
    }




    public Road(){
        roads = 3;
        roadSegements = new int[]{10, 20, 30};
    }

}
