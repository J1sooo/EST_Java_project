package Chap5;

public class Quiz2 {
    public static void main(String[] args) {
        String str = "Hello Welcome Java";
        String[] arr = str.split(" ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
