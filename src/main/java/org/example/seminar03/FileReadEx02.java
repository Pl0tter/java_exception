package org.example.seminar03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx02 {
    public static void main(String[] args) {
        try {
            DataProcessorExampleAnother.processData("data.txt");
        } catch (FileReadException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        } catch (DataProcessingException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            sendErrorReportToAdmin();
        }
    }

    public static void sendErrorReportToAdmin() {
        System.out.println("Отправка отчета об ошибке администратору");
        // Логика отправки отчёта об ошибке администратору
    }
}

class DataProcessorExampleAnother {
    public static void processData(String fileName) throws FileReadException, DataProcessingException {
        try {
            String data = OurFileReaderAnother.readFile("filename");
            // Обработка данных
            if (data == null) {
                throw new DataProcessingException("Ошибка обработки данных: неверный формат");
            }
            System.out.println("Данные успешно обработаны");
        } catch (FileReadException e) {
            throw e;
        } catch (DataProcessingException e) {
            throw e;
        }
    }
}

class OurFileReaderAnother {
    public static String readFile(String fileName) throws FileReadException {
        String data = null;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("fileName"));
            data = reader.readLine();
        } catch (FileNotFoundException e) {
            throw new FileReadException("Ошибка чтения файла: файл не найден");
        } catch (IOException e) {
            throw new FileReadException("Ошибка чтения файла: ошибка ввода-вывода");
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                throw new FileReadException("Ошибка закрытия файла: ошибка ввода-вывода");
            }
        }
        return data;
    }
}

class FileReadException extends Exception {
    public FileReadException(String message) {
        super(message);
    }
}

class DataProcessingException extends Exception {
    public DataProcessingException(String message) {
        super(message);
    }
}
