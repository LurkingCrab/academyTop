package main.practice.game_millioner;

import java.util.Scanner;

public interface GameMenu {

    Scanner sc = new Scanner(System.in);

    static void printingMessage() {
        System.out.print("����� ���������� � ���� \"��� ����� ����� �����������\"\n������������� ����������: ");
        String name = sc.nextLine();
        System.out.printf("������� ������� %s! ���� ������ ��� � ����� ����!\n ", name);
    }

//    static void navigateThroughTheMenu() {
//        String choice = sc.next();
//        if (choice.equals("1")) {
//            System.out.println("����� �� ��������!!!");
//        } else if (choice.equals("0")) {
//            gameMenu();
//        } else {
//            System.out.println("�������� �������, ������� 1 ��� 0");
//            navigateThroughTheMenu();
//        }
//    }


    static void gameMenu() {
        System.out.println("""
                 ========= ��� ����� ����� ����������� ==========
                 1 - ������ ����
                 2 - �������
                 e - ����� �� ����
                """);
        String num = sc.next();
        if (num.equals("1") || num.equals("2") || num.equals("e")) {
            switch (num) {
                case "1" -> {
                    System.out.println("����� �� ��������!!!");
                    GameLogic.printingTheFirstQuestion();
                }
                case "2" -> {
                    printingRules();
                }
                case "e" -> System.exit(0);

            }
        } else {
            System.out.println("�������� �������, ������� 1 ��� 0");
            gameMenu();
        }
    }

    static void printingRules() {
        System.out.println("�������  ����:\n� ���� 5 ��������. ������ ����������� ������ ����� ������� ������� �����������.\n" +
                "������ 1 - 1000 ���. ����������� �����\n" +
                "������ 2 - 200 000 ���.\n" +
                "������ 3 - 400 000 ���.����������� �����.\n" +
                "������ 4 - 800 000 ���. \n" +
                "������ 5 - 1 000 000 ���. ������������� ��������� �� ��������, ���� ���� ��� ��������!\n" +
                "���������\n" +
                "���������� ����������� ��������� ��� ���������, ������� ��� ����� ������������ � ����� ������ ���������. ����� ���������� ������� " +
                "������ �� ��������� ����� ���� ������������ ������ ���� ���. ��� ������ ��������� �������� \"help\" � ���� ������ ������\n" +
                "\n" +
                "50/50 - ��������� ��� ������������ ������ �� �������������� ������, �������� ��������� ������ ���� ���������� " +
                "� ���� ������������ �������. ��� ��������, ��� � ���� ���� ���� 50/50. ��� ��������� ������� 50/50\n" +
                "\n" +
                "������ ������ ��������� - ���� ������ ��� �� ������, ��� � ���������, � ���������� ������� �����, ����� " +
                "�������� �� ������. �� ��������� ������������ ����� ������������ ������������� ��������, ��� ��������� ����� ���� ����������� ��������. " +
                "��������� ������ ����������� ����������� � ������������, ����������� �� ���������. ��� ��������� ����� \"h\"\n" +
                "\n" +
                "��������� ����� - ���������� ����������� ������� ������ �����  � ��������, ����� �� ��� ����� �� ������." +
                "��� ��������� ������� \"f\"\n" +
                "��� �������� � ���� ������� 0");
        String returnMenu = sc.next();

            if (returnMenu.equals("0")) {
                gameMenu();
            } else {
                System.out.println("�� ������ ����, ���������.");
            }

    }

}
