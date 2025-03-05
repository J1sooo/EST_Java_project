package Chap2;

// 오토박싱, 언박싱

import java.util.ArrayList;

public class AutoBoxingEx {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println("ArrayList: " + String.valueOf(arrayList));

        // 언박싱
        Integer integerNum = 20;
        int index = integerNum;
        System.out.println(index);
    }
}
