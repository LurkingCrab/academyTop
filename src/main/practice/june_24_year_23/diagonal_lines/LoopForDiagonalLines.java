package main.practice.june_24_year_23.diagonal_lines;

public class LoopForDiagonalLines {
    public static void main(String[] args) {
        //диагональ в право
        int figureSize = 14;
        for (int i = 1; i <= figureSize; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        // диагональ влево
        System.out.println();
        for (int i = figureSize; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print(' ');
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
