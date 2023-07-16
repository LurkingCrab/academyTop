package main.practice.june_16_year_23.sorted;

public interface ArrayPrinting {
    static void print() {
        for (int element : RunPrograms.arr) {
            System.out.printf("%d, ", element);
        }
        System.out.println();
    }
}
