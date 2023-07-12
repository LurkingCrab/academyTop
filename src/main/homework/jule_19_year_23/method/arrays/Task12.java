package main.homework.jule_19_year_23.method.arrays;

import static main.homework.jule_19_year_23.method.arrays.Task1And2.arr;

public class Task12 {

//    12)Вывести среднеарифметическое число

    public static void main(String[] args) {
        getAvg();
    }

    private static void getAvg() {
        int avg = 0;
        for (int element : arr) {
            avg += element;
        }
        avg /= arr.length;
        System.out.println(avg);
    }
}
