package visitor.element;

import visitor.visitor.Visitor;

public class CarElement implements Element {
    Element[] elements;

    public CarElement() {
        this.elements = new Element[] {
                new WheelElement("front left"),
                new WheelElement("back left"),
                new WheelElement("front right"),
                new WheelElement("back right")
        };
    }

    @Override
    public void accept(Visitor visitor) {
        for(Element element : elements) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}
