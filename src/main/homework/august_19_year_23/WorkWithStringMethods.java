package main.homework.august_19_year_23;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * String
 * 1) public static char charAt(int index)                ���������� ������ ������ �� ���������� index-�
 * 2) public static boolean equals(String str)            ���������� true ���� str == arr �� ��������
 * 3) public static String toLowerCase()                  ���������� string ��� ������� � ������ ��������
 * 4) public static String toUpperCase()                  ���������� string ��� ������� � ������� ��������
 * 5) public static int indexOf(char c)                   ���������� index ������� ��������� � ��������� ������ -1
 * 6) public static int indexOf(String c)                 ���������� index ������� ��������� � ��������� ������ -1
 * 7) public static int indexOfchar c , int fromIndex)    ���������� index ������� ��������� ������� � fromIndex � ��������� ������ -1
 * 8) public static int lastIndexOf(char c)               ���������� index ������� ��������� c ����� � ��������� ������ -1
 * 9) public static int lastIndexOf(String c)             ���������� index ������� ��������� c �����  � ��������� ������ -1
 * 10) public static String trim()                        ���������� string ������ ������� ����� � ������
 * 11) public static boolean startsWith(String str)       ���������� true ���� ������ ����������� �� str � 12) ��������� ������ false
 * 13) public static boolean endsWith(String str)         ���������� true ���� ������ �������������� �� str � ��������� ������ false
 * 14) public static boolean equalsIgnoreCase(String str) ���������� true ���� ������ ����� str �� �������� �������
 * 15) public static char[] toCharArray()                 ���������� ������ ��������
 */
public class WorkWithStringMethods {
    //��� ������ ����� �� ���???
    public static char[] arr = new char[0];

    private static String classString = "Bauder";

    public static int length(){
        return arr.length;
    }

    // �����! ����� ���� ����������� �� ������� ������. ��� � ������� ��� ����������� ������ toCharArray, ���?
    public static void change(String str){
        int wordLength = str.length();
        char[] outArr = new char[str.length()];
        for (int index = 0; index < wordLength; index++){
           outArr[index] = str.charAt(index) ;
        }
        System.out.println(Arrays.toString(outArr));
    }

    public static char charAt(int index){
        char[] outArr = new char[classString.length()];
        char resultOperation = '1';
       for (int indexPos = 0; indexPos < outArr.length-1; indexPos++){
           if (indexPos == index){
               resultOperation = outArr[indexPos];
           }
       }
       return resultOperation;
    }


    public static void main(String[] args) {
//        change("Bauder");
        System.out.println(charAt(2));

    }

}
