package Chap11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx3 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));

        System.out.println("총 객체수: " + set.size());
    }
}
