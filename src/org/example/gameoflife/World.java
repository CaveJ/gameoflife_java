package org.example.gameoflife;

import java.util.List;
import java.util.Collections;

public class World {
    private final List<Cell> activeCells;

    public World(List<Cell> activeCells) {
        this.activeCells = activeCells;
    }

    public List<Cell> getActiveCells() {
        return Collections.unmodifiableList(activeCells);
    }
}
