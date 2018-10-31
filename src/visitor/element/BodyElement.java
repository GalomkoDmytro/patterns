package visitor.element;

import visitor.visitor.Visitor;

public class BodyElement implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
