package Chap10.wildcard;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return name;
    }
}
