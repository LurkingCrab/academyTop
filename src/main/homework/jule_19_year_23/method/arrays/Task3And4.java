package main.homework.jule_19_year_23.method.arrays;

import static main.homework.jule_19_year_23.method.arrays.Task1And2.arr;

public class Task3And4 {

    //3)������� ���������� �������������
    //4)������� ���������� �������������
    public static void main(String[] args) {
        getNegativePositiveNum();
    }

    private static void getNegativePositiveNum() {
        int numberOfNegativeNumbers = 0;
        int numberOfPositiveNumbers = 0;
        for (int i : arr) {
            if (i < 0) {
                numberOfNegativeNumbers++;
            } else {
                numberOfPositiveNumbers++;
            }
        }
        System.out.printf("���������� ������������� �����: %d\n���������� ������������� �����: %d\n",
                numberOfNegativeNumbers, numberOfPositiveNumbers);
    }
}
