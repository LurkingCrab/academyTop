package main.practice.game_millioner;


import java.util.*;

public class GameLogic {
    static Scanner sc = new Scanner(System.in);
    static String[] answer = new String[]{"A", "B", "C", "D"};
    static List<String> listOfAnswer = new ArrayList<>(List.of(answer));
    static String printMassage = "Ваш ответ: ";
    static int correctAnswer;
    static String alternativeResponse;

    static void printingTheFirstQuestion() {
        System.out.println("""
                ВОПРОС №1
                Из какого цветка получают шафран — одну из самых дорогих пряностей?
                A - Matricaria
                B - Centaurea
                C - Crocus sativus
                D - Arctium
                """);

        for (int index = 0; index < answer.length; index++) {
            if (answer[index].equalsIgnoreCase("c")) {
                correctAnswer = index;
            }
        }

        System.out.print(printMassage);
        String response = sc.next();

        if (checkForHelpCall(response)) {
            System.out.print(printMassage);
            alternativeResponse = sc.next();
            if (!alternativeResponse.equalsIgnoreCase("c")){
                System.out.println("Ответ не верный! Правильный ответ \"С - Crocus sativus\" Вы проиграли!");
                GameMenu.gameMenu();
            } else {
                System.out.println("Ииии это ВЕРНЫЙ ОТВЕТ! Поздравляем Вы заработали первую 1000 у.е. Напоминаем что это не сгораемая сумма! " +
                        "Переходим к следующему вопросу.");
                printSecondQuestion();
            }
        }
        if (!response.equalsIgnoreCase("c")) {
            System.out.println("Ответ не верный! Правильный ответ \"С - Crocus sativus\" Вы проиграли!");
            GameMenu.gameMenu();
        } else {
            System.out.println("Ииии это ВЕРНЫЙ ОТВЕТ! Поздравляем Вы заработали первую 1000 у.е. Напоминаем что это не сгораемая сумма! " +
                    "Переходим к следующему вопросу.");
            printSecondQuestion();
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
        String select = sc.next().toUpperCase();

        if (select.equals("HELP")) {
            System.out.println("Выберите подсказку\n 50/50\n f - Звонок другу\n h - Помощь зала");

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
//                printingTheThirdQuestion();
            }

        }
    }


//    private static void printingTheThirdQuestion() {
//        System.out.println("""
//                ВОПРОС №3
//                В какое созвездие входит звезда Шаула, название которой переводится как «поднятый хвост»?
//                A - Андромеда
//                B - Тельца
//                C - Скорпион
//                D - Большой Пёс
//                """);
//
//        System.out.print("Ваш ответ: ");
//        String select = sc.next().toUpperCase();
//
//        if (select.equals("HELP")) {
//            System.out.println("Выберите подсказку\n 50/50\n f - Звонок другу\n h - Помощь зала");
//            selectClue();
//        }
//
//        switch (select) {
//            case "A", "B", "D" -> {
//                System.out.println("Ответ не верный! Правильный ответ \"C - Скорпион\" Вы проиграли!" +
//                        "Ваш выйгрыш составил 1000 у.е.");
//                GameMenu.gameMenu();
//            }
//            case "C" -> {
//                System.out.println("Ииии это ВЕРНЫЙ ОТВЕТ! Поздравляем Вы заработали 400 000 у.е. Напоминаем что это не сгораемая сумма! " +
//                        "Переходим к следующему вопросу. Дальше вопросы по сложнее *,*");
//                printingTheFourthQuestion();
//            }
//
//        }
//
//    }

//    private static void printingTheFourthQuestion() {
//        System.out.println("""
//                ВОПРОС №4
//                Как звали персонажа беспамятно влюбленную и желающую наследников от Айнц Оул Гоуна, в анимэ "Overlord"?
//                A - Лакюс Альвейн Дейл Айндра
//                B - Альбедо
//                C - Солюшен
//                D - Шаллти
//                """);
//
//        System.out.print("Ваш ответ: ");
//        String select = sc.next().toUpperCase();
//
//        if (select.equals("HELP")) {
//            System.out.println("Выберите подсказку\n 50/50\n f - Звонок другу\n h - Помощь зала");
//            selectClue();
//        }
//
//        switch (select) {
//            case "A", "C", "D" -> {
//                System.out.println("Ответ не верный! Правильный ответ \"B - Альбедо\" Вы проиграли!" +
//                        "\nВаш выйгрыш составил 400 000 у.е. И это впечатляющий результат! Увидимся в следующей игре!");
//                GameMenu.gameMenu();
//            }
//            case "B" -> {
//                System.out.println("ОТКУДА ВЫ УЗНАЛИ!!!!! ВЫ НАВЕРНОЕ ЗАЯДЛЫЙ АНИМЭШНИК?!?!?\n Поздравляем Вы заработали " +
//                        "800 000 у.е.Переходим к следующему вопросу, последнему вопросу нашей викторины и Вашей мечте стать МИЛЛИОНЕРОМ!!!!");
//                sealFifthQuestion();
//            }
//
//        }
//    }

//    private static void sealFifthQuestion() {
//        System.out.println("""
//                ВОПРОС №5
//                Кто озвучивал в оригинале роль Иноске Хашибира в "Demon Slayer"?
//                A - Ёсицугу Мацуока
//                B - Хиро Симоно
//                C - Тосихико Сэки
//                D - Брайс Папенбрук
//                """);
//
//        System.out.print("Ваш ответ: ");
//        String select = sc.next().toUpperCase();
//        if (select.equals("HELP")) {
//            System.out.println("Подсказки запрещены");
//            sealFifthQuestion();
//        }
//        switch (select) {
//            case "A", "C", "D" -> {
//                System.out.println("Ответ не верный! Правильный ответ \"B - Альбедо\" Вы проиграли!" +
//                        "\nВаш выйгрыш составил 400 000 у.е. И это впечатляющий результат! Увидимся в следующей игре!");
//                GameMenu.gameMenu();
//            }
//            case "B" -> {
//                System.out.println("""
//                        УРАААА!!! ВЫ ВЫЙГРАЛИ!!!! ВЫ МИЛЛИОНЕР!!!!
//                        Спасибо что приняли участие в нашей игре. Ждем вас снова!
//                         ======= GAME OVER ======""");
//                GameMenu.gameMenu();
//            }
//
//        }
//    }
    public static String selectClue(String selectHelp) {

        if (selectHelp.equals("50/50") || selectHelp.equals("h") || selectHelp.equals("f")) {
            switch (selectHelp) {
                case "50/50" -> fiftyFifty(correctAnswer);
                case "f" -> callAFriend();
                case "h" -> hallHelp();
            }
        } else {
            System.out.println("Неверный ввод, повторите команду");
            selectClue(selectHelp);
        }
        checkingForHints(selectHelp);
        return selectHelp;
    }

