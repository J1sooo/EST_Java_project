package Chap7;

public class Animal {
    String name;

    Animal(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println(name + " Zzz...");
    }

}
