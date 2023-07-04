package main.homework.july_5_11_year_23.complete_figure.loop_while;

import java.util.Scanner;

public class CompleteFigureWhile {

    public static void main(String[] args) {
        System.out.println("""
                Выберите фигуру которые хотите получить.
                1 - Прямоугольный треугольник
                2 - Перевернутый прямоугольный треугольник
                3 - Равнобедренный треугольник
                4 - Квадрат
                5 - Диагональ в правую сторону
                6 - Диагональ в левую сторону
                """);
        int num = new Scanner(System.in).nextInt();
        switch (num) {
            case 1 -> {
                System.out.println("Введите размер фигуры\n");
                int figureSize = new Scanner(System.in).nextInt();
                getRightTriangle(figureSize);
            }
            case 2 -> {
                System.out.println("Введите размер фигуры\n");
                int figureSize1 = new Scanner(System.in).nextInt();
                getInvertedRightTriangle(figureSize1);
            }
            case 3 -> {
                System.out.println("Введите размер фигуры\n");
                int figureSize2 = new Scanner(System.in).nextInt();
                getIsoscelesTriangle(figureSize2);
            }
            case 4 -> {
                System.out.print("Ведите размеры квадрата.\na = ");
                int xAxis = new Scanner(System.in).nextInt();
                System.out.println("b = ");
                int yAxis = new Scanner(System.in).nextInt();
                getQuadrant(xAxis, yAxis);
            }
            case  5 -> {
                System.out.println("Введите размер фигуры\n");
                int figureSize3 = new Scanner(System.in).nextInt();
                getDiagonalLineRight(figureSize3);
            }
            case 6 -> {
                System.out.println("Введите размер фигуры\n");
                int figureSize4 = new Scanner(System.in).nextInt();
                getDiagonalLineLeft(figureSize4);
            }
        }
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
                System.out.println("\nКвадрат из этого явно не получиться, вы хотите продолжить? \nда/нет");
                String userResponse = new Scanner(System.in).next();
                if (userResponse.equals("да")) {
                    System.out.println("Ну я вас предупреждал :)");
                } else if (userResponse.equals("нет")) {
                    System.out.println("Перезапустите программу когда надумаете. Пока :)");
                    return;
                } else {
                    System.out.println("Эм... не стоит так делать... Ведите \"да\" или \"нет\"");
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

    private static void getDiagonalLineRight (int figureSize){
        int countSpace = 0;
        while (countSpace <= figureSize) {
            int startCount = 0;
            while (startCount <= countSpace) {
                if(startCount == countSpace){
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
                startCount++;
            }
            System.out.println();
            countSpace++;
        }
    }

    private static void getDiagonalLineLeft(int figureSize){
        int countSpace = figureSize;
        while (countSpace >= 1){
            int startCount = 0;
            while (startCount <= countSpace) {
                if (startCount == countSpace) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
                startCount++;
            }
            System.out.println();
            countSpace--;
        }
    }
}
