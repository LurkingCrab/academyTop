package main.homework.june24Year23;


import java.util.Scanner;

public class scannerUsingTas1_2 {
    private static final int YEAR = 2023;

    public static void main(String[] args) {
        // 1. ��������� � ������������ ��� ��� � �������� � �����: �������, ��� ���!�.
        isPrintAGreeting();

        //2. ��������� � ������������ ��� ��� ��������, ����������, ������� ��� ��� � �������� ���������. ������� ���
        // ������� � ���� ��� ���������.
        isCalculatesAge();

        //3. ��������� � ������������ ����� ������� �������� � �������� �������� ������ ��������.
        isCalculatesThePerimeterOfASquare();

        //4. ��������� � ������������ ������ ���������� � �������� ������� ����� ����������.
        isCalculatesAreaOfACircle();

        //5. ��������� � ������������ ���������� � �� ����� ����� �������� � �� ������� ����� �� ����� ���������.
        // ���������� ��������, � ������� ���������� ���������, ����� ������ �������.
        System.out.print("������� ������:\n���������� ����� �������� (��) = ");
        double distanceBetweenCities = new Scanner(System.in).nextDouble();
        System.out.print("\n�� ������� ����� �� ������ ���������? - ");
        int hour = new Scanner(System.in).nextInt();

}

    private static void isCalculatesAreaOfACircle() {
        System.out.println("������� ������ ���������� (����������� ��� ������������, ����������� �������, ��� � ����� �����):");
        double radius = new Scanner(System.in).nextDouble();
        double areaOfACircle = Math.PI * (radius * radius);
        System.out.printf("������� ����� ����� %.2f\n", areaOfACircle);
    }

    private static void isCalculatesThePerimeterOfASquare() {
        System.out.println("������� ����� ������� �������� (����� �����):");
        int sideLengthOfASquare = new Scanner(System.in).nextInt();
        int perimeter = 4 * sideLengthOfASquare;
        System.out.printf("�������� �������� ����� %s\n", perimeter);
    }

    private static void isCalculatesAge() {
        System.out.println("������� ��� ��������:");
        int dateOfBirth = new Scanner(System.in).nextInt();
        int age = YEAR - dateOfBirth;
        System.out.printf("��� �����c� - %s\n", age);
    }

    private static void isPrintAGreeting() {
        System.out.println("������� ��� ������������:");
        String name = new Scanner(System.in).next();
        System.out.printf("������, %s\n", name);
    }
}
