package main.homework.august_19_year_23;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * String
 * 1) public static char charAt(int index)                возвращает символ строки по указанному index-у
 * 2) public static boolean equals(String str)            возвращает true если str == arr по значению
 * 3) public static String toLowerCase()                  возвращает string все символы в нижнем регистре
 * 4) public static String toUpperCase()                  возвращает string все символы в верхнем регистре
 * 5) public static int indexOf(char c)                   возвращает index первого вхождения в противном случаи -1
 * 6) public static int indexOf(String c)                 возвращает index первого вхождения в противном случаи -1
 * 7) public static int indexOfchar c , int fromIndex)    возвращает index первого вхождения начиная с fromIndex в противном случаи -1
 * 8) public static int lastIndexOf(char c)               возвращает index первого вхождения c конца в противном случаи -1
 * 9) public static int lastIndexOf(String c)             возвращает index первого вхождения c конца  в противном случаи -1
 * 10) public static String trim()                        возвращает string удалив пробелы слева и справа
 * 11) public static boolean startsWith(String str)       возвращает true если строка начинаеться на str в 12) противном случаи false
 * 13) public static boolean endsWith(String str)         возвращает true если строка заканчиваеться на str в противном случаи false
 * 14) public static boolean equalsIgnoreCase(String str) возвращает true если строка ровна str не учитывая регистр
 * 15) public static char[] toCharArray()                 возвращает массив символов
 */
public class WorkWithStringMethods {
    //Это вообще здесь за чем???
    public static char[] arr = new char[0];

    private static String classString = "Bauder";

    public static int length(){
        return arr.length;
    }

    // Фарид! Прошу дать комментарий по данному методу. Как я понимаю это равносильно методу toCharArray, так?
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
