package main.practice.diagonalLines;

public class loopForDiagonalLines {
    public static void main(String[] args) {
        //��������� � �����
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
        // ��������� �����
        System.out.println();
        for (int i = figureSize; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                {
                    if (j == i) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }
}
