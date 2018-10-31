package visitor.visitor;

import visitor.element.BodyElement;
import visitor.element.CarElement;
import visitor.element.EngineElement;
import visitor.element.WheelElement;

public class BadVisitor implements Visitor{
    @Override
    public void visit(EngineElement engineElement) {
        System.out.println("Engine start");
    }

    @Override
    public void visit(BodyElement bodyElement) {
        System.out.println("hit the wheel");
    }

    @Override
    public void visit(WheelElement wheelElement) {
        System.out.println(wheelElement.getName() + " ignored");
    }

    @Override
    public void visit(CarElement carElement) {
        System.out.println("smocking inside car");
    }
}
