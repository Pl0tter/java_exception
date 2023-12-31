package org.example.seminar01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * В этом случае при выполнении программы, метод Files.readAllBytes(filePath) попытается прочитать
 * данные из несуществующего файла, и будет выброшено исключение IOException.
 */
class Ex06 {
    public static void processFile() throws IOException {
        Path filePath = Paths.get("path/to/nonexistent/file.txt");
        byte[] fileData = Files.readAllBytes(filePath);
        // Дополнительный код для обработки файла
    }

    public static void main(String[] args) {
        try {
            processFile();
        } catch (IOException e) {
            System.out.println("Произошло исключение ввода-вывода: " + e.getMessage());
        }
    }
}