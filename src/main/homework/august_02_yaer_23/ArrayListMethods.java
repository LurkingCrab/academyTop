package main.homework.august_02_yaer_23;


import java.util.Arrays;


/**
 * m.size()           int     - размер массива
 * m.get(index)       int     - возвращает элемент по индексу
 * m.remove(index)    int     - возвращает удаляемое число
 * m.contains(value)  boolean - true если value имеется иначе false
 * m.clear()          void    - удаляет все элементы в массиве
 */
public class ArrayListMethods {

    private static int [] arr = new int[]{1, 2, 4, 5, 6, 7, 8, 9, 0};
    //                                   0  1  2  3  4  5  6  7  8

    private static int size;
    private static int getElement;

    // If you want to keep the original array, you can use this method
    private static int[] cloneAnArray(int[] clone){
        for (int index = 0; index<arr.length; index++){
            clone[index] = arr[index];
        }
        return clone;
    }

    public static void checkIndex(int setIndex) {
        if (setIndex < 0 || setIndex > arr.length) {
            System.out.printf("Operation failed. Index bound of exception (%d, array length %d)\n", setIndex, arr.length);

        }
    }
    public static int size() {
        for (int index = 0; index < arr.length; index++) {
            size++;
        }
        return size;
    }

    private static int get(int setIndex) {
        checkIndex(setIndex);
        /*cloneAnArray(arr)*/
        for (int i : arr) {
            if (arr[setIndex] == i) {
                getElement = i;
            }
        }
//        for (int index = 0; index < /*cloneAnArray(arr)*/arr.length; index++) {
//            if (/*cloneAnArray(arr)*/arr[setIndex] == /*cloneAnArray(arr)*/arr[index]) {
//                getElement = /*cloneAnArray(arr)*/arr[index];
//            }
//        }
        return getElement;
    }

    private static int remove(int setIndex) {
        checkIndex(setIndex);
        int[] result = new int[arr.length - 1];

        for (var i = 0; i < arr.length - 1; i++) {
            if (i != setIndex) {
                int newIndex = i < setIndex ? i : i - 1;
                result[newIndex] = arr[i];
            }
        }
        return result[setIndex];
    }
    private static int[] remove1ReturnArr(int setIndex) {
        checkIndex(setIndex);
        int[] result = new int[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            if (i != setIndex) {
                int newIndex = i < setIndex ? i : i - 1;
                result[newIndex] = arr[i];
            }
        }
        return result;
    }

    private static boolean contains(int element){
        boolean isCheckElement = false;
        for (int i : cloneAnArray(arr)) {
//            if (element == i){
//                isCheckElement = true;
//            } else {
//                isCheckElement = false;
//            }
            isCheckElement = element == i ? true : false;
        }
        return  isCheckElement;
    }

    private static void clear(){
        // Setting new empty array
        System.out.println("\nAfter clearing Array:");
        arr = new int[arr.length];
        System.out.println(arr[0]);
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString((cloneAnArray(arr))));
//        System.out.println("Length: " + arr.length);
        System.out.println("Size: " + size());
        System.out.println("Get: " + get(8));
        System.out.println("Removed element: " + remove(5));
        System.out.println("Modified array after deletion: " + Arrays.toString(remove1ReturnArr(9)));
        System.out.println("Checking for the presence of an element: " + contains(10));
        clear();
    }

}
