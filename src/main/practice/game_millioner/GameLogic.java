package main.practice.game_millioner;

import java.util.Scanner;

public class GameLogic implements GameMenu {

    private static Scanner sc = new Scanner(System.in);
    private static String select = sc.next();

    private static void printingTheFirstQuestion() {
        System.out.println("""
                ������ �1
                �� ������ ������ �������� ������ � ���� �� ����� ������� ���������?
                A - Matricaria
                B - Centaurea
                C - Crocus sativus
                D - Arctium
                """);

        switch (select) {
            case "A", "B", "D" -> {
                System.out.println("����� �� ������! ���������� ����� \"� - Crocus sativus\" �� ���������!");
                GameMenu.gameMenu();
            }
            case "C" -> {
                System.out.println("���� ��� ������ �����! ����������� �� ���������� ������ 1000 �.�. ���������� ��� ��� �� ��������� �����! " +
                        "��������� � ���������� �������.");
                printSecondQuestion();
            }

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

        switch (select) {
            case "C", "B", "D" -> {
                System.out.println("����� �� ������! ���������� ����� \"A - ��������\" �� ���������!" +
                        "��� ������� �������� 1000 �.�.");
                GameMenu.gameMenu();
            }
            case "A" -> {
                System.out.println("���� ��� ������ �����! ����������� �� ���������� ������ 200 000 �.�." +
                        "��������� � ���������� �������.");
                printingTheThirdQuestion();
            }

        }
    }

    private static void printingTheThirdQuestion() {
        System.out.println("""
                ������ �3
                � ����� ��������� ������ ������ �����, �������� ������� ����������� ��� ��������� �����?
                A - ���������
                B - ������
                C - ��������
                D - ������� ϸ�
                """);

        switch (select) {
            case "A", "B", "D" -> {
                System.out.println("����� �� ������! ���������� ����� \"C - ��������\" �� ���������!" +
                        "��� ������� �������� 1000 �.�.");
                GameMenu.gameMenu();
            }
            case "C" -> {
                System.out.println("���� ��� ������ �����! ����������� �� ���������� ������ 400 000 �.�. ���������� ��� ��� �� ��������� �����! " +
                        "��������� � ���������� �������.");
               printingTheFourthQuestion();
            }

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
    }

    private static final String selectReturn = selectClue();

    public static String selectClue() {

        if (select.equals("50/50") || select.equals("h") || select.equals("f")) {
            switch (select) {
                case "50/50" -> fiftyFifty();
                case "f" -> callAFriend();
                case "h" -> hallHelp();
            }
        } else {
            System.out.println("�������� ����, ��������� �������");
            select = sc.next();
//            return select;
        }
        return select;
//        checkingForHints();
    }

    protected static void checkingForHints() {
//        selectClue();
        int check = 0;
        while (check == 0) {
            if (selectReturn.equals("50/50")) {
                System.out.println("��������� ������������, �� �� ������ �� ������ ������������");
                check++;
            } else if (selectReturn.equals("h")) {
                System.out.println("��������� ������������, �� �� ������ �� ������ ������������");
                check++;
            } else if (selectReturn.equals("f")) {
                System.out.println("��������� ������������, �� �� ������ �� ������ ������������");
                check++;
            }
        }
    }

    public static void fiftyFifty() {
        System.out.println("��������");
    }

    public static void callAFriend() {
        System.out.println("��������");
    }

    public static void hallHelp() {
        System.out.println("��������");
    }
}
