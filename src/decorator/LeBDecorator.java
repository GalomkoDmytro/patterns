package decorator;

public class LeBDecorator extends Decorator{
    public LeBDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("<");
        component.print();
    }
}
