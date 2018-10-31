package visitor;

import visitor.element.*;
import visitor.visitor.BadVisitor;
import visitor.visitor.GoodVisitor;
import visitor.visitor.Visitor;

public class App {

    public static void main(String[] args) {
        Element body = new BodyElement();
        Element engine = new EngineElement();
        CarElement carElement = new CarElement();

        Visitor visitor = new BadVisitor();
        Visitor godVisitor = new GoodVisitor();

        body.accept(visitor);
        engine.accept(visitor);
        carElement.accept(visitor);

        System.out.println();

        engine.accept(godVisitor);
        carElement.accept(godVisitor);
    }
}
