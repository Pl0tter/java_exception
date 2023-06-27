package org.example.homework01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
    /**
     * Простая задача 1: Проверка деления на ноль.
     * Напишите программу, которая запрашивает у пользователя два целых числа и выполняет их деление.
     * Если второе число равно нулю, выбросите исключение ArithmeticException
     * с сообщением "Деление на ноль недопустимо". Иначе выведите результат деления на экран.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.print("Введите целое первое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите целое второе число: ");
            int b = scanner.nextInt();
            int result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль недопустимо");
        } catch (InputMismatchException e) {
            System.out.println("Нужно было ввести целое число");
        } finally {
            scanner.close();
        }
    }
}
