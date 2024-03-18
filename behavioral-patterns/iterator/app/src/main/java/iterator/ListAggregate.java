package iterator;

import java.util.ArrayList;
import java.util.List;

public class ListAggregate<T> implements Aggregate<T> {

    private final List<T> items;

    public ListAggregate() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    @Override
    public Iterator<T> createIterator() {
        return new ListIterator<>(items);
    }
}
