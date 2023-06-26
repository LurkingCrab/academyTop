package main.homework.jule5Year23.loopWhile;

public class completeFigureWhile {
    public static int figureSize = 10;
    public static int countSpace = 0;

    public static void main(String[] args) {
        // прямоугольный треугольник
//        rightTriangle();

        System.out.println();

        //перевернутый прямоугольный треугольник
        invertedRightTriangle();
    }

    private static void rightTriangle() {
        while (countSpace < figureSize) {
            int countCharacter = 0;
            while (countCharacter < countSpace) {
                System.out.print("*");
                countCharacter++;
            }
            System.out.println(" ");
            countSpace++;
        }
    }

    private static void invertedRightTriangle() {
        while (countSpace < figureSize){
            int countCharacter = figureSize - countSpace;
            int startCount = 0;
            while (startCount < countCharacter){
                System.out.print("*");
                startCount++;
            }
            System.out.println(" ");
            countSpace++;
        }
    }
}
