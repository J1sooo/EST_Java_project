package Chap10;

import Chap9.Account;

public class GenericMethodEx {
    public static void main(String[] args) {
        Box<String> result = Util.boxing("문자하나"); //box<String>
        System.out.println(result.getObject());

        Box<Account> result2 = Util.boxing(new Account(100000));
        System.out.println(result2.getObject());
    }
}
