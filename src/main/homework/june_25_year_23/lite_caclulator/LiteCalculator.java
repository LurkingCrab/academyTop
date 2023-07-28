package main.homework.june_25_year_23.lite_caclulator;

import java.util.Scanner;

/**
 * Пользователь вводит число 1
 * Пользователь оператор (+ , - , * , /) (иначе сообщение об ошибке повторите попытку)
 * Пользователь вводит число 2
 * Результат
 */

public class LiteCalculator {
    static int firstNum, secondNum, result;

    public static void main(String[] args) {
        System.out.println("Welcome to The Lite Calculator\nEnter your expression: ");
        String expression = new Scanner(System.in).next();
        String[] mathematicalAction = new String[]{"+", "-", "/", "*"};
        String[] regMathAction = new String[]{"\\+", "-", "/", "\\*"};
        int indexAction = -1;
        for (int i = 0; i < mathematicalAction.length; i++) {
            if (expression.contains(mathematicalAction[i])) {
                indexAction = i;
                break;
            }
        }
        if (indexAction == -1) {
            System.out.println("Action is not possible. The calculator can only perform simple operations.");
            return;
        }
        String[] arrayOfNumbersFromExp = expression.split(regMathAction[indexAction]);
        firstNum = Integer.parseInt(arrayOfNumbersFromExp[0]);
        secondNum = Integer.parseInt(arrayOfNumbersFromExp[1]);

        switch (arrayOfNumbersFromExp[indexAction]) {
            case "+" -> result = firstNum + secondNum;
            case "-" -> result = firstNum - secondNum;
            case "*" -> result = firstNum * secondNum;
            case "/" -> result = firstNum / secondNum;
        }
        System.out.printf("Result: %s", result);
    }
}
