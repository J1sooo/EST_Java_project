package Chap6;

public class KoreaPeople {
//    final String nation = "Korea";
    final String nation;
    String name;

    KoreaPeople(String name) {
        this.name = name;

        nation = "Java World";
    }

    public static void main(String[] args) {
        KoreaPeople people = new KoreaPeople("김지수");
        System.out.println(people.name + people.nation);
    }
}
