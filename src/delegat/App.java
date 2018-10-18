package delegat;

import delegat.simpleExample.B;

public class App {
    public static void main(String[] args) {
//        B b = new B();
//        b.f();

        Painter painter = new Painter();
        
        painter.setGraphic(new Square());
        painter.draw();

        painter.setGraphic(new Triangle());
        painter.draw();

        painter.setGraphic(new Circle());
        painter.draw();
    }
}
