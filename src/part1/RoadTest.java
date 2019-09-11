package part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoadTest {

    @Test void checkGetAndSet(){
        Road road = new Road(5,new int[] {10,20,30});
        assertEquals(5,road.getRoads());
        int[] expectedArray = {10,20,30};
        assertArrayEquals(expectedArray,road.getRoadSegements());
    }


}