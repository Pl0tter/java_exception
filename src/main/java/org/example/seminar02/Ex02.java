package org.example.seminar02;

/**
 * Задача: Проверка правильности ввода пароля.
 * Напишите программу, которая запрашивает у пользователя пароль. Правила для пароля следующие:
 * <p>
 * Длина пароля должна быть не менее 8 символов.
 * Пароль должен содержать хотя бы одну заглавную букву.
 * Пароль должен содержать хотя бы одну цифру.
 * Пароль должен содержать хотя бы один специальный символ (!@#$%^&*).
 * <p>
 * Если пользователь вводит неправильный пароль,
 * программа должна выбрасывать исключение InvalidPasswordException с сообщением о причине ошибки.
 * Необходимо обработать исключение и вывести соответствующее сообщение.
 */
public class Ex02 {
    public static void main(String[] args) {
        try {
            checkPassword("**3*A***");
        } catch (InvalidPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }

    public static void checkPassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) throw new InvalidPasswordException("Длина пароля должна быть не менее 8 символов");
        if (!password.matches(".*[A-Z].*"))
            throw new InvalidPasswordException("Пароль должен содержать хотя бы одну заглавную букву");
        if (!password.matches(".*[0-9].*"))
            throw new InvalidPasswordException("Пароль должен содержать хотя бы одну цифру");
        if (!password.matches(".*[!@#$%^&*].*"))
            throw new InvalidPasswordException("Пароль должен содержать хотя бы один специальный символ");
        System.out.println("Пароль корректный");
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
