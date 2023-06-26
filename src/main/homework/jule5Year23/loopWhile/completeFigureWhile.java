package main.homework.jule5Year23.loopWhile;

public class completeFigureWhile {
    public static void main(String[] args) {
        // прямоугольный треугольник
        rightTriangle(0, 10);

        System.out.println();

        //перевернутый прямоугольный треугольник
        invertedRightTriangle(0, 10);
    }

    private static void rightTriangle(int countSpace, int figureSize) {
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

    private static void invertedRightTriangle(int countSpace, int figureSize) {
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
}
