package main.practice.contoursOfFigures;

public class loopForContorousOfFogures {
    public static void main(String[] args) {
        // Контурный равнобедренный треугольник
        int hang = 14;
        for (int i = 0; i <= hang; i++) {
            for (int j = 0; j < hang - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                if (i == 1 || i == hang || k == 0 || k == 2 * i - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Контурный правосторонний прямоугольный треугольник



    }
}
