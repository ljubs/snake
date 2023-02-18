package grid;

import java.util.ArrayList;
import java.util.List;

public class Grid<E> {

    private final int rows;
    private final int columns;
    private List<List<E>> grid;

    public Grid(int rows, int columns, E value) {
        this.rows = rows;
        this.columns = columns;
        this.grid = new ArrayList<>();

        for (int r = 0; r < rows; r++) {
            grid.add(new ArrayList<>());
            for (int c = 0; c < columns; c++) {
                grid.get(r).add(value);
            }
        }
    }

    public int getRows() {
        return this.grid.size();
    }

    public int getColumns() {
        return this.grid.get(0).size();
    }

    public E get(int row, int column) {
        return this.grid.get(row).get(column);
    }

    public void set(int row, int column, E value) {
        this.grid.get(row).set(column, value);
    }

}
