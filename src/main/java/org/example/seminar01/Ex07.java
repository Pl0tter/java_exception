package org.example.seminar01;

import java.io.IOException;

public class Ex07 {
    public static void processFile() throws IOException {
        // Некоторый код, который может вызвать исключение IOException
        throw new IOException("Ошибка ввода-вывода");
    }

    public static void main(String[] args) {
        try {
            processFile(); // Вызов метода, который выбрасывает IOException
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода: " + e.getMessage());
            // Обработка исключения
        }
    }
}