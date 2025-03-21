package Quiz0320;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSortNotStream {
    public int[] solution(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        AscendingSortNotStream ascendingSortNotStream = new AscendingSortNotStream();
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