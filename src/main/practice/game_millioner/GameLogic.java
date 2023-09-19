package main.practice.game_millioner;

import java.util.HashMap;
import java.util.Scanner;

public class GameLogic {
    static Scanner sc = new Scanner(System.in);
    static String[] question;

    static void printingTheFirstQuestion() {
        System.out.println("""
                ������ �1
                �� ������ ������ �������� ������ � ���� �� ����� ������� ���������?
                A - Matricaria
                B - Centaurea
                C - Crocus sativus
                D - Arctium
                """);

        System.out.print("��� �����: ");
        String response = sc.next().toUpperCase();
        if (response.equals("HELP")) {
            System.out.println("�������� ���������\n 50/50\n f - ������ �����\n h - ������ ����");
            String clue = sc.next();
            selectClue(clue);
        }
        question = new String[]{"A", "B", "C", "D"};
        for (int count = 0; count < question.length; count++) {
            System.out.print("��� �����: ");
            if (!sc.next().toUpperCase().equals("C")) {
                System.out.println("����� �� ������! ���������� ����� \"� - Crocus sativus\" �� ���������!");
                GameMenu.gameMenu();
            } else {
                System.out.println("���� ��� ������ �����! ����������� �� ���������� ������ 1000 �.�. ���������� ��� ��� �� ��������� �����! " +
                        "��������� � ���������� �������.");
                printSecondQuestion();
            }
        }

//
//        switch (answerOptions) {
//            case "A", "B", "D" -> {
//                System.out.println("����� �� ������! ���������� ����� \"� - Crocus sativus\" �� ���������!");
//                GameMenu.gameMenu();
//            }
//            case "C" -> {
//                System.out.println("���� ��� ������ �����! ����������� �� ���������� ������ 1000 �.�. ���������� ��� ��� �� ��������� �����! " +
//                        "��������� � ���������� �������.");
//                printSecondQuestion();
//            }
//
//        }
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
                case "50/50" -> fiftyFifty();
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

    public static void fiftyFifty() {
        System.out.println("��������");
        String[] question = new String[]{"A", "B", "C", "D"};

    }

    public static void callAFriend() {
        System.out.println("��������");

    }

    public static void hallHelp() {
        System.out.println("��������");

    }
}
