package main.practice.game_millioner;

import java.util.Scanner;

public class GameMenu {

    static Scanner sc = new Scanner(System.in);

    static void printingMessage() {
        System.out.print("����� ���������� � ���� \"��� ����� ����� �����������\"\n������������� ����������: ");
        String name = sc.nextLine();
        System.out.printf("������� ������� %s! ���� ������ ��� � ����� ����!\n ", name);
    }



    static void gameMenu() throws InterruptedException {
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
                case "2" -> printingRules();
                case "e" -> System.exit(0);

            }
        } else {
            System.out.println("�������� �������, ������� 1 ��� 0");
            gameMenu();
        }
    }

    static void printingRules() throws InterruptedException {
        System.out.println("""
                �������  ����:
                � ���� 5 ��������. ������ ����������� ������ ����� ������� ������� �����������.
                ������ 1 - 1000 ���. ����������� �����
                ������ 2 - 200 000 ���.
                ������ 3 - 400 000 ���.����������� �����.
                ������ 4 - 800 000 ���.\s
                ������ 5 - 1 000 000 ���. ������������� ��������� �� ��������, ���� ���� ��� ��������!
                ���������
                ���������� ����������� ��������� ��� ���������, ������� ��� ����� ������������ � ����� ������ ���������. ����� ���������� ������� ������ �� ��������� ����� ���� ������������ ������ ���� ���. ��� ������ ��������� �������� "help" � ���� ������ ������

                50/50 - ��������� ��� ������������ ������ �� �������������� ������, �������� ��������� ������ ���� ���������� � ���� ������������ �������. ��� ��������, ��� � ���� ���� ���� 50/50. ��� ��������� ������� 50/50

                ������ ������ ��������� - ���� ������ ��� �� ������, ��� � ���������, � ���������� ������� �����, ����� �������� �� ������. �� ��������� ������������ ����� ������������ ������������� ��������, ��� ��������� ����� ���� ����������� ��������. ��������� ������ ����������� ����������� � ������������, ����������� �� ���������. ��� ��������� ����� "h"

                ��������� ����� - ���������� ����������� ������� ������ �����  � ��������, ����� �� ��� ����� �� ������.��� ��������� ������� "f"
                ��� �������� � ���� ������� 0""");
        boolean flag = true;
        while (flag) {
            String returnMenu = sc.next();
            if (returnMenu.equals("0")) {
                flag = false;
                gameMenu();
            } else {
                System.out.println("�� ������ ����, ���������.");
            }
        }
    }

}
