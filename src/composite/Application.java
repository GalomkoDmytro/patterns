package composite;

import composite.shapes.Circle;
import composite.shapes.Shape;
import composite.shapes.Square;
import composite.shapes.Triangle;

public class Application {

    public static void main(String[] args) {
        Shape square = new Square();
        Shape square2 = new Square();
        Shape triangle = new Triangle();
        Shape triangle2 = new Triangle();
        Shape circle = new Circle();

        Composite composite = new Composite();
        composite.addComponent(square2);
        composite.addComponent(square2);
        composite.addComponent(triangle2);

        Composite composite2 = new Composite();
        composite2.addComponent(square);
        composite2.addComponent(triangle);
        composite2.addComponent(circle);

        composite.addComponent(composite2);

        composite.draw();

    }
}
