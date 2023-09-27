package main.practice.game_millioner;


import java.util.*;

public class GameLogic {
    static Scanner sc = new Scanner(System.in);
    static String[] answer = new String[]{"A", "B", "C", "D"};
    static List<String> listOfAnswer = new ArrayList<>(List.of(answer));
    static String printMassage = "Ваш ответ: ";
    static int correctAnswer;
    static String alternativeResponse;
    static boolean checkOfUse = true;

    static void printingTheFirstQuestion() throws InterruptedException {
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

        System.out.println(printMassage);
        String response = sc.next();

        boolean flagForWhile = false;
        if (checkForHelpCall(response)) {
            while (!flagForWhile) {
                System.out.println(printMassage);
                alternativeResponse = sc.next();
                while (!flagForWhile) {
                    if (alternativeResponse.equalsIgnoreCase("a") || alternativeResponse.equalsIgnoreCase("b") || alternativeResponse.equalsIgnoreCase("c")) {
                        if (alternativeResponse.equalsIgnoreCase(response)) {
                            checkForHelpCall(response);
                        } else if (!alternativeResponse.equalsIgnoreCase("c")) {
                            System.out.println("Ответ не верный! Правильный ответ \"С - Crocus sativus\" Вы проиграли!");
                            System.exit(0);
                        } else {
                            System.out.println("Ииии это ВЕРНЫЙ ОТВЕТ! Поздравляем Вы заработали первую 1000 у.е. Напоминаем что это не сгораемая сумма! " +
                                    "Переходим к следующему вопросу.");
                            flagForWhile = true;
                        }
                    } else {
                        System.out.println("Не верный ввод, попробуйте еще раз");
                        alternativeResponse = sc.next();
                    }
                }

            }
            listOfAnswer = new ArrayList<>(List.of(answer));
            printSecondQuestion();
        }

        while (!flagForWhile) {
            if (response.equalsIgnoreCase("a") || response.equalsIgnoreCase("b") || response.equalsIgnoreCase("c")) {
                if (!response.equalsIgnoreCase("c")) {
                    System.out.println("Ответ не верный! Правильный ответ \"С - Crocus sativus\" Вы проиграли!");
                    System.exit(0);
                } else {
                    System.out.println("Ииии это ВЕРНЫЙ ОТВЕТ! Поздравляем Вы заработали первую 1000 у.е. Напоминаем что это не сгораемая сумма! " +
                            "Переходим к следующему вопросу.");
                    printSecondQuestion();
                    flagForWhile = true;
                }
            } else {
                System.out.println("Не верный ввод, попробуйте еще раз");
                response = sc.next();
            }
            listOfAnswer = new ArrayList<>(List.of(answer));
        }

    }

    private static void printSecondQuestion() throws InterruptedException {
        System.out.println("""
                ВОПРОС №2
                В каком немецком городе родилась будущая императрица России Екатерина II?
                A - Штеттине
                B - Цербсте
                C - Кобленц
                D - Любек
                """);

        for (int index = 0; index < answer.length; index++) {
            if (answer[index].equalsIgnoreCase("a")) {
                correctAnswer = index;
            }
        }

        System.out.print(printMassage);
        String response = sc.next();
        boolean flagForWhile = false;

        if (checkForHelpCall(response)) {
            while (!flagForWhile) {
                System.out.println(printMassage);
                alternativeResponse = sc.next();
                while (!flagForWhile) {
                    if (alternativeResponse.equalsIgnoreCase("a") || alternativeResponse.equalsIgnoreCase("b") || alternativeResponse.equalsIgnoreCase("c")) {
                        if (!alternativeResponse.equalsIgnoreCase("a")) {
                            System.out.println("Ответ не верный! Правильный ответ \\\"A - Штеттине\\\" Вы проиграли!\" +\n" +
                                    "\"Ваш выйгрыш составил 1000 у.е.");
                            System.exit(0);
                        } else {
                            System.out.println("Ииии это ВЕРНЫЙ ОТВЕТ! Поздравляем Вы заработали 200 000 у.е." +
                                    "Переходим к следующему вопросу.");
                            flagForWhile = true;
                        }
                    } else {
                        System.out.println("Не верный ввод, попробуйте еще раз");
                        alternativeResponse = sc.next();
                    }
                }
            }
            listOfAnswer = new ArrayList<>(List.of(answer));
            printingTheThirdQuestion();
        }

        while (!flagForWhile) {
            if (response.equalsIgnoreCase("a") || response.equalsIgnoreCase("b") || response.equalsIgnoreCase("c")) {
                if (!response.equalsIgnoreCase("a")) {
                    System.out.println("Ответ не верный! Правильный ответ \\\"A - Штеттине\\\" Вы проиграли!\" +\n" +
                            "\"Ваш выйгрыш составил 1000 у.е.");
                    System.exit(0);
                } else {
                    System.out.println("Ииии это ВЕРНЫЙ ОТВЕТ! Поздравляем Вы заработали 200 000 у.е." +
                            "Переходим к следующему вопросу.");
                    flagForWhile = true;
                    printingTheThirdQuestion();
                }
            } else {
                System.out.println("Не верный ввод, попробуйте еще раз");
                response = sc.next();
            }
            listOfAnswer = new ArrayList<>(List.of(answer));
        }
    }


