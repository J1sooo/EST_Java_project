package Chap10;

import Chap9.Account;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("문자열1");
        list.add(1);
        String str = (String) list.get(0);
        String i1 = (String) list.get(1);

        List<String> list1 = new ArrayList<>();
        list1.add("문자열1");
        String str1 = list1.getFirst();
    }
}
