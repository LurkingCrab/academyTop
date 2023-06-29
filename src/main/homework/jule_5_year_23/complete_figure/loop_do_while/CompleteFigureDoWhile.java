package main.homework.jule_5_year_23.complete_figure.loop_do_while;

public class CompleteFigureDoWhile {
    public static void main(String[] args) {
        //Полный прямоугольный треугольник
        int countSpace = 0;
        int figureSize = 10;
        do {
            int countCharacter = 0;
            while (countCharacter <= countSpace) {
                System.out.print("*");
                countCharacter++;
            }
            System.out.println(" ");
            countSpace++;
        } while (countSpace < figureSize);

        System.out.println();

        int countSpace1 = 0;
        int figureSize1 = 10;
        do {
            int countCharacter = figureSize1 - countSpace1;
            int startCount = 0;
            while (startCount < countCharacter) {
                System.out.print("*");
                startCount++;
            }
            System.out.println();
            countSpace1++;
        } while (countSpace1 < figureSize1);
        System.out.println();

        int countNewString = 0;
        int figureSize3 = 10;
        do {
            int countCharacterSpace = 0;
            while (countCharacterSpace <= figureSize3 - countNewString) {
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
        } while (countNewString <= figureSize3);

        System.out.println();

        int contourCounter = 0;
        int xAxis = 4;
        int yAxis = 4;
        do {
            int verticalCounter = 0;
            while (verticalCounter < xAxis) {
                System.out.print("*");
                verticalCounter++;
            }
            System.out.println(" ");
            contourCounter++;
        } while (contourCounter < yAxis);

        System.out.println();

        int countSpace2 = 0;
        int figureSize2 = 10;
        do {
            int startCount = 0;
            while (startCount <= countSpace2) {
                if (startCount == countSpace2) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
                startCount++;
            }
            System.out.println();
            countSpace2++;
        } while (countSpace2 <= figureSize2);

        System.out.println();


        int figureSize4 = 10;
        while (figureSize4 >= 1){
            int startCount = 0;
            while (startCount <= figureSize4) {
                if (startCount == figureSize4) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
                startCount++;
            }
            System.out.println();
            figureSize4--;
        }
    }


}
