package main.homework.jule_16_year_23.arrays;

import static main.homework.jule_16_year_23.arrays.Task1And2.arr;

public class Task10And11 {

    //10)������� ������ ������������ ��������
    //11)������� ������ ������������� ��������

    public static void main(String[] args) {
        int indexCurrentMin = 0;
        int indexCurrentMax = 0;
        int minimum = arr[0];
        int maximum = arr.length-1;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] < minimum) {
                minimum = arr[j];
                indexCurrentMin = j;
            } else if (arr[j] > maximum) {
                maximum = arr[j];
                indexCurrentMax = j;
            }
        }
        System.out.printf("������ ������������ �������� �������: %d\n������ ������������� �������� �������: %d\n",
                indexCurrentMin, indexCurrentMax);
    }
}
