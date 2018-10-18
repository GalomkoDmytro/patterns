package decorator;

public class Printer implements PrinterInterface {
    String value;

    Printer(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }

}
