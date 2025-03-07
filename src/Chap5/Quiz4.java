
package Chap5;

public class Quiz4 {
    public static void main(String[] args) {
        String str = "aaabbccd";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i==0) {
                System.out.print(str.charAt(i));
            } else if (str.charAt(i-1) == str.charAt(i)) {
                count++;
            } else if (str.charAt(i-1) != str.charAt(i)) {
                System.out.print(count);
                count = 1;
                System.out.print(str.charAt(i));
            }

        }
    }
}
