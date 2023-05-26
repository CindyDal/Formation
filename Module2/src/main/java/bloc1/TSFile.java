package bloc1;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class TSFile<T> {

    private final List<T> elements;

    public TSFile() {
        this.elements = new ArrayList<>();
    }

    public boolean estVide() {
        return elements.isEmpty();
    }

    public void enfiler(T element) {
        elements.add(element);
    }

    public T defiler() {
        if (estVide()) throw new EmptyStackException();
        return elements.remove(0);
    }
}
