package org.example.homework02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Задача 1:
 * Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
 * Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с
 * сообщением "Некорректное число". В противном случае программа должна выводить сообщение "Число корректно".
 */
public class NumberInput {


    public static void main(String[] args) {
        try {
            double number = getInputNumber("Введите число: ");
            checkNumber(number);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено не число");
        } catch (InvalidNumberException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static double getInputNumber(String prompt) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static void checkNumber(double number) throws InvalidNumberException {
        if (number <= 0) {
            throw new InvalidNumberException("Некорректное число");
        } else System.out.println("Число корректно");
    }

    static class InvalidNumberException extends Exception {
        public InvalidNumberException(String message) {
            super(message);
        }
    }
}