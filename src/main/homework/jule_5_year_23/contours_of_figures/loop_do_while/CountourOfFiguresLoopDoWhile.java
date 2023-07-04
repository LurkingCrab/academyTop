package main.homework.jule_5_year_23.contours_of_figures.loop_do_while;

public class CountourOfFiguresLoopDoWhile {
    public static void main(String[] args) {
        int figure = 10;
        int countSize = 0;
        do{
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
        }while (countSize <= figure);

        System.out.println();

        int countLine = 1;
        do {
            int countCharacter = 1;
             do {
                if (countLine == 8 || countCharacter == 1 || countCharacter == countLine) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
                countCharacter++;
            }while (countCharacter <= countLine);
            System.out.println();
            countLine++;
        }while (countLine <= 8);

        System.out.println();

        int i = 10;
        do {
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
        }while (i >= 1);

        System.out.println();

        int figureSize111 = 8;
        int countI = 0;
        do {
            int countJ = 0;
            while (countJ < figureSize111) {
                if (countJ == 0 || countJ == figureSize111 - 1 || countI == 0 || countI == figureSize111 - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
                countJ++;
            }
            System.out.println();
            countI++;
        }while (countI < figureSize111);
    }

}
