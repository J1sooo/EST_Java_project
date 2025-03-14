package Chap10.wildcard;

public class Worker extends Person{
    private String name;

    public Worker(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
