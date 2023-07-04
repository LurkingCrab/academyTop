package main.homework.jule_16_year_23.arrays;

import static main.homework.jule_16_year_23.arrays.Task1And2.arr;

public class Task3And4 {

    //3)Вывести количество положительных
    //4)Вывести количество отрицательных
    public static void main(String[] args) {
        int numberOfNegativeNumbers = 0;
        int numberOfPositiveNumbers = 0;
        for (int i : arr) {
            if (i < 0) {
                numberOfNegativeNumbers++;
            } else {
                numberOfPositiveNumbers++;
            }
        }
        System.out.printf("Количество отрицательных чисел: %d\nКоличество положительных чисел: %d\n",
                numberOfNegativeNumbers, numberOfPositiveNumbers);
    }
}
