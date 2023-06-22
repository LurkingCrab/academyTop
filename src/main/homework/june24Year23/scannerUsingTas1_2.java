package main.homework.june24Year23;


import java.util.Scanner;

public class scannerUsingTas1_2 {
    private static final int YEAR = 2023;

    public static void main(String[] args) {
        // 1. Запросите у пользователя его имя и выведите в ответ: «Привет, его имя!».
        System.out.println("Введите имя пользователя");
        String name = new Scanner(System.in).next();
        System.out.printf("Привет, %s\n", name);

        //2. Запросите у пользователя год его рождения, посчитайте, сколько ему лет и выведите результат. Текущий год
        // укажите в коде как константу.
        System.out.println("Введите год рождения");
        int dateOfBirth = new Scanner(System.in).nextInt();
        int age = YEAR - dateOfBirth;
        System.out.printf("Ваш возвраcт - %s\n", age);

    }
}
