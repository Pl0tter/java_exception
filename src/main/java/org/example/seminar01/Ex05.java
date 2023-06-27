package org.example.seminar01;

import java.io.IOException;

public class Ex05 {
    public static void processFile() throws IOException {
        // Код для обработки файла
        throw new IOException("Ошибка: невозможно обработать файл");
    }

    public static void main(String[] args) {
        try {
            processFile();
        } catch (IOException e) {
            System.out.println("Произошло исключение ввода-вывода: " + e.getMessage());
        }
    }
}
