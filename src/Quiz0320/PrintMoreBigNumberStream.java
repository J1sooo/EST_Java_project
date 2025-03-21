package Quiz0320;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PrintMoreBigNumberStream {
    public List<Integer> solution(int n, int[] array) {
        return IntStream.range(0, n)
                .filter(i -> i == 0 || array[i] > array[i - 1])
                .mapToObj(i -> array[i])
                .toList();
    }

    public static void main(String[] args) {
        PrintMoreBigNumberStream printMoreBigNumberStream = new PrintMoreBigNumberStream();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        for (int x : printMoreBigNumberStream.solution(number, array)) {
            System.out.print(x + " ");
        }
    }
}