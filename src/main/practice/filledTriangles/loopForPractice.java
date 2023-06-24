package main.practice.filledTriangles;

public class loopForPractice {
    public static void main(String[] args) {
        // прямоугольный треугольник, левосторонний
        for (int count = 0; count < 10; count++)
        {
            int starCount = 1 + count;
            for (int j = 0; j < starCount; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
        // прямоугольный треугольник, перевернутый
        for (int i = 0; i < 10; i++)
        {
            int starCount = 10 - i;
            for (int j = 0; j < starCount; j++)
                System.out.print("*");
            System.out.println();
        }

        //Равнобедренный треугольник
        for (int i = 0; i<=6; i++) {
            for (int j =1; j<=6-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k<=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
