package SDA_OOP_Tasks1;

public class Point2D {
    protected float x;
    protected float y;


    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }


    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        return new float[] {x, y};
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
//        return "Point2D{" +
//                "x=" + x +
//                ", y=" + y +
//                '}';
        return String.format("(%f,%f)", x, y);
    }
}
