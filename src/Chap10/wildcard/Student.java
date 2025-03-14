package Chap10.wildcard;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return name;
    }
}
