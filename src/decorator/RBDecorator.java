package decorator;

public class RBDecorator extends Decorator{
    public RBDecorator(PrinterInterface component) {
       super(component);
    }

    @Override
    public void print() {
        component.print();
        System.out.print(">");
    }
}