    private static void printingTheThirdQuestion() throws InterruptedException {
        System.out.println("""
                ВОПРОС №3
                В какое созвездие входит звезда Шаула, название которой переводится как «поднятый хвост»?
                A - Андромеда
                B - Тельца
                C - Скорпион
                D - Большой Пёс
                """);


        for (int index = 0; index < answer.length; index++) {
            if (answer[index].equalsIgnoreCase("a")) {
                correctAnswer = index;
            }
        }

        System.out.println(printMassage);
        String response = sc.next();
        boolean flagForWhile = false;

        if (checkForHelpCall(response)) {
            while (!flagForWhile) {
                while (!flagForWhile) {
                    System.out.println(printMassage);
                    alternativeResponse = sc.next();
                    if (alternativeResponse.equalsIgnoreCase("a") || alternativeResponse.equalsIgnoreCase("b") || alternativeResponse.equalsIgnoreCase("c")) {
                        if (!alternativeResponse.equalsIgnoreCase("c")) {
                            System.out.println("Ответ не верный! Правильный ответ \"C - Скорпион\" Вы проиграли!" +
                                    "Ваш выйгрыш составил 1000 у.е.");
                            System.exit(0);
                        } else {
                            System.out.println("Ииии это ВЕРНЫЙ ОТВЕТ! Поздравляем Вы заработали 400 000 у.е. Напоминаем что это не сгораемая сумма! " +
                                    "Переходим к следующему вопросу. Дальше вопросы по сложнее *,*");
                            flagForWhile = true;
                        }
                    } else {
                        System.out.println("Не верный ввод, попробуйте еще раз");
                        alternativeResponse = sc.next();
                    }
                }
            }
            listOfAnswer = new ArrayList<>(List.of(answer));
            printingTheFirstQuestion();
        }

        while (!flagForWhile) {
            if (response.equalsIgnoreCase("a") || response.equalsIgnoreCase("b") || response.equalsIgnoreCase("c")) {
                if (!response.equalsIgnoreCase("c")) {
                    System.out.println("Ответ не верный! Правильный ответ \"C - Скорпион\" Вы проиграли!" +
                            "Ваш выйгрыш составил 1000 у.е.");
                    System.exit(0);
                } else {
                    System.out.println("Ииии это ВЕРНЫЙ ОТВЕТ! Поздравляем Вы заработали 400 000 у.е. Напоминаем что это не сгораемая сумма! " +
                            "Переходим к следующему вопросу. Дальше вопросы по сложнее *,*");
                    flagForWhile = true;
                    printingTheFourthQuestion();
                }
            } else {
                System.out.println("Не верный ввод, попробуйте еще раз");
                response = sc.next();
            }
            listOfAnswer = new ArrayList<>(List.of(answer));
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

        for (int index = 0; index < answer.length; index++) {
            if (answer[index].equalsIgnoreCase("a")) {
                correctAnswer = index;
            }
        }

        System.out.print(printMassage);
        String response = sc.next();
        boolean flagForWhile = false;

        if (checkForHelpCall(response)) {
            while (!flagForWhile) {
                System.out.println(printMassage);
                alternativeResponse = sc.next();
                while (!flagForWhile) {
                    if (alternativeResponse.equalsIgnoreCase("a") || alternativeResponse.equalsIgnoreCase("b") || alternativeResponse.equalsIgnoreCase("c")) {
                        if (!alternativeResponse.equalsIgnoreCase("b")) {
                            System.out.println("Ответ не верный! Правильный ответ \"B - Альбедо\" Вы проиграли!" +
                                    "\nВаш выйгрыш составил 400 000 у.е. И это впечатляющий результат! Увидимся в следующей игре!");
                            System.exit(0);
                        } else {
                            System.out.println("ОТКУДА ВЫ УЗНАЛИ!!!!! ВЫ НАВЕРНОЕ ЗАЯДЛЫЙ АНИМЭШНИК?!?!?\n Поздравляем Вы заработали " +
                                    "800 000 у.е.Переходим к следующему вопросу, последнему вопросу нашей викторины и Вашей мечте стать МИЛЛИОНЕРОМ!!!!");
                            flagForWhile = true;
                        }
                    } else {
                        System.out.println("Не верный ввод, попробуйте еще раз");
                        alternativeResponse = sc.next();
                    }
                }
            }
            listOfAnswer = new ArrayList<>(List.of(answer));
            sealFifthQuestion();
        }

        while (!flagForWhile) {
            if (response.equalsIgnoreCase("a") || response.equalsIgnoreCase("b") || response.equalsIgnoreCase("c")) {
                if (!response.equalsIgnoreCase("b")) {
                    System.out.println("Ответ не верный! Правильный ответ \"B - Альбедо\" Вы проиграли!" +
                            "\nВаш выйгрыш составил 400 000 у.е. И это впечатляющий результат! Увидимся в следующей игре!");
                    System.exit(0);
                } else {
                    System.out.println("ОТКУДА ВЫ УЗНАЛИ!!!!! ВЫ НАВЕРНОЕ ЗАЯДЛЫЙ АНИМЭШНИК?!?!?\n Поздравляем Вы заработали " +
                            "800 000 у.е.Переходим к следующему вопросу, последнему вопросу нашей викторины и Вашей мечте стать МИЛЛИОНЕРОМ!!!!");
                    flagForWhile = true;
                    sealFifthQuestion();
                }
            } else {
                System.out.println("Не верный ввод, попробуйте еще раз");
                response = sc.next();
            }
            listOfAnswer = new ArrayList<>(List.of(answer));
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

        for (int index = 0; index < answer.length; index++) {
            if (answer[index].equalsIgnoreCase("a")) {
                correctAnswer = index;
            }
        }

        System.out.print(printMassage);
        String response = sc.next();
        boolean flagForWhile = false;

        if (response.equalsIgnoreCase("help")) {
            System.out.println("В данном вопросе подсказки не доступны");
            System.out.print(printMassage);
            response = sc.next();
        }

        while (!flagForWhile){
            if (response.equalsIgnoreCase("a") || response.equalsIgnoreCase("b") || response.equalsIgnoreCase("c")){
                if (!response.equalsIgnoreCase("a")) {
                    System.out.println("Ответ не верный! Правильный ответ \"A - Ёсицугу Мацуока\" Вы проиграли!" +
                            "\nВаш выйгрыш составил 400 000 у.е. И это впечатляющий результат! Увидимся в следующей игре!");
                    System.exit(0);
                } else {
                    System.out.println("""
                    УРАААА!!! ВЫ ВЫЙГРАЛИ!!!! ВЫ МИЛЛИОНЕР!!!!
                    Спасибо что приняли участие в нашей игре. Ждем вас снова!
                     ======= GAME OVER ======""");
                    flagForWhile = true;
                    System.exit(0);
                }
            }else {
                System.out.println("Не верный ввод, попробуйте еще раз");
                response = sc.next();
            }
        }
    }

    private static boolean checkForHelpCall(String response) {
        if (response.equalsIgnoreCase("help")) {
            System.out.println("Выберите подсказку\n 50/50\n f - Звонок другу\n h - Помощь зала");
            String clue = sc.next();
            selectClue(clue);
            return true;
        } else {
            return false;
        }
    }

    public static void selectClue(String selectHelp) {
        boolean flag = true;
        while (flag) {
            if (selectHelp.equals("50/50") || selectHelp.equals("h") || selectHelp.equals("f")) {
                if (checkingForHints(selectHelp)) {
                    switch (selectHelp) {
                        case "50/50" -> fiftyFifty(correctAnswer);
                        case "f" -> callAFriend();
                        case "h" -> hallHelp();
                    }
                } else {
                    System.out.println("потрачено");
                }
                flag = false;
            } else {
                System.out.println("Неверный ввод, повторите команду");
                selectHelp = sc.next();
            }
        }
    }

    protected static boolean checkingForHints(String selectReturn) {
        if (selectReturn.equalsIgnoreCase("50/50") & checkOfUse) {
            return true;
        } else if (selectReturn.equalsIgnoreCase("h") & checkOfUse) {
            return true;
        } else if (selectReturn.equalsIgnoreCase("f") & checkOfUse) {
            return true;
        }
        return false;
    }

    public static void fiftyFifty(int corAnsw) {
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
        System.out.println(listOfAnswer);
        checkOfUse = false;

    }

    public static void callAFriend() {
        System.out.println("Звоним другу...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            System.out.println("error Thread");
        }
        int randomIndex = getRandomNumber();
        for (int arrayIndex = 0; arrayIndex < answer.length; arrayIndex++) {
            if (randomIndex == arrayIndex) {
                answer[randomIndex] = answer[arrayIndex];
                System.out.printf("Я думаю это ответ - %s\n", answer[randomIndex]);
                break;
            }
        }
        checkOfUse = false;

    }

    public static void hallHelp() {
        System.out.println("Уважаемые знатоки просим вас проголосовать!");
        try {
            Thread.sleep(1900);
        } catch (InterruptedException ex) {
            System.out.println("error Thread");
        }
        String[] audienceResponses = new String[]{"A", "B", "C", "D"};
        for (String audienceRespons : audienceResponses) {
            System.out.printf("%s - %d %%\n", audienceRespons, getARandomPercentage());
        }
        checkOfUse = false;

    }

    private static int getRandomNumber() {
        return (int) (Math.random() * 4);
    }

    private static int getARandomPercentage() {
        return (int) (Math.random() * 100);
    }

}

