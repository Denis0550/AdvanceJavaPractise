package CompositePatternDemo;

public interface Line {
    void draw(double lengthInPixels);
    void setStartingPosition(Point position);
    Point getStartingPoint();
}
