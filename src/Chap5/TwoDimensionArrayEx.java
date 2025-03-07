package Chap5;

import java.util.Arrays;

public class TwoDimensionArrayEx {
    public static void main(String[] args) {
        int[][] arrays = new int[2][3];
//        arrays = new int[][]{{1, 2}, {3, 4}, {5, 6}};

        arrays[0][0] = 1;
        arrays[0][1] = 2;
        arrays[0][2] = 3;
        arrays[1][0] = 4;
        arrays[1][1] = 5;
        arrays[1][2] = 6;
        System.out.println(Arrays.deepToString(arrays));
    }
}
