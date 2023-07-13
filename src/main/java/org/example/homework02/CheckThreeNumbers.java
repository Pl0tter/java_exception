package org.example.homework02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckThreeNumbers {

    public static void main(String[] args) {
        try {
            double a = getInputNumber("Введите первое число: ");
            double b = getInputNumber("Введите второе число: ");
            double c = getInputNumber("Введите третье число: ");
            checkNumbers(a, b, c);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено не число");
        } catch (NumberOutOfRangeException | NumberSumException | DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static double getInputNumber(String prompt) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static void checkNumbers(double a, double b, double c) throws
            NumberOutOfRangeException, NumberSumException, DivisionByZeroException {
        if (a > 100) throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        else if (b < 0) throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        else if (a + b < 10) throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        else if (c == 0) throw new DivisionByZeroException("Деление на ноль недопустимо");
        else System.out.println("Проверка пройдена успешно");
    }

    static class NumberOutOfRangeException extends Exception {
        public NumberOutOfRangeException(String message) {
            super(message);
        }
    }

    static class NumberSumException extends Exception {
        public NumberSumException(String message) {
            super(message);
        }
    }

    static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }
}