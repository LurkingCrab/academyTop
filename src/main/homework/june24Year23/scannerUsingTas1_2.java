package main.homework.june24Year23;


import java.util.Scanner;

public class scannerUsingTas1_2 {
    private static final int YEAR = 2023;

    public static void main(String[] args) {
        // 1. ��������� � ������������ ��� ��� � �������� � �����: �������, ��� ���!�.
        System.out.println("������� ��� ������������");
        String name = new Scanner(System.in).next();
        System.out.printf("������, %s\n", name);

        //2. ��������� � ������������ ��� ��� ��������, ����������, ������� ��� ��� � �������� ���������. ������� ���
        // ������� � ���� ��� ���������.
        System.out.println("������� ��� ��������");
        int dateOfBirth = new Scanner(System.in).nextInt();
        int age = YEAR - dateOfBirth;
        System.out.printf("��� ������c� - %s\n", age);

    }
}
