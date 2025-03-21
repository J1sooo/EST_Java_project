package Quiz0320;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AscendingSortStream {
    public int[] solution(int[] array1, int[] array2) {
        return IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .sorted()
                .toArray();
    }

    public static void main(String[] args) {
        AscendingSortStream ascendingSortNotStream = new AscendingSortStream();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        int number2 = scanner.nextInt();
        int[] array2 = new int[number2];

        for (int i = 0; i < number2; i++) {
            array2[i] = scanner.nextInt();
        }

        for (int x : ascendingSortNotStream.solution(array, array2)) {
            System.out.print(x + " ");
        }
    }
}