package main.practice.june_24_year_23.filled_figures;

public class LoopForPractice {
    public static void main(String[] args) {
        // ������������� �����������
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // ������������� �����������, ������������
        for (int i = 0; i < 10; i++) {
            int starCount = 10 - i;
            for (int j = 0; j < starCount; j++)
                System.out.print("*");
            System.out.println();
        }

        //�������������� �����������
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // �������
        System.out.println();
        int countI = 4;
        int countJ = 8;
        for (int i = 0; i < countI; i++) {
            for (int k = 0; k < countJ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
