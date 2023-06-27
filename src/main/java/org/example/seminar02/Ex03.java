package org.example.seminar02;

/**
 * Задача: Регистрация пользователей
 * <p>
 * Напишите программу, которая реализует систему регистрации пользователей.
 * При регистрации пользователь должен ввести свое имя и возраст.
 * Однако, в программе должна быть обработка возможных ошибок при вводе данных.
 * <p>
 * Условия:
 * - Если пользователь не вводит имя или оно содержит только пробельные символы,
 * программа должна выбрасывать собственное исключение InvalidNameException
 * с сообщением "Некорректное имя пользователя".
 * <p>
 * - Если пользователь не вводит возраст или вводит некорректное значение возраста
 * (отрицательное число или нечисловые символы),
 * программа должна выбрасывать собственное исключение InvalidAgeException
 * с сообщением "Некорректный возраст пользователя".
 * <p>
 * - Если пользователь успешно ввел имя и возраст, программа должна выводить сообщение "Регистрация успешна!".
 */
public class Ex03 {
    public static void main(String[] args) {
        try {
            check("Name", "30");
            System.out.println("Регистрация успешна!");
        } catch (InvalidNameException | InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void check(String name, String age) throws InvalidNameException, InvalidAgeException {
        if (name.trim().isEmpty()) throw new InvalidNameException("Некорректное имя пользователя");
        if (!age.matches("^\\d+$") || Integer.parseInt(age) < 0)
            throw new InvalidNameException("Некорректный возраст пользователя");
    }
}

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
