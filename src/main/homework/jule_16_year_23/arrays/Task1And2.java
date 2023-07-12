package main.homework.jule_16_year_23.arrays;

// 1)Вывести количество четных
// 2)Вывести количество нечетных
public class Task1And2 {
    public static int[] arr = new int[]{10, 2, 233, 4, 185, -435, -5, 3990, -400, 5, 5397, 523, 5, -6, 7, 8, 9, -11};

    public static void main(String[] args) {
        int evenNumbers = 0;
        int oddNumbers = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }
        System.out.printf("Количество четных чисел: %d\nКоличество нечетных чисел: %d\n", evenNumbers, oddNumbers);
    }
}
