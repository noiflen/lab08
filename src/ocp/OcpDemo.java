package ocp;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() { System.out.println("Рисование круга."); }
}

class Square implements Shape {
    public void draw() { System.out.println("Рисование квадрата."); }
}

class ShapeDrawer {
    public void draw(Shape shape) {
        shape.draw();
    }
}

public class OcpDemo {
    public static void run() {
        System.out.println("Демонстрация OCP ");
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.draw(new Circle());
        drawer.draw(new Square());
    }
}