package SDA_OOP_Tasks1;

public class Exercise7 {
    public static void main(String[] args) {
        CircleGeometricObject circleGeometricObject = new CircleGeometricObject(14);
        System.out.println(circleGeometricObject.getArea());
        System.out.println(circleGeometricObject.getPerimeter());

        System.out.println("#############################################");

        Resizable resizable = new ResizableCircle(40);
        resizable.resize(30);
        System.out.println(resizable);

    }
}
