package org.example.homework03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Задача 1. Напишите программу-калькулятор, которая запрашивает у пользователя два числа и
 * выполняет операцию возведения первого числа в степень второго числа.
 * Если введены некорректные числа или происходит деление на ноль, необходимо обработать соответствующие исключения и
 * вывести информативное сообщение об ошибке.
 */
public class PowerCalculator {

    public static void main(String[] args) {
        try {
            double a = getInputNumber("Введите основание степени: ");
            double b = getInputNumber("Введите показатель степени: ");
            double result = calculatePower(a, b);
            System.out.println("Результат: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено не число");
        } catch (InvalidInputException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static double getInputNumber(String prompt) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static double calculatePower(double a, double b) throws InvalidInputException {
        if (b < 0) throw new InvalidInputException("Калькулятор работает с положительным показателем степени");
        return Math.pow(a, b);
    }

    static class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }
}