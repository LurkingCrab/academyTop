package main.homework.jule_5_year_23.complete_figure.loop_while;

import java.util.Scanner;

public class CompleteFigureWhile {

    public static void main(String[] args) {
        System.out.println("������� ������ ������\n");
        int figureSize = new Scanner(System.in).nextInt();

        // ������������� �����������
        getRightTriangle(figureSize);

        System.out.println();

        //������������ ������������� �����������
        getInvertedRightTriangle(figureSize);

        System.out.println();

        //�������������� �����������
        getIsoscelesTriangle(figureSize);

        //�� ���������� �������
        getQuadrant(5, 4);
    }

    private static void getRightTriangle(int figureSize) {
        int countSpace = 0;
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

    private static void getInvertedRightTriangle(int figureSize) {
        int countSpace = 0;
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

    private static void getIsoscelesTriangle(int figureSize) {
        int countNewString = 0;
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
            while (true) {
                System.out.println("\n������� �� ����� ���� �� ����������, �� ������ ����������? \n��/���");
                String userResponse = new Scanner(System.in).next();
                if (userResponse.equals("��")) {
                    System.out.println("�� � ��� ������������ :)");
                } else if (userResponse.equals("���")) {
                    System.out.println("������������� ��������� ����� ���������. ���� :)");
                    return;
                } else {
                    System.out.println("��... �� ����� ��� ������... ������ \"��\" ��� \"���\"");
                    continue;
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
                break;
            }
        }
    }
}
