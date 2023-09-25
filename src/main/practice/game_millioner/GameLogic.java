package main.practice.game_millioner;


import java.util.*;

public class GameLogic {
    static Scanner sc = new Scanner(System.in);
    static String[] answer = new String[]{"A", "B", "C", "D"};
    static List<String> listOfAnswer = new ArrayList<>(List.of(answer));
    static String printMassage = "��� �����: ";
    static int correctAnswer;
    static String alternativeResponse;

    static void printingTheFirstQuestion() {
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

        System.out.print(printMassage);
        String response = sc.next();

        if (checkForHelpCall(response)) {
            System.out.print(printMassage);
            alternativeResponse = sc.next();
            if (!alternativeResponse.equalsIgnoreCase("c")){
                System.out.println("����� �� ������! ���������� ����� \"� - Crocus sativus\" �� ���������!");
                GameMenu.gameMenu();
            } else {
                System.out.println("���� ��� ������ �����! ����������� �� ���������� ������ 1000 �.�. ���������� ��� ��� �� ��������� �����! " +
                        "��������� � ���������� �������.");
                printSecondQuestion();
            }
        }
        if (!response.equalsIgnoreCase("c")) {
            System.out.println("����� �� ������! ���������� ����� \"� - Crocus sativus\" �� ���������!");
            GameMenu.gameMenu();
        } else {
            System.out.println("���� ��� ������ �����! ����������� �� ���������� ������ 1000 �.�. ���������� ��� ��� �� ��������� �����! " +
                    "��������� � ���������� �������.");
            printSecondQuestion();
        }
    }


    private static void printSecondQuestion() {
        System.out.println("""
                ������ �2
                � ����� �������� ������ �������� ������� ����������� ������ ��������� II?
                A - ��������
                B - �������
                C - �������
                D - �����
                """);

        System.out.print("��� �����: ");
        String select = sc.next().toUpperCase();

        if (select.equals("HELP")) {
            System.out.println("�������� ���������\n 50/50\n f - ������ �����\n h - ������ ����");

        }

        switch (select) {
            case "C", "B", "D" -> {
                System.out.println("����� �� ������! ���������� ����� \"A - ��������\" �� ���������!" +
                        "��� ������� �������� 1000 �.�.");
                GameMenu.gameMenu();
            }
            case "A" -> {
                System.out.println("���� ��� ������ �����! ����������� �� ���������� 200 000 �.�." +
                        "��������� � ���������� �������.");
//                printingTheThirdQuestion();
            }

        }
    }


//    private static void printingTheThirdQuestion() {
//        System.out.println("""
//                ������ �3
//                � ����� ��������� ������ ������ �����, �������� ������� ����������� ��� ��������� �����?
//                A - ���������
//                B - ������
//                C - ��������
//                D - ������� ϸ�
//                """);
//
//        System.out.print("��� �����: ");
//        String select = sc.next().toUpperCase();
//
//        if (select.equals("HELP")) {
//            System.out.println("�������� ���������\n 50/50\n f - ������ �����\n h - ������ ����");
//            selectClue();
//        }
//
//        switch (select) {
//            case "A", "B", "D" -> {
//                System.out.println("����� �� ������! ���������� ����� \"C - ��������\" �� ���������!" +
//                        "��� ������� �������� 1000 �.�.");
//                GameMenu.gameMenu();
//            }
//            case "C" -> {
//                System.out.println("���� ��� ������ �����! ����������� �� ���������� 400 000 �.�. ���������� ��� ��� �� ��������� �����! " +
//                        "��������� � ���������� �������. ������ ������� �� ������� *,*");
//                printingTheFourthQuestion();
//            }
//
//        }
//
//    }

//    private static void printingTheFourthQuestion() {
//        System.out.println("""
//                ������ �4
//                ��� ����� ��������� ���������� ���������� � �������� ����������� �� ���� ��� �����, � ����� "Overlord"?
//                A - ����� ������� ���� ������
//                B - �������
//                C - �������
//                D - ������
//                """);
//
//        System.out.print("��� �����: ");
//        String select = sc.next().toUpperCase();
//
//        if (select.equals("HELP")) {
//            System.out.println("�������� ���������\n 50/50\n f - ������ �����\n h - ������ ����");
//            selectClue();
//        }
//
//        switch (select) {
//            case "A", "C", "D" -> {
//                System.out.println("����� �� ������! ���������� ����� \"B - �������\" �� ���������!" +
//                        "\n��� ������� �������� 400 000 �.�. � ��� ������������ ���������! �������� � ��������� ����!");
//                GameMenu.gameMenu();
//            }
//            case "B" -> {
//                System.out.println("������ �� ������!!!!! �� �������� ������� ���������?!?!?\n ����������� �� ���������� " +
//                        "800 000 �.�.��������� � ���������� �������, ���������� ������� ����� ��������� � ����� ����� ����� �����������!!!!");
//                sealFifthQuestion();
//            }
//
//        }
//    }

//    private static void sealFifthQuestion() {
//        System.out.println("""
//                ������ �5
//                ��� ��������� � ��������� ���� ������ �������� � "Demon Slayer"?
//                A - ������� �������
//                B - ���� ������
//                C - �������� ����
//                D - ����� ���������
//                """);
//
//        System.out.print("��� �����: ");
//        String select = sc.next().toUpperCase();
//        if (select.equals("HELP")) {
//            System.out.println("��������� ���������");
//            sealFifthQuestion();
//        }
//        switch (select) {
//            case "A", "C", "D" -> {
//                System.out.println("����� �� ������! ���������� ����� \"B - �������\" �� ���������!" +
//                        "\n��� ������� �������� 400 000 �.�. � ��� ������������ ���������! �������� � ��������� ����!");
//                GameMenu.gameMenu();
//            }
//            case "B" -> {
//                System.out.println("""
//                        ������!!! �� ��������!!!! �� ���������!!!!
//                        ������� ��� ������� ������� � ����� ����. ���� ��� �����!
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
            System.out.println("�������� ����, ��������� �������");
            selectClue(selectHelp);
        }
        checkingForHints(selectHelp);
        return selectHelp;
    }

    private static boolean checkForHelpCall(String response) {
        if (response.equalsIgnoreCase("help")) {
            System.out.println("�������� ���������\n 50/50\n f - ������ �����\n h - ������ ����");
            String clue = sc.next();
            selectClue(clue);
            System.out.println(listOfAnswer);
            return true;
        } else {
            return false;
        }
    }

    protected static void checkingForHints(String selectReturn) {
//   ���������, �� ��������. 3 ���� ������� ��������� �� �������������. ������� ������ ��� ��� ������� ����� ��������� �������
        int check = 0;
        while (check <= 3) {
            switch (selectReturn) {
                case "50/50", "h", "f" -> {
                    System.out.println("��������� ������������, �� �� ������ �� ������ ������������");
                    check++;
                }
            }
        }
    }

    public static List<String> fiftyFifty(int corAnsw) {
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
        return answ;

    }

    private static int getRandomNumber() {
        return (int) (Math.random() * 5);
    }

    public static void callAFriend() {
        System.out.println("��������");

    }

    public static void hallHelp() {
        System.out.println("��������");

    }

}

