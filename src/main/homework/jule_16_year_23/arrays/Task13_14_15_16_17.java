package main.homework.jule_16_year_23.arrays;


import static main.homework.jule_16_year_23.arrays.Task1And2.arr;

//    protected static int[] arr = new int[]{10, 2, 233, 4, 185, -435, -5, 3990, -400, 5, 5397, 523, 5, -6, 7, 8, 9, -11};
public class Task13_14_15_16_17 {

//     13)������� ���������� ���������� �����
//     14)������� ���������� ����������� �����
//     15)������� ���������� ����������� �����
//     16)������� ����� ���� ����������� ������ �����
//     17)������� ����� ���� ���������� ������ �����

    public static void main(String[] args) {
        int sumOfSingleDigitElements = 0;
        int sumOfTwoDigitElements = 0;
        int numberOfSingleDigitElements = 0;
        int numberOfTwoDigitElements = 0;
        int numberOfThreeDigitElements = 0;
        for (int element : arr) {
            if (element <= -1 && element >= -9 || element >= 0 && element <= 9) {
                numberOfSingleDigitElements++;
                sumOfSingleDigitElements+=element;
//                System.out.println(element);
            } else if (element <= -10 && element >= -99 || element >= 10 && element <= 99) {
                numberOfTwoDigitElements++;
                sumOfTwoDigitElements += element;
//                System.out.println(element);
            } else if (element <= -100 && element >= -999 || element >= 100 && element <= 999) {
                numberOfThreeDigitElements++;
//                System.out.println(element);
            }
        }
        System.out.printf("""
                ���������� ����������� ��������� ������� - %d
                ���������� ���������� ��������� ������� - %d
                ���������� ����������� ��������� ������� - %d
                """, numberOfSingleDigitElements, numberOfTwoDigitElements, numberOfThreeDigitElements);
        System.out.printf("����� ����������� ��������� ������� - %d\n����� ����������� ��������� ������� - %d\n", sumOfSingleDigitElements, sumOfTwoDigitElements);

    }
}
