package main.homework.jule_16_year_23.arrays;

import static main.homework.jule_16_year_23.arrays.Task1And2.arr;

public class Task12 {

//    12)Вывести среднеарифметическое число

    public static void main(String[] args) {
        int avg = 0;
        for (int element : arr) {
            avg += element;
        }
        avg /= arr.length;
        System.out.println(avg);
    }
}
