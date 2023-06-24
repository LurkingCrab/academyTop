package main.practice.contoursOfFigures;

public class loopForContorousOfFogures {
    public static void main(String[] args) {
        // Контурный равнобедренный треугольник
        int figureSize = 14;
        for (int i = 0; i <= figureSize; i++) {
            for (int j = 0; j < figureSize - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                if (i == 1 || i == figureSize || k == 0 || k == 2 * i - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Контурный правосторонний прямоугольный треугольник
        for (int i = 1; i <= figureSize; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == figureSize || j == 1 || j == i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        //Перевернутый контурный прямоугольный треугольник
        for (int i = figureSize; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                {
                    if (i == figureSize || j == 1 || j == i) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }

        // Полый квадрат
    }
}
