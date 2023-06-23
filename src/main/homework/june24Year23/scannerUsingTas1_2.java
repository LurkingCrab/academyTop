package main.homework.june24Year23;


import java.util.Scanner;

public class scannerUsingTas1_2 {
    private static final int YEAR = 2023;
    private static final double EURO_EXCHANGE_RATE = 0.92;


    public static void main(String[] args) {
        // 1. Запросите у пользователя его имя и выведите в ответ: «Привет, его имя!».
        isPrintAGreeting();

        //2. Запросите у пользователя год его рождения, посчитайте, сколько ему лет и выведите результат. Текущий год
        // укажите в коде как константу.
        isCalculatesAge();

        //3. Запросите у пользователя длину стороны квадрата и выведите периметр такого квадрата.
        isCalculatesThePerimeterOfASquare();

        //4. Запросите у пользователя радиус окружности и выведите площадь такой окружности.
        isCalculatesAreaOfACircle();

        //5. Запросите у пользователя расстояние в км между двумя городами и за сколько часов он хочет добраться.
        // Посчитайте скорость, с которой необходимо двигаться, чтобы успеть вовремя.
        isCalculatesSpeed();

        //6. Реализуйте конвертор валют. Пользователь вводит доллары, программа переводит в евро. Курс валюты храните в константе.
        isCurrencyConversion();
    }

    private static void isCurrencyConversion() {
        System.out.print("Конвертируем $ в €\n$ = ");
        double dollar = new Scanner(System.in).nextDouble();
        double convertation = dollar * EURO_EXCHANGE_RATE;
        System.out.printf("€ = %.2f", convertation);
    }

    private static void isCalculatesSpeed() {
        System.out.print("Введите данные:\nРасстояние между городами (км) = ");
        double distanceBetweenCities = new Scanner(System.in).nextDouble();
        System.out.print("За сколько часов вы хотите добраться? - ");
        int hour = new Scanner(System.in).nextInt();
        double yourSpeed = distanceBetweenCities / hour;
        System.out.printf("Вам надо ехать со скорость %.2f км\\ч что бы успеть во время\n", yourSpeed);
    }

    private static void isCalculatesAreaOfACircle() {
        System.out.println("Введите радиус окружности (принимаются как вещественные, используйте запятую, так и целые числа):");
        double radius = new Scanner(System.in).nextDouble();
        double areaOfACircle = Math.PI * (radius * radius);
        System.out.printf("Площадь круга равна %.2f\n", areaOfACircle);
    }

    private static void isCalculatesThePerimeterOfASquare() {
        System.out.println("Введите длину стороны квадрата (целое число):");
        int sideLengthOfASquare = new Scanner(System.in).nextInt();
        int perimeter = 4 * sideLengthOfASquare;
        System.out.printf("Периметр квадрата равен %s\n", perimeter);
    }

    private static void isCalculatesAge() {
        System.out.println("Введите год рождения:");
        int dateOfBirth = new Scanner(System.in).nextInt();
        int age = YEAR - dateOfBirth;
        System.out.printf("Ваш возраcт - %s\n", age);
    }

    private static void isPrintAGreeting() {
        System.out.println("Введите имя пользователя:");
        String name = new Scanner(System.in).next();
        System.out.printf("Привет, %s\n", name);
    }
}
