package main.homework.august_08_year_23;

import java.util.Arrays;

/**
 * m.replaceAll(oldElement,newElement)  void    - заменяет все числа oldElement, на newElement
 * m.replace(oldElement,newElement)     void    - заменяет первое число oldElement, на newElement
 * m.removeAll(element)                 void    - удаляет все числа равные element
 * m.reverse()                          void    - переворачивает массив наоборот
 * m.AddStart(element)                  void    - добавляет в начало массива
 * m.AddEnd(element)                    void    - добавляет в конец массива
 */
public class NextMethodsArrList {

    private static final int[] arr = new int[]{1, 2, 3, 4, 5, 6, 2};

    public static void main(String[] args) {
        System.out.println("Origins Arr: " + Arrays.toString(arr));
//        replaceAll(2, 1111);
//        replace(2, 111);
//        removeAll(5);
//        reverse();
//        addInStart(111);
        addInEnd(345678);
    }

    public static void replaceAll(int oldElement, int newElement) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == oldElement) {
                arr[index] = newElement;
            }
        }
        System.out.println("Replacement array: " + Arrays.toString(arr));
    }

    public static void replace(int oldElement, int newElement) {
        int countElement = 0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == oldElement && countElement < 1) {
                arr[index] = newElement;
                countElement++;
            }
        }
        System.out.println("Replacement array: " + Arrays.toString(arr));
    }

    public static void removeAll(int element) {
        int flag = 0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != element) {
                if (arr[index] == element) {
                    arr[index] = arr[index--];
                }
                System.out.println(arr[index]);
            } else {
            flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Changes have not been made");
        } else {
            System.out.println("Array changed");
        }
    }

    public static void reverse() {
        int buffer;
        for (int indexLeft = 0, indexRight = arr.length; indexRight > indexLeft; indexLeft++, indexRight--) {
            buffer = arr[indexLeft];
            arr[indexLeft] = arr[indexRight - 1];
            arr[indexRight - 1] = buffer;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void addInStart(int element){
        int[] newArr = new int[arr.length+1];
        newArr[0] = element;
        int indexArr = 0;
        for (int index = 1; index < newArr.length; index++) {
            newArr[index] = arr[indexArr];
            indexArr++;
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static void addInEnd(int element){
        int[] newArr = new int[arr.length+1];
        newArr[newArr.length-1] = element;
        int indexArr = 0;
        for (int index = 0; index < newArr.length-1; index++) {
            newArr[index] = arr[indexArr];
            indexArr++;
        }
        System.out.println(Arrays.toString(newArr));
    }
}


