package main.practice.june_16_year_23.sorted;


import static main.practice.june_16_year_23.sorted.from_largest_to_smallest.LargestToSmallest.sortLargest;
import static main.practice.june_16_year_23.sorted.from_smallest_to_largest.SmallestToLargest.sortSmallest;

/**
 * Контрольная работа
 */

public class RunPrograms{

    public static int[] arr = {22, 66, 33, 77, -5, 234, 12, 500, -99, -564};

    public static void main(String[] args) {
        sortSmallest(arr);
        sortLargest(arr);
    }

    public static void print() {
        for (int element : RunPrograms.arr) {
            System.out.printf("%d, ", element);
        }
        System.out.println();
    }


}
