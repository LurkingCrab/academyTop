package main.homework.jule_18_year_23.method.arrays;

import static main.homework.jule_18_year_23.method.arrays.Task1And2.arr;

public class Task5And6And7 {
    //    5)������� ����� ���� �����
//    6)������� ����� ���� ������ �����
//    7)������� ����� ���� �������� �����
    public static void main(String[] args) {
        geySumEvenOdd();
    }

    private static void geySumEvenOdd() {
        int sum = 0;
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;
        for (int i : arr) {
            sum += i;
            if (i % 2 == 0){
                sumOfEvenNumbers += i;
            }else {
                sumOfOddNumbers += i;
            }
        }
        System.out.printf("����� ���� �����: %d\n����� ���� ������ �����: %d\n����� �� ������ �����: %d\n", sum, sumOfEvenNumbers, sumOfOddNumbers);
    }
}
