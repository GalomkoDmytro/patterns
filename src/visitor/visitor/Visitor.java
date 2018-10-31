package visitor.visitor;

import visitor.element.BodyElement;
import visitor.element.CarElement;
import visitor.element.EngineElement;
import visitor.element.WheelElement;

public interface Visitor {
    void visit(EngineElement engineElement);
    void visit(BodyElement bodyElement);
    void visit(WheelElement wheelElement);
    void visit(CarElement carElement);
}
