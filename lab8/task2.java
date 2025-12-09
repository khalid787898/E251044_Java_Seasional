
public class ShapeOverrideTask {
    public static void main(String[] args) {

        Shape s = new Shape();
        Circle cir = new Circle();
        Rectangle rect = new Rectangle();

        System.out.println("Generic Shape:");
        s.draw();

        System.out.println("\nCircle Shape:");
        cir.draw();

        System.out.println("\nRectangle Shape:");
        rect.draw();
    }
}

class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}


class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}


class Rectangle extends Shape {

    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
