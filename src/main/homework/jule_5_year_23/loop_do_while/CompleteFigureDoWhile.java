package main.homework.jule_5_year_23.loop_do_while;

public class CompleteFigureDoWhile {
    public static void main(String[] args) {
        //Полный прямоугольный треугольник
        int countSpace = 0;
        int figureSize = 10;
        do {
            int countCharacter = 0;
            while (countCharacter < countSpace) {
                System.out.print("*");
                countCharacter++;
            }
            System.out.println(" ");
            countSpace++;
        } while (countSpace < figureSize);
    }
}
