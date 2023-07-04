package main.homework.jule_16_year_23.arrays;

import static main.homework.jule_16_year_23.arrays.Task1And2.arr;

public class Task5And6And7 {
    //    5)Вывести сумму всех чисел
//    6)Вывести сумму всех четных чисел
//    7)Вывести сумму всех нечетных чисел
    public static void main(String[] args) {
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
        System.out.printf("Сумма всех чисел: %d\nСумма всех четных чисел: %d\nСумма не четных чисел: %d\n", sum, sumOfEvenNumbers, sumOfOddNumbers);
    }
}
