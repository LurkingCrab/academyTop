package main.homework.jule_5_year_23.contours_of_figures.loop_while;

public class ContoursOfFiguresLoopWhile {
    public static void main(String[] args) {
        getCountSize();
        System.out.println();

//        контурный прямоугольный треугольник
        int countLine = 1;
        while (countLine <= 8) {
            int countCharacter = 1;
            while (countCharacter <= countLine) {
                if (countLine == 8 || countCharacter == 1 || countCharacter == countLine) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
                countCharacter++;
            }
            System.out.println();
            countLine++;
        }
        System.out.println();

        //контурный перевернутый прямоугольный треугольник
        int i = 10;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                if (i == 10 || j == 1 || j == i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
                j++;
            }
            System.out.println();
            i--;
        }

        //      контурный квадрат
        int figureSize111 = 8;
        int countI = 0;
        while (countI < figureSize111) {
            int countJ = 0;
            while (countJ < figureSize111) {
                if (countJ == 0 || countJ == figureSize111 - 1 || countI == 0 || countI == figureSize111 - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
//                System.out.println();
                countJ++;
            }
            System.out.println();
            countI++;
        }

    }

    private static void getCountSize() {
        int figure = 10;
        int countSize = 0;
        while (countSize <= figure) {
            int countLine = 0;
            while (countLine < figure - countSize) {
                System.out.print(" ");
                countLine++;
            }
            int count = 0;
            while (count < 2 * countSize - 1) {
                if (countSize == 1 || countSize == figure || count == 0 || count == 2 * countSize - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                count++;
            }
            System.out.println();
            countSize++;
        }

    }

}