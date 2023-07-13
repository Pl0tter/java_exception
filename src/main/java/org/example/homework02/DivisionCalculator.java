package org.example.homework02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Задача 2:
 * Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
 * Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с
 * сообщением "Деление на ноль недопустимо". В противном случае программа должна выводить результат деления.
 */
public class DivisionCalculator {

    public static void main(String[] args) {
        try {
            double a = getInputNumber("Введите первое число: ");
            double b = getInputNumber("Введите второе число: ");
            double result = divideNumbers(a, b);
            System.out.println("Результат деления: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено не число");
        } catch (DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static double getInputNumber(String prompt) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static double divideNumbers(double a, double b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return a / b;
    }

    static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }
}