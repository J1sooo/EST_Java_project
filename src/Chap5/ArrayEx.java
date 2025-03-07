package Chap5;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        String[] arr = new String[7];
        arr[0] = "mon";
        arr[1] = "tue";
        arr[2] = "wed";
        arr[3] = "thu";
        arr[4] = "fri";
        arr[5] = "sat";
        arr[6] = "sun";
        for (String str : arr){
            System.out.println(str);
        }
        System.out.println(arr[4]);
    }
}
