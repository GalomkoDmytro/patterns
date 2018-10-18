package decorator;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        PrinterInterface printerInterface = new Printer("Hello");
        printerInterface.print();
        System.out.println();

        PrinterInterface printerInterface2 = new QuotesDecorator(new Printer("Hello"));
        printerInterface2.print();
        System.out.println();

        PrinterInterface printerInterface3 = new LeBDecorator(new RBDecorator(new Printer("Hello")));
        printerInterface3.print();
    }
}
