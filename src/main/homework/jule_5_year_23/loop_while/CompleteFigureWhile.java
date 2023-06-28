package main.homework.jule_5_year_23.loop_while;

import java.util.Scanner;

public class CompleteFigureWhile {
    public static void main(String[] args) {

        // ������������� �����������
        //getRightTriangle(0, 10);

        //System.out.println();

        //������������ ������������� �����������
        //getInvertedRightTriangle(0, 10);

        //System.out.println();

        //�������������� �����������
        //getIsoscelesTriangle(0, 10);

        // �� ���������� �������
        getQuadrant(4, 5);
    }

    private static void getRightTriangle(int countSpace, int figureSize) {
        while (countSpace < figureSize) {
            int countCharacter = 0;
            while (countCharacter <= countSpace) {
                countCharacter++;
                System.out.print("*");
            }
            System.out.println();
            countSpace++;
        }
    }

    private static void getInvertedRightTriangle(int countSpace, int figureSize) {
        while (countSpace < figureSize) {
            int countCharacter = figureSize - countSpace;
            int startCount = 0;
            while (startCount < countCharacter) {
                System.out.print("*");
                startCount++;
            }
            System.out.println();
            countSpace++;
        }
    }

    private static void getIsoscelesTriangle(int countNewString, int figureSize) {
        while (countNewString <= figureSize) {
            int countCharacterSpace = 0;
            while (countCharacterSpace <= figureSize - countNewString) {
                System.out.print(" ");
                countCharacterSpace++;
            }
            int asteriskCharactersCount = 1;
            while (asteriskCharactersCount <= 2 * countNewString - 1) {
                System.out.print("*");
                asteriskCharactersCount++;
            }
            System.out.println();
            countNewString++;
        }
    }

    private static void getQuadrant(int xAxis, int yAxis) {
        if (xAxis != yAxis) {
            System.out.println("������� �� ����� ���� �� ����������, �� ������ ����������? \n��/���");
            String userResponse = new Scanner(System.in).next();
            if (userResponse.equals("��")) {
                System.out.println("�� � ��� ������������ :)");
            } else if (userResponse.equals("���")) {
                System.out.println("������������� ��������� ����� ���������. ���� :)");
                return;
            }
        }
        int contourCounter = 0;
        while (contourCounter < yAxis) {
            int verticalCounter = 0;
            while (verticalCounter < xAxis) {
                System.out.print("*");
                verticalCounter++;
            }
            System.out.println(" ");
            contourCounter++;
        }
    }
}
