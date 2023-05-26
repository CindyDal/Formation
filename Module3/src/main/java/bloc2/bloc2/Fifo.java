package bloc2.bloc2;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Fifo<T> {

    private List<T> elements;

    public Fifo() {
        this.elements = new ArrayList<>();
    }

    public void push(T element) {
        elements.add(element);
    }

    public T pop() {
        if (elements.isEmpty())
            throw new EmptyStackException();
        return elements.remove(0);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
