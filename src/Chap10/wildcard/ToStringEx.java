package Chap10.wildcard;

import Chap9.Account;

import java.util.Arrays;

public class ToStringEx {
    public static void main(String[] args) {
        int[] num = {4, 5, 6, 7, 8, 0};
        System.out.println(Arrays.toString(num));

        Account[] accounts = {new Account(3000), new Account(4000)};
        System.out.println(Arrays.toString(accounts));
    }
}
