package main.practice.game_millioner;

import java.util.Scanner;

public class GameLogic {

    static void printingTheFirstQuestion() {
        System.out.println("""
                ВОПРОС №1
                Из какого цветка получают шафран — одну из самых дорогих пряностей?
                A - Matricaria
                B - Centaurea
                C - Crocus sativus
                D - Arctium
                """);
        System.out.print("Ваш ответ: ");
        String select = new Scanner(System.in).next().toUpperCase();

        if (select.equals("HELP")) {
            System.out.println("Выберите подсказку\n 50/50\n f - Звонок другу\n h - Помощь зала");
            selectClue();
        }
        switch (select) {
            case "A", "B", "D" -> {
                System.out.println("Ответ не верный! Правильный ответ \"С - Crocus sativus\" Вы проиграли!");
                GameMenu.gameMenu();
            }
            case "C" -> {
                System.out.println("Ииии это ВЕРНЫЙ ОТВЕТ! Поздравляем Вы заработали первую 1000 у.е. Напоминаем что это не сгораемая сумма! " +
                        "Переходим к следующему вопросу.");
                printSecondQuestion();
            }

        }
    }


    private static void printSecondQuestion() {
        System.out.println("""
                ВОПРОС №2
                В каком немецком городе родилась будущая императрица России Екатерина II?
                A - Штеттине
                B - Цербсте
                C - Кобленц
                D - Любек
                """);

        System.out.print("Ваш ответ: ");
        String select = new Scanner(System.in).next().toUpperCase();

        if (select.equals("HELP")) {
            System.out.println("Выберите подсказку\n 50/50\n f - Звонок другу\n h - Помощь зала");
            selectClue();
        }

        switch (select) {
            case "C", "B", "D" -> {
                System.out.println("Ответ не верный! Правильный ответ \"A - Штеттине\" Вы проиграли!" +
                        "Ваш выйгрыш составил 1000 у.е.");
                GameMenu.gameMenu();
            }
            case "A" -> {
                System.out.println("Ииии это ВЕРНЫЙ ОТВЕТ! Поздравляем Вы заработали 200 000 у.е." +
                        "Переходим к следующему вопросу.");
                printingTheThirdQuestion();
            }

        }
    }

    private static void printingTheThirdQuestion() {
        System.out.println("""
                ВОПРОС №3
                В какое созвездие входит звезда Шаула, название которой переводится как «поднятый хвост»?
                A - Андромеда
                B - Тельца
                C - Скорпион
                D - Большой Пёс
                """);

        System.out.print("Ваш ответ: ");
        String select = new Scanner(System.in).next().toUpperCase();

        if (select.equals("HELP")) {
            System.out.println("Выберите подсказку\n 50/50\n f - Звонок другу\n h - Помощь зала");
            selectClue();
        }

        switch (select) {
            case "A", "B", "D" -> {
                System.out.println("Ответ не верный! Правильный ответ \"C - Скорпион\" Вы проиграли!" +
                        "Ваш выйгрыш составил 1000 у.е.");
                GameMenu.gameMenu();
            }
            case "C" -> {
                System.out.println("Ииии это ВЕРНЫЙ ОТВЕТ! Поздравляем Вы заработали 400 000 у.е. Напоминаем что это не сгораемая сумма! " +
                        "Переходим к следующему вопросу. Дальше вопросы по сложнее *,*");
                printingTheFourthQuestion();
            }

        }

    }

    private static void printingTheFourthQuestion() {
        System.out.println("""
                ВОПРОС №4
                Как звали персонажа беспамятно влюбленную и желающую наследников от Айнц Оул Гоуна, в анимэ "Overlord"?
                A - Лакюс Альвейн Дейл Айндра
                B - Альбедо
                C - Солюшен
                D - Шаллти
                """);

        System.out.print("Ваш ответ: ");
        String select = new Scanner(System.in).next().toUpperCase();

        if (select.equals("HELP")) {
            System.out.println("Выберите подсказку\n 50/50\n f - Звонок другу\n h - Помощь зала");
            selectClue();
        }

        switch (select) {
            case "A", "C", "D" -> {
                System.out.println("Ответ не верный! Правильный ответ \"B - Альбедо\" Вы проиграли!" +
                        "\nВаш выйгрыш составил 400 000 у.е. И это впечатляющий результат! Увидимся в следующей игре!");
                GameMenu.gameMenu();
            }
            case "B" -> {
                System.out.println("ОТКУДА ВЫ УЗНАЛИ!!!!! ВЫ НАВЕРНОЕ ЗАЯДЛЫЙ АНИМЭШНИК?!?!?\n Поздравляем Вы заработали " +
                        "800 000 у.е.Переходим к следующему вопросу, последнему вопросу нашей викторины и Вашей мечте стать МИЛЛИОНЕРОМ!!!!");
                sealFifthQuestion();
            }

        }
    }

    private static void sealFifthQuestion() {
        System.out.println("""
                ВОПРОС №5
                Кто озвучивал в оригинале роль Иноске Хашибира в "Demon Slayer"?
                A - Ёсицугу Мацуока
                B - Хиро Симоно
                C - Тосихико Сэки
                D - Брайс Папенбрук
                """);

        System.out.print("Ваш ответ: ");
        String select = new Scanner(System.in).next().toUpperCase();
        if (select.equals("HELP")) {
            System.out.println("Подсказки запрещены");
            sealFifthQuestion();
        }
        switch (select) {
            case "A", "C", "D" -> {
                System.out.println("Ответ не верный! Правильный ответ \"B - Альбедо\" Вы проиграли!" +
                        "\nВаш выйгрыш составил 400 000 у.е. И это впечатляющий результат! Увидимся в следующей игре!");
                GameMenu.gameMenu();
            }
            case "B" -> {
                System.out.println("УРАААА!!! ВЫ ВЫЙГРАЛИ!!!! ВЫ МИЛЛИОНЕР!!!!" +
                        "\nСпасибо что приняли участие в нашей игре. Ждем вас снова!\n ======= GAME OVER ======");
                GameMenu.gameMenu();
            }

        }
    }

    public static String selectClue() {
        String selectHelp = new Scanner(System.in).next();
        if (selectHelp.equals("50/50") || selectHelp.equals("h") || selectHelp.equals("f")) {
            switch (selectHelp) {
                case "50/50" -> fiftyFifty();
                case "f" -> callAFriend();
                case "h" -> hallHelp();
            }
        } else {
            System.out.println("Неверный ввод, повторите команду");
            selectClue();
        }
        return selectHelp;
    }


    protected static void checkingForHints() {

        String selectReturn = selectClue();
        int check = 0;
        while (check == 0) {
            if (selectReturn.equals("50/50")) {
                System.out.println("Подсказка использована, вы не можете ее больше использовать");
                check++;
            } else if (selectReturn.equals("h")) {
                System.out.println("Подсказка использована, вы не можете ее больше использовать");
                check++;
            } else if (selectReturn.equals("f")) {
                System.out.println("Подсказка использована, вы не можете ее больше использовать");
                check++;
            }
        }
    }

    public static void fiftyFifty() {
        System.out.println("Сработал");

    }

    public static void callAFriend() {
        System.out.println("Сработал");

    }

    public static void hallHelp() {
        System.out.println("Сработал");

    }
}
