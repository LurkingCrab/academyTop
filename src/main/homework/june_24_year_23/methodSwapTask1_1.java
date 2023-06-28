package main.homework.june_24_year_23;

public class methodSwapTask1_1 {
    public static void swap(int x, int y) {
        int buffer = x;
        x = y;
        y = buffer;
        System.out.printf("����� swap:\nx = %s\ny = %s", x, y);
    }

    public static void compute(int x, int y) {
        x = x + y - (y = x);
        System.out.printf("\n����� compute:x = %s\ny = %s\n", x, y);
    }

    private static void computeBitOperation(int x, int y){
        x ^= y ^= x ^= y;
        System.out.printf("����� computeBitOperation:\nx = %s\ny = %s", x, y);
    }

    public static void main(String[] args) {
        swap(5, 15);
        compute(2, 10);
        computeBitOperation(25, 1);
    }
}
