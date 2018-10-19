package iterator;

public class ConcreteAgregate implements Agregate {
    String[] task = {"task 1", "task 2", "task 3"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < task.length;
        }

        @Override
        public Object next() {
            return task[index++];
        }
    }
}
