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

    private static int[] arr = new int[]{1, 2, 3, 4, 5, 6, 2};

    public static void main(String[] args) {
        System.out.println("Origins Arr: " + Arrays.toString(arr));
//        replaceAll(2, 1111);
//        replace(2, 111);
        removeAll(5);
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
}


