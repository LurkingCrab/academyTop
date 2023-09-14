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
 * 7) public static int indexOf(char c, int fromIndex)    возвращает index первого вхождения начиная с fromIndex в противном случаи -1
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

    private static String classString = "baудer";

    public static int length() {
        return arr.length;
    }

    // Фарид! Прошу дать комментарий по данному методу. Как я понимаю это равносильно методу toCharArray, так?
    public static String change(String str) {
        int wordLength = str.length();
        char[] outArr = new char[str.length()];
        for (int index = 0; index < wordLength; index++) {
            outArr[index] = str.charAt(index);
        }
        System.out.println(Arrays.toString(outArr));
        return str;
    }

    public static char charAt(int index) {
        for (int indexPos = 0; indexPos < classString.length(); indexPos++) {
            if (indexPos == index) {
                return classString.charAt(indexPos);
            }
        }
        return '1';
    }


    public static boolean equals(String str) {
        if (str.length() != classString.length()) {
            return false;
        } else {
            for (int index = 0; index < str.length(); index++) {
                if (str.charAt(index) != classString.charAt(index)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static String toLowerCase() {
        char[] lowerCase = classString.toCharArray();
        for (int i = 0; i < lowerCase.length; i++) {
            if (lowerCase[i] >= 'A' && lowerCase[i] <= 'Z' || lowerCase[i] >= 'А' && lowerCase[i] <= 'Я') {
                lowerCase[i] = (char) (lowerCase[i] + 32);
            }
        }
        return new String(lowerCase);
    }

    public static String toUpperCase() {
        char[] upperCase = classString.toCharArray();
        for (int i = 0; i < upperCase.length; i++) {
            if (upperCase[i] >= 'a' && upperCase[i] <= 'z' || upperCase[i] >= 'а' && upperCase[i] <= 'я') {
                upperCase[i] = (char) (upperCase[i] - 32);
            }
        }
        return new String(upperCase);
    }

    public static int indexOf(char c) {
        for (int i = 0; i < classString.length(); i++) {
            if (classString.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(String s) {
        int start = 0;
        boolean isFlag = true;
        for (int i = 0; i < classString.length(); i++) {
            if (classString.charAt(i) == s.charAt(0)) {
                start = i;
                for (int j = 0; j < s.length(); j++) {
                    if ((i + j) >= classString.length() || classString.charAt(i + j) != s.charAt(j)) {
                        isFlag = false;
                        break;
                    }
                }
                if (isFlag) {
                    return start;
                } else {
                    isFlag = true;
                }
            }
        }
        return -1;
    }

    public static int lastIndexOf(char c, int fromIndex) {
        int index = 0;
        char[] arrStr = classString.toCharArray();
        for (int i = fromIndex; i < arrStr.length; i++) {
            if (arrStr[i] == c) {
                index = i;
                break;
            }
            if (index == 0) {
                index = -1;
            }
        }
        return index;
    }

    public static int lastIndexOf(char c) {
        int index = 0;
        char[] arrStr = classString.toCharArray();
        for (int i = arrStr.length - 1; i > 0; i--) {
            if (arrStr[i] == c) {
                index = i;
                break;
            }
            if (index == 0) {
                index = -1;

            }
        }
        return index;
    }

    public static int lastIndexOf(String s) {
        for (int i = classString.length() - s.length(); i >= 0; i--) {
            boolean isFlag = true;
            for (int j = 0; j < s.length(); j++) {
                if (classString.charAt(i + j) != s.charAt(j)) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag) {
                return i;
            }
        }
        return -1;
    }

    public static String trim() {
        int left = 0;
        for (int i = 0; i < classString.length(); i++) {
            if (classString.charAt(i) == ' ') left++;
            else break;
        }
        int right = 0;
        for (int i = classString.length() - 1; i > 0; i--) {
            if (classString.charAt(i) == ' ') right++;
            else break;
        }
        String newStr = "";
        for (int i = left; i < classString.length() - right; i++) {
            newStr += classString.charAt(i);
        }
        return newStr;
    }

    public static boolean startWith(String search) {
        if (classString.length() < search.length()) return false;
        for (int i = 0; i < search.length(); i++) {
            if (classString.charAt(i) != search.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean endWith(String search) {
        if (classString.length() < search.length()) return true;
        for (int i = 0; i < search.length(); i++) {
            if (classString.charAt(i) != search.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean equalsIgnoreCase(String str2) {
        if (classString.length() != str2.length()) return false;
        for (int i = 0; i < str2.length(); i++) {
            if (classString.toLowerCase().charAt(i) != str2.toLowerCase().charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static char[] toCharArray() {
        char[] array = new char[classString.length()];
        for (int i = 0; i < classString.length(); i++) {
            array[i] = classString.charAt(i);
        }
        return array;
    }

    public static void main(String[] args) {
        change("Bauder");
        System.out.println(charAt(5));
        System.out.println(equals("Ba"));
        System.out.println(toLowerCase());
        System.out.println(toUpperCase());
        System.out.println(indexOf('у'));
        System.out.println(indexOf("der"));
        System.out.println(lastIndexOf('r'));
        System.out.println(lastIndexOf("B"));
        System.out.println(lastIndexOf('у', 3));
        System.out.println(trim());
        System.out.println(startWith("a"));
        System.out.println(endWith("у"));
        System.out.println(equalsIgnoreCase("BAУДER"));
        System.out.println(Arrays.toString(toCharArray()));

    }

}
