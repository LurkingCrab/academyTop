package main.practice.game_millioner;

import java.util.Scanner;

public class GameMenu {

    static Scanner sc = new Scanner(System.in);

    static void printingMessage() {
        System.out.print("Добро пожаловать в игру \"Кто хочет стать МИЛЛИОНЕРОМ\"\nПредставьтесь пожалуйста: ");
        String name = sc.nextLine();
        System.out.printf("Доброго времени %s! Рады видеть Вас в нашей игре!\n ", name);
    }



    static void gameMenu() throws InterruptedException {
        System.out.println("""
                 ========= КТО ХОЧЕТ СТАТЬ МИЛЛИОНЕРОМ ==========
                 1 - Начать игру
                 2 - Правила
                 e - Выйти из игры
                """);
        String num = sc.next();
        if (num.equals("1") || num.equals("2") || num.equals("e")) {
            switch (num) {
                case "1" -> {
                    System.out.println("ИИИИИ МЫ НАЧИАНЕМ!!!");
                    GameLogic.printingTheFirstQuestion();
                }
                case "2" -> printingRules();
                case "e" -> System.exit(0);

            }
        } else {
            System.out.println("Неверная команда, введите 1 или 0");
            gameMenu();
        }
    }

    static void printingRules() throws InterruptedException {
        System.out.println("""
                Правила  игры:
                В игре 5 вопросов. Каждый последующий вопрос будет немного сложнее предыдущего.
                Вопрос 1 - 1000 руб. Несгораемая сумма
                Вопрос 2 - 200 000 руб.
                Вопрос 3 - 400 000 руб.Несгораемая сумма.
                Вопрос 4 - 800 000 руб.\s
                Вопрос 5 - 1 000 000 руб. Использование подсказок не возможно, даже если они остались!
                Подсказки
                Участникам разрешается применить три подсказки, которые они могут использовать в любой момент викторины. КРОМЕ ПОСЛЕДНЕГО ВОПРОСА Каждая из подсказок может быть использована только один раз. Для вызова подсказки напишите "help" в поле выбора ответа

                50/50 - исключает два неправильных ответа из множественного выбора, оставляя участнику только один правильный и один неправильный вариант. Это означает, что у него есть шанс 50/50. Для активации введите 50/50

                Задать вопрос аудитории - залу задают тот же вопрос, что и участнику, и проводится быстрый опрос, чтобы показать их ответы. На диаграмме показывается явное преимущество определенного варианта, эта подсказка может быть чрезвычайно полезной. Участнику дается возможность согласиться с результатами, полученными от аудитории. Для активации введи "h"

                Позвоните другу - участникам разрешается сделать звонок другу  и спросить, знают ли они ответ на вопрос.Для активации введите "f"
                Для возврата в меню нажмите 0""");
        boolean flag = true;
        while (flag) {
            String returnMenu = sc.next();
            if (returnMenu.equals("0")) {
                flag = false;
                gameMenu();
            } else {
                System.out.println("Не верный ввод, повторите.");
            }
        }
    }

}
