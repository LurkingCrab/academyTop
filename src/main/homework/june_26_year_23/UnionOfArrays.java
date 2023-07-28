package main.homework.june_26_year_23;

import java.util.Arrays;

/**
 * A function that takes 2 arrays and returns a new array. Merges 2 arrays
 * --You can not collect everything in 1 array, and then sort
 */
public class UnionOfArrays {
    private static int[] arr = new int[]{1, 4, 5, 7, 8, 12, 14, 15, 15, 15, 15, 900};
    private static int[] arr2 = new int[]{-1, 0, 9, 9, 9, 9, 10, 15, 921};

    public static void main(String[] args) {
        System.out.printf(Arrays.toString(findNewArray(arr, arr2)));

    }

    public static int[] findNewArray(int[] arr, int[] arr2) {
        int[] newArray = new int[arr.length + arr2.length];

        for (int i = 0, j = 0, z = 0; i < arr.length || j < arr2.length; ) {
            if (i < arr.length && j < arr2.length) {
                if (arr[i] <= arr2[j]) {
                    newArray[z++] = arr[i++];
                } else {
                    newArray[z++] = arr2[j++];
                }
            } else {
                newArray[z++] = arr2[j++];
            }
        }
        return newArray;
    }
}