package main.homework.jule5Year23.loopDoWhile;

import static main.homework.jule5Year23.loopWhile.completeFigureWhile.*;

public class completeFigureDoWhile{
    public static void main(String[] args) {
        //Полный прямоугольный треугольник
        do {
            int countCharacter = 0;
            while (countCharacter < countSpace) {
                System.out.print("*");
                countCharacter++;
            }
            System.out.println(" ");
            countSpace++;
        }while (countSpace < figureSize);
    }
}
