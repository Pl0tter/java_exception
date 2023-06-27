package org.example.homework01;

import java.util.Scanner;

public class Ex02 {
    /**
     * Простая задача 2: Обработка некорректного ввода.
     * Напишите программу, которая запрашивает у пользователя его возраст.
     * Если введенное значение не является числом, выбросите исключение NumberFormatException
     * с сообщением "Некорректный ввод". Иначе выведите возраст на экран.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.print("Введите возраст: ");
            int age = Integer.parseInt(scanner.next());
            if (age < 0) throw new NumberFormatException();
            System.out.println("Ваш возраст: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод");
        } finally {
            scanner.close();
        }
    }
}
