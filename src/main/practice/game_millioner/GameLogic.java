package main.practice.game_millioner;


import java.util.*;

public class GameLogic {
    static Scanner sc = new Scanner(System.in);
    static String[] answer = new String[]{"A", "B", "C", "D"};
    static List<String> listOfAnswer = new ArrayList<>(List.of(answer));
    static String printMassage = "��� �����: ";
    static int correctAnswer;
    static String alternativeResponse;
    static boolean checkOfUse = true;

    static void printingTheFirstQuestion() throws InterruptedException {
        System.out.println("""
                ������ �1
                �� ������ ������ �������� ������ � ���� �� ����� ������� ���������?
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
//        List<String> questionOne = listOfAnswer;

        System.out.println(printMassage);
        String response = sc.next();

        if (checkForHelpCall(response)) {
//            System.out.println("\n" + questionOne);
            boolean flagForWhile = false;
            while (!flagForWhile) {
                System.out.println(printMassage);
                alternativeResponse = sc.next();
                if (alternativeResponse.equalsIgnoreCase(response)) {
                    checkForHelpCall(response);
                } else if (!alternativeResponse.equalsIgnoreCase("c")) {
                    System.out.println("����� �� ������! ���������� ����� \"� - Crocus sativus\" �� ���������!");
                    System.exit(0);
                } else {
                    System.out.println("���� ��� ������ �����! ����������� �� ���������� ������ 1000 �.�. ���������� ��� ��� �� ��������� �����! " +
                            "��������� � ���������� �������.");
                    flagForWhile = true;
                }
            }
            listOfAnswer = new ArrayList<>(List.of(answer));
            printSecondQuestion();
        }


        if (!response.equalsIgnoreCase("c")) {
            System.out.println("����� �� ������! ���������� ����� \"� - Crocus sativus\" �� ���������!");
            System.exit(0);
        } else {
            System.out.println("���� ��� ������ �����! ����������� �� ���������� ������ 1000 �.�. ���������� ��� ��� �� ��������� �����! " +
                    "��������� � ���������� �������.");
            listOfAnswer = new ArrayList<>(List.of(answer));
            printSecondQuestion();
        }

    }


    private static void printSecondQuestion() throws InterruptedException {
        System.out.println("""
                ������ �2
                � ����� �������� ������ �������� ������� ����������� ������ ��������� II?
                A - ��������
                B - �������
                C - �������
                D - �����
                """);

        for (int index = 0; index < answer.length; index++) {
            if (answer[index].equalsIgnoreCase("a")) {
                correctAnswer = index;
            }
        }

        System.out.print(printMassage);
        String response = sc.next();

        if (checkForHelpCall(response)) {
            boolean flagForWhile = false;
            while (!flagForWhile) {
                System.out.println(printMassage);
                alternativeResponse = sc.next();
                if (!alternativeResponse.equalsIgnoreCase("a")) {
                    System.out.println("����� �� ������! ���������� ����� \\\"A - ��������\\\" �� ���������!\" +\n" +
                            "\"��� ������� �������� 1000 �.�.");
                    System.exit(0);
                } else {
                    System.out.println("���� ��� ������ �����! ����������� �� ���������� 200 000 �.�." +
                            "��������� � ���������� �������.");
                    flagForWhile = true;
                }
            }
            listOfAnswer = new ArrayList<>(List.of(answer));
            printingTheThirdQuestion();
        }
        if (!response.equalsIgnoreCase("a")) {
            System.out.println("����� �� ������! ���������� ����� \\\"A - ��������\\\" �� ���������!\" +\n" +
                    "\"��� ������� �������� 1000 �.�.");
            System.exit(0);
        } else {
            System.out.println("���� ��� ������ �����! ����������� �� ���������� 200 000 �.�." +
                    "��������� � ���������� �������.");
            listOfAnswer = new ArrayList<>(List.of(answer));
            printingTheThirdQuestion();
        }
    }


    private static void printingTheThirdQuestion() throws InterruptedException {
        System.out.println("""
                ������ �3
                � ����� ��������� ������ ������ �����, �������� ������� ����������� ��� ��������� �����?
                A - ���������
                B - ������
                C - ��������
                D - ������� ϸ�
                """);


        for (int index = 0; index < answer.length; index++) {
            if (answer[index].equalsIgnoreCase("a")) {
                correctAnswer = index;
            }
        }

        System.out.println(printMassage);
        String response = sc.next();

        if (checkForHelpCall(response)) {
            boolean flagForWhile = false;
            while (!flagForWhile) {
                System.out.println(printMassage);
                alternativeResponse = sc.next();
                if (!alternativeResponse.equalsIgnoreCase("c")) {
                    System.out.println("����� �� ������! ���������� ����� \"C - ��������\" �� ���������!" +
                            "��� ������� �������� 1000 �.�.");
                    System.exit(0);
                } else {
                    System.out.println("���� ��� ������ �����! ����������� �� ���������� 400 000 �.�. ���������� ��� ��� �� ��������� �����! " +
                            "��������� � ���������� �������. ������ ������� �� ������� *,*");
                    flagForWhile = true;
                }
            }
            listOfAnswer = new ArrayList<>(List.of(answer));
            printingTheFirstQuestion();
        }
        if (!response.equalsIgnoreCase("c")) {
            System.out.println("����� �� ������! ���������� ����� \"C - ��������\" �� ���������!" +
                    "��� ������� �������� 1000 �.�.");
            System.exit(0);
        } else {
            System.out.println("���� ��� ������ �����! ����������� �� ���������� 400 000 �.�. ���������� ��� ��� �� ��������� �����! " +
                    "��������� � ���������� �������. ������ ������� �� ������� *,*");
            listOfAnswer = new ArrayList<>(List.of(answer));
            printingTheFourthQuestion();
        }
    }

    private static void printingTheFourthQuestion() {
        System.out.println("""
                ������ �4
                ��� ����� ��������� ���������� ���������� � �������� ����������� �� ���� ��� �����, � ����� "Overlord"?
                A - ����� ������� ���� ������
                B - �������
                C - �������
                D - ������
                """);

        for (int index = 0; index < answer.length; index++) {
            if (answer[index].equalsIgnoreCase("a")) {
                correctAnswer = index;
            }
        }

        System.out.print(printMassage);
        String response = sc.next();

        if (checkForHelpCall(response)) {
            boolean flagForWhile = false;
            while (!flagForWhile) {
                System.out.println(printMassage);
                alternativeResponse = sc.next();
                if (!alternativeResponse.equalsIgnoreCase("b")) {
                    System.out.println("����� �� ������! ���������� ����� \"B - �������\" �� ���������!" +
                            "\n��� ������� �������� 400 000 �.�. � ��� ������������ ���������! �������� � ��������� ����!");
                    System.exit(0);
                } else {
                    System.out.println("������ �� ������!!!!! �� �������� ������� ���������?!?!?\n ����������� �� ���������� " +
                            "800 000 �.�.��������� � ���������� �������, ���������� ������� ����� ��������� � ����� ����� ����� �����������!!!!");
                    flagForWhile = true;
                }
            }
            listOfAnswer = new ArrayList<>(List.of(answer));
            sealFifthQuestion();
        }
        if (!response.equalsIgnoreCase("b")) {
            System.out.println("����� �� ������! ���������� ����� \"C - ��������\" �� ���������!" +
                    "��� ������� �������� 1000 �.�.");
            System.exit(0);
        } else {
            System.out.println("������ �� ������!!!!! �� �������� ������� ���������?!?!?\n ����������� �� ���������� " +
                    "800 000 �.�.��������� � ���������� �������, ���������� ������� ����� ��������� � ����� ����� ����� �����������!!!!");
            listOfAnswer = new ArrayList<>(List.of(answer));
            sealFifthQuestion();
        }


    }


    private static void sealFifthQuestion() {
        System.out.println("""
                ������ �5
                ��� ��������� � ��������� ���� ������ �������� � "Demon Slayer"?
                A - ������� �������
                B - ���� ������
                C - �������� ����
                D - ����� ���������
                """);

        for (int index = 0; index < answer.length; index++) {
            if (answer[index].equalsIgnoreCase("a")) {
                correctAnswer = index;
            }
        }

        System.out.print(printMassage);
        String response = sc.next();

        if (checkForHelpCall(response)) {
            System.out.println("� ������ ������� ��������� �� ��������");
        }
        if (!response.equalsIgnoreCase("a")) {
            System.out.println("����� �� ������! ���������� ����� \"A - ������� �������\" �� ���������!" +
                    "\n��� ������� �������� 400 000 �.�. � ��� ������������ ���������! �������� � ��������� ����!");
            System.exit(0);
        } else {
            System.out.println("""
                        ������!!! �� ��������!!!! �� ���������!!!!
                        ������� ��� ������� ������� � ����� ����. ���� ��� �����!
                         ======= GAME OVER ======""");

            System.exit(0);
        }
    }

    private static boolean checkForHelpCall(String response) {
        if (response.equalsIgnoreCase("help")) {
            System.out.println("�������� ���������\n 50/50\n f - ������ �����\n h - ������ ����");
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
                    System.out.println("���������");
                }
                flag = false;
            } else {
                System.out.println("�������� ����, ��������� �������");
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
        System.out.println("��������");
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
        System.out.println("������ �����...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            System.out.println("error Thread");
        }
        int randomIndex = getRandomNumber();
        for (int arrayIndex = 0; arrayIndex < answer.length; arrayIndex++) {
            if (randomIndex == arrayIndex) {
                answer[randomIndex] = answer[arrayIndex];
                System.out.printf("� ����� ��� ����� - %s", answer[randomIndex]);
                break;
            }
        }
        checkOfUse = false;

    }

    public static void hallHelp() {
        System.out.println("��������� ������� ������ ��� �������������!");
        try {
            Thread.sleep(1900);
        } catch (InterruptedException ex) {
            System.out.println("error Thread");
        }
        String[] audienceResponses = new String[]{"A", "B", "C", "D"};
        for (String audienceRespons : audienceResponses) {
            int randomPercent = getARandomPercentage();
            System.out.printf("%s - %d %%\n", audienceRespons, randomPercent);
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