    private static boolean checkForHelpCall(String response) {
        if (response.equalsIgnoreCase("help")) {
            System.out.println("Выберите подсказку\n 50/50\n f - Звонок другу\n h - Помощь зала");
            String clue = sc.next();
            selectClue(clue);
            System.out.println(listOfAnswer);
            return true;
        } else {
            return false;
        }
    }

    protected static void checkingForHints(String selectReturn) {
//   Исправить, не работает. 3 раза выводит сообщение об использовании. Создать массив или бул который будет исключать повторы
        int check = 0;
        while (check <= 3) {
            switch (selectReturn) {
                case "50/50", "h", "f" -> {
                    System.out.println("Подсказка использована, вы не можете ее больше использовать");
                    check++;
                }
            }
        }
    }

    public static List<String> fiftyFifty(int corAnsw) {
        System.out.println("Сработал");
        List<String> answ = listOfAnswer;
        do {
            int randomIndex = getRandomNumber();
            int baffer = getRandomNumber();
            if (randomIndex == baffer) {
                continue;
            } else if (answer[randomIndex].equalsIgnoreCase(answer[corAnsw])) {
                continue;
            }
            for (int arrayIndex = 0; arrayIndex < answ.size(); arrayIndex++) {
                if (randomIndex == arrayIndex) {
                    answ.remove(answer[arrayIndex]);
                    break;
                }
            }
        } while (answ.size() != 2);
        return answ;

    }

    private static int getRandomNumber() {
        return (int) (Math.random() * 5);
    }

    public static void callAFriend() {
        System.out.println("Сработал");

    }

    public static void hallHelp() {
        System.out.println("Сработал");

    }

}

