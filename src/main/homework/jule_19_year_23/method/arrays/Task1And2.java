package main.homework.jule_19_year_23.method.arrays;

// 1)������� ���������� ������
// 2)������� ���������� ��������
public class Task1And2 {
    protected static int[] arr = new int[]{10, 2, 233, 4, 185, -435, -5, 3990, -400, 5, 5397, 523, 5, -6, 7, 8, 9, -11};

    public static void main(String[] args) {
        isEvenOdd();
    }

    private static void isEvenOdd() {
        int evenNumbers = 0;
        int oddNumbers = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }
        System.out.printf("���������� ������ �����: %d\n���������� �������� �����: %d\n", evenNumbers, oddNumbers);
    }
}
