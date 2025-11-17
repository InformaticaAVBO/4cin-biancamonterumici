import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<T> {
    private T[] elems;
    private int size;

    public Stack() { this(10); }

    @SuppressWarnings("unchecked")
    public Stack(int initialCapacity) {
        elems = (T[]) new Object[Math.max(1, initialCapacity)];
        size = 0;
    }

    public void push(T item) {
        if (size == elems.length) resize(elems.length * 2);
        elems[size++] = item;
    }

    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        T item = elems[--size];
        elems[size] = null; // evita memory leak
        if (size > 0 && size == elems.length / 4) resize(Math.max(1, elems.length / 2));
        return item;
    }

    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return elems[size - 1];
    }

    public boolean isEmpty() { return size == 0; }

    public int size() { return size; }

    public void clear() {
        Arrays.fill(elems, 0, size, null);
        size = 0;
    }

    private void resize(int newCapacity) {
        elems = Arrays.copyOf(elems, newCapacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack(size=").append(size).append(") [");
        for (int i = size - 1; i >= 0; i--) {
            sb.append(elems[i]);
            if (i > 0) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}