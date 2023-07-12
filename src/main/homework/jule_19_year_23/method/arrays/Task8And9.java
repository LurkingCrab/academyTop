package main.homework.jule_19_year_23.method.arrays;

import java.util.Arrays;
import java.util.Collections;

import static main.homework.jule_19_year_23.method.arrays.Task1And2.arr;

public class Task8And9 {
    //8)������� ����������� ��������
    //9)������� ������������ ��������
    public static void main(String[] args) {
        getMinMaxElementArrayVer01();

        getMinMaxElementArrayVer02();

        getMinMaxElementArrayVer03();
    }

    private static void getMinMaxElementArrayVer01() {
        int[] sortsArray = arr.clone();
        Arrays.sort(sortsArray);

        // �������� ��� �������� ������ ������� �������.
//            for (int i : arr){
//                System.out.println(i);
//            }

        System.out.printf("����������� ������� �������: %d\n������������ ������� �������: %d\n", sortsArray[0], sortsArray[sortsArray.length - 1]);
    }

    private static void getMinMaxElementArrayVer02() {
        int min = Collections.min(Arrays.stream(arr).boxed().toList());
        int max = Collections.max(Arrays.stream(arr).boxed().toList());
        System.out.printf("����������� ������� �������: %d\n������������ ������� �������: %d\n", min, max);
    }

    protected static void getMinMaxElementArrayVer03() {
        int minimum = arr[0];
        int maximum = arr.length - 1;
        for (int i : arr) {
            if (i < minimum) {
                minimum = i;
            } else if (i > maximum) {
                maximum = i;
            }
        }
        System.out.printf("����������� ������� �������: %d\n������������ ������� �������: %d\n", minimum, maximum);

    }
}

