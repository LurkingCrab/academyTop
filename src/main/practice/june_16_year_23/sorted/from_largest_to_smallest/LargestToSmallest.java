package main.practice.june_16_year_23.sorted.from_largest_to_smallest;


import main.practice.june_16_year_23.sorted.ArrayPrinting;

public class LargestToSmallest implements ArrayPrinting {
    public static void sortLargest(int[] arr) {
        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int element = 1; element < arr.length; element++) {
                if (arr[element] > arr[element - 1]) {
                    int variable = arr[element];
                    arr[element] = arr[element - 1];
                    arr[element - 1] = variable;
                    isSort = false;
                }
            }
        }
        ArrayPrinting.print();
    }
}
