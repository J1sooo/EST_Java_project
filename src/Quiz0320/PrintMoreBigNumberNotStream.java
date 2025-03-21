package Quiz0320;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintMoreBigNumberNotStream {
    public List<Integer> solution(int n, int[] array) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i == 0 || array[i] > array[i - 1]) answer.add(array[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        PrintMoreBigNumberNotStream printMoreBigNumberStream = new PrintMoreBigNumberNotStream();
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