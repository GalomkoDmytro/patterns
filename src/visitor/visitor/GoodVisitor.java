package visitor.visitor;

import visitor.element.BodyElement;
import visitor.element.CarElement;
import visitor.element.EngineElement;
import visitor.element.WheelElement;

public class GoodVisitor implements Visitor {
    @Override
    public void visit(EngineElement engineElement) {
        System.out.println("fix engine");
    }

    @Override
    public void visit(BodyElement bodyElement) {
        System.out.println("fix body");
    }

    @Override
    public void visit(WheelElement wheelElement) {
        System.out.println(wheelElement.getName() + " check");
    }

    @Override
    public void visit(CarElement carElement) {
        System.out.println("clean car");
    }
}
