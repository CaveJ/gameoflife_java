package org.example.gameoflife;

import java.util.Map;

public class CycleCalculatorService {
    private final World world;

    public CycleCalculatorService(World world) {
        this.world = world;
    }

    public World CalculateNextCycle() {
        // TODO compute all cells neighbouring an active cell. Increment every time the field was identified as neighbour;
        Map<Cell, Integer> cellsOfInterest = null;

        // TODO apply the four rules for all cells of interest

        // TODO build the new world
        throw new RuntimeException("Not yet implemented");
    }


}
