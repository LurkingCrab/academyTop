package main.homework.june_26_year_23;

import java.util.Arrays;

/**
 * ������� �������, ��������� 2 ������� � ���������� ����� ������. ���������� 2 �������
 * --������ ��� ������� � 1 ������, � ����� �������������
 */
public class UnionOfArrays {
    private static final int[] arr = new int[]{1, 4, 5, 7, 8, 12, 14, 15, 15, 15, 15, 900};
    private static final int[] arr2 = new int[]{-1, 0, 9, 9, 9, 9, 10, 15, 921};

    public static void main(String[] args) {
        System.out.printf(Arrays.toString(findNewArray(arr, arr2)));

    }

    public static int[] findNewArray(int[] arr, int[] arr2) {

        int[] newArray = new int[arr.length + arr2.length];
        int z = 0;
        for (int i = 0, j = 0; i < arr.length || j < arr2.length; ) {

            if (arr[i] > arr2[j]) {
                newArray[z++] = arr2[j];
                j++;
            } else {
                newArray[z++] = arr[i];
                i++;
            }

        }
        return newArray;
    }
}
