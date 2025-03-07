package Chap5;

public class StringBufferBuilderEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello World");
        sb.append("Java/Spring");
        sb.append("DBMS!");
        System.out.println(sb);

        sb.insert(1,"Hello!");
        System.out.println(sb);

        System.out.println(sb.substring(1,2));
    }
}
