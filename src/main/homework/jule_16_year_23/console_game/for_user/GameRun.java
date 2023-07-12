package main.homework.jule_16_year_23.console_game.for_user;

//�������� ���� ���������, ��� ������������ ������� ��������� �����

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameRun {
    public static void main(String[] args) {
        printGreeting();
        isProgramLogic();
    }

    private static void printGreeting() {
        System.out.print("���� ��� - ");
        String userName = new Scanner(System.in).next();
        System.out.printf("""
                ========"������ �����"========
                ����� ���������� %s!
                ������� ���� ������ - � ������� ����� �� 0 �� 10. �� ������ ��� ��������, � ���� 3 �������.
                ����� =)""", userName);
    }

    private static void isProgramLogic() {
        int randomNumber, userNumber;

        randomNumber = (int) Math.floor(Math.random() * 10);
        for (int iteration = 1; iteration < 4; iteration++) {
            System.out.printf("\n������� �%d\n", iteration);
            System.out.print("����� ����� ������� �������� ������: ");
            try {
                userNumber = new Scanner(System.in).nextInt();
                if (userNumber > 10 || userNumber < 0) {
                    System.out.println("��, �����! �� ���� ��� ������, � ���� ������� �� 0 �� 10. �������� ��� ���.");
                } else if (userNumber > randomNumber) {
                    System.out.println("������� �������, �� ���, ��� ����� ������ ������");
                } else if (userNumber < randomNumber) {
                    System.out.println("���, ���, �� �� XD ��� ����� ������ ������");
                } else {
                    System.out.println("�����! ������� ����� �� ����� �������! �� ������!");
                }
            } catch (InputMismatchException err) {
                System.out.println("������� ������� ������ �����");
            }
            if (iteration == 3) {
                System.out.printf("====GAME OVER====\n���������� ����� ���� - %d", randomNumber);
                break;
            }
        }


    }
}

