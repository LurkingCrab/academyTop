package main.practice.june_24_year_23.contours_of_figures;

public class LoopForContorousOfFogures {
    public static void main(String[] args) {
        // ��������� �������������� �����������
        int figureSize = 14;
        for (int i = 1; i <= figureSize; i++) {
            for (int j = 1; j < figureSize - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * i - 1; k++) {
                if (i == 1 || i == figureSize || k == 2 * i - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        //��������� �������������� ������������� �����������
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

        //������������ ��������� ������������� �����������
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

        // ����� �������
        int countI = 4;
        int countJ = 8;
        for (int i = 0; i < countI; i++) {
            for (int j = 0; j < countJ; j++) {
                if (i == 0 || i == countI - 1 || j == 0 || j == countJ - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}