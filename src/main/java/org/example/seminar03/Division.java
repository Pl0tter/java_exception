package org.example.seminar03;

import java.util.Scanner;

/**
 * Задача: Написать программу, которая запрашивает у пользователя два числа и выполняет деление первого числа на второе число.
 * В случае деления на ноль, необходимо выбросить пользовательское исключение DivisionByZeroException.
 */
public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        double num1 = sc.nextDouble();
        System.out.print("Введите число 2: ");
        double num2 = sc.nextDouble();
        try {
            if (num2 == 0) throw new DivisionByZeroException("деление на ноль");
            double result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
        } catch (DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
