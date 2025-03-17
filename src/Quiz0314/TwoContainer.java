package Quiz0314;

public class TwoContainer<T,E> {
    private T t;
    private E e;

    public T getKey() {
        return t;
    }

    public E getValue() {
        return e;
    }

    public void set(T t, E e) {
        this.t = t;
        this.e = e;
    }
}
