package Chap12.methoderferance;

public class Member {
    private String id;
    private String name;

    public Member() {

    }

    public Member(String id) {
        this.id = id;
    }

    public Member(String name, String id) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
