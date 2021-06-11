package com.thilaka.mosh.java.fundamentals.part.one.b;

import java.util.Arrays;

public class K_Multi_Dimensional_Array {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];//2 rows and 3 column
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));//[[1, 0, 0], [0, 0, 0]]

        int[][][] numbers2 = new int[2][3][4];//2 height, 3 rows and 4 column
        numbers2[0][0][0] = 1;
        System.out.println(Arrays.deepToString(numbers2));//[[[1, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]], [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]]

        int [][] numbers3 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(numbers3));//[[1, 2, 3], [4, 5, 6]]
    }
}
