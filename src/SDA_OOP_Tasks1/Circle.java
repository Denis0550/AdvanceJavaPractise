package SDA_OOP_Tasks1;

public class Circle extends Shape {
     private float radius;

    public Circle() {
    }

    public Circle(String color, boolean isFilled, float radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }


    @Override
    public float getArea() {
        return (float)(Math.PI * radius * radius);
    }

    @Override
    public float getPerimeter() {
        return (float)(2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return String.format("Circle with radius=%f which is a subclass off%s,",
                radius, super.toString());
    }
}
