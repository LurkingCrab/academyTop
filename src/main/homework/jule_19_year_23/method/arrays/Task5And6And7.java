package main.homework.jule_19_year_23.method.arrays;

import static main.homework.jule_19_year_23.method.arrays.Task1And2.arr;

public class Task5And6And7 {
    //    5)Âûâåñòè ñóììó âñåõ ÷èñåë
//    6)Âûâåñòè ñóììó âñåõ ÷åòíûõ ÷èñåë
//    7)Âûâåñòè ñóììó âñåõ íå÷åòíûõ ÷èñåë
    public static void main(String[] args) {
        getSumEvenOdd();
    }

    private static void getSumEvenOdd() {
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
        System.out.printf("Ñóììà âñåõ ÷èñåë: %d\nÑóììà âñåõ ÷åòíûõ ÷èñåë: %d\nÑóììà íå ÷åòíûõ ÷èñåë: %d\n", sum, sumOfEvenNumbers, sumOfOddNumbers);
    }
}
