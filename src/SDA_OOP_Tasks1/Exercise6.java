package SDA_OOP_Tasks1;

public class Exercise6 {
    public static void main(String[] args) {
        Movable movablePoint = new MovablePoint(10,10,3,3);
        System.out.println(movablePoint);
        movablePoint.moveRight();
        movablePoint.moveUp();
        System.out.println(movablePoint);

        Movable movableCircle = new MovableCircle(10,20,30,4,4);
        System.out.println(movableCircle);
        movableCircle.moveRight();
        movableCircle.moveUp();
        System.out.println(movableCircle);
    }
}
