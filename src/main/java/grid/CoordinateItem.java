package grid;

public class CoordinateItem <E> {

    public final Coordinate coordinate;
    public final E item;

    public CoordinateItem(Coordinate coordinate, E item) {
        this.coordinate = coordinate;
        this.item = item;
    }
}
