package visitor.element;

import visitor.visitor.Visitor;

public class WheelElement implements Element {
    String position;

    public WheelElement(String position) {
        this.position = position;
    }

    public String getName() {
        return this.position;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
