package iterator;

public class App {
    public static void main(String[] args) {
        ConcreteAgregate c = new ConcreteAgregate();

        Iterator it = c.getIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
