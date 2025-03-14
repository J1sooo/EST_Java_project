package Chap10.wildcard;

public class HightStudent extends Student{
    private String name;

    public HightStudent(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
