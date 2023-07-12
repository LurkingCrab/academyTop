package main.homework.jule_16_year_23.console_game.for_user;

//Написать мини программу, где пользователь находит рандомное число

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameRun {
    public static void main(String[] args) {
        printGreeting();
        isProgramLogic();
    }

    private static void printGreeting() {
        System.out.print("Ваше имя - ");
        String userName = new Scanner(System.in).next();
        System.out.printf("""
                ========"Угадай число"========
                Добро пожаловать %s!
                Правила игры просты - я загадал число от 0 до 10. Ты должен его отгадать, у тебя 3 попытки.
                Удачи =)""", userName);
    }

    private static void isProgramLogic() {
        int randomNumber, userNumber;

        randomNumber = (int) Math.floor(Math.random() * 10);
        for (int iteration = 1; iteration < 4; iteration++) {
            System.out.printf("\nПопытка №%d\n", iteration);
            System.out.print("Введи число которое считаешь верным: ");
            try {
                userNumber = new Scanner(System.in).nextInt();
                if (userNumber > 10 || userNumber < 0) {
                    System.out.println("Ой, нееет! Не надо так делать, я ведь загадал от 0 до 10. Попробуй еще раз.");
                } else if (userNumber > randomNumber) {
                    System.out.println("Хорошая попытка, но нет, мое число меньше твоего");
                } else if (userNumber < randomNumber) {
                    System.out.println("Упс, нет, не то XD Мое число больше твоего");
                } else {
                    System.out.println("Супер! Сегодня удача на твоей стороне! Ты угадал!");
                }
            } catch (InputMismatchException err) {
                System.out.println("Вводить следует только цифры");
            }
            if (iteration == 3) {
                System.out.printf("====GAME OVER====\nЗагаданное число было - %d", randomNumber);
                break;
            }
        }


    }
}

