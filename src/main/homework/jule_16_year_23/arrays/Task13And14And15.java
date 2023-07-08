package main.homework.jule_16_year_23.arrays;


import static main.homework.jule_16_year_23.arrays.Task1And2.arr;

//    protected static int[] arr = new int[]{10, 2, 233, 4, 185, -435, -5, 3990, -400, 5, 5397, 523, 5, -6, 7, 8, 9, -11};
public class Task13And14And15 {

//     13)Вывести количество двузначных чисел
//     14)Вывести количество трехзначных чисел
//     15)Вывести количество однозначных чисел

    public static void main(String[] args) {
        int numberOfSingleDigitElements = 0;
        int numberOfTwoDigitElements = 0;
        int numberOfThreeDigitElements = 0;
        for (int element : arr) {
            if (element <= -1 && element >= -9 || element >= 0 && element <= 9) {
                numberOfSingleDigitElements++;
//                System.out.println(element);
            } else if (element <= -10 && element >= -99 || element >= 10 && element <= 99) {
                numberOfTwoDigitElements++;
//                System.out.println(element);
            } else if (element <= -100 && element >= -999 || element >= 100 && element <= 999) {
                numberOfThreeDigitElements++;
//                System.out.println(element);
            }
        }
        System.out.printf("Количество однозначных элементов массива - %d\nКоличество двузначных элементов массива - %d\n" +
                "Количество трехзначных элементов массива - %d\n", numberOfSingleDigitElements, numberOfTwoDigitElements, numberOfThreeDigitElements);

    }
}
