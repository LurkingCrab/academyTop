package main.practice.june_16_year_23;

import java.util.Scanner;

/**
 * ����������� ������
 */

//3)����� �������� � ������� � ������ ��������� ��� ������� ����� -1
//4)����� �������� � ������� � ����� ��������� ��� ������� ����� -1
//5)����� �������� � ������� � ������ ��������� ������ ��������  ����� -1
//6)����� �������� � ������� � ����� ��������� ������ ��������  ����� -1
//7)����� �������� � ������� ��������� true ���� ������� ���� � ������� ����� false
public class FindElementsAndIndexes {
    public static int[] arr = {22, 66, 33, 77, -5, 234, 12, 500, -99, -564};


    public static void main(String[] args) {
//        System.out.println(ReturnsTheElementFromTheBeginning(arr, 77));
//        System.out.println(ReturnTheElementFromTheEnd(arr, 12222));
//        System.out.println(ReturnsTheIndexFromBeginning(arr, 33));
//        System.out.println(ReturnsTheIndexFromTheEnd(arr, 501));
        System.out.println(findElementReturnsBoolean(arr, 234));

    }

    public static int ReturnsTheElementFromTheBeginning(int[] arr, int searchElement) {
        for (int element = 0; element < arr.length; element++) {
            if (arr[element] == searchElement) {
                return arr[element];
            }
        }
        return -1;
    }
    public static int ReturnTheElementFromTheEnd(int[] arr, int searchElement){

        for (int element = arr.length-1; element >= 0; element--) {
            if (arr[element] == searchElement) {
                return arr[element];
            }
        }
        return -1;
    }

    public static int ReturnsTheIndexFromBeginning(int[] arr, int searchElement){
        for (int element = 0; element < arr.length; element++) {
            if (arr[element] == searchElement) {
                return element;
            }
        }
        return -1;
    }

    public static int ReturnsTheIndexFromTheEnd(int[] arr, int searchElement){
        for (int element = arr.length-1; element > 0; element--) {
            if (arr[element] == searchElement) {
                return element;
            }
        }
        return -1;
    }

    public static boolean findElementReturnsBoolean (int[] arr, int searchElement){
        for (int element = 0; element < arr.length; element++) {
            if (arr[element] == searchElement) {
                return true;
            }
        }
        return false;
    }
}
