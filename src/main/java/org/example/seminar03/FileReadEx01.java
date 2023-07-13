package org.example.seminar03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx01 {
    public static void main(String[] args) {
        try {
            DataProcessorExample.processData("data.txt");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

class DataProcessorExample {
    public static void processData(String fileName) {
        try {
            String data = OurFileReader.readFile(fileName);
            if (data == null) {
                throw new Exception("Ошибка обработки данных: неверный формат");
            }
            System.out.println("Данные успешно обработаны");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения файла: файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: ошибка ввода-вывода");
        } catch (Exception e) {
            System.out.println("Ошибка обработки данных: " + e.getMessage());
        }
    }
}

class OurFileReader {
    public static String readFile(String fileName) throws FileNotFoundException, IOException {
        String data = null;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("fileName"));
            data = reader.readLine();
        } finally {
            if (reader != null) reader.close();
        }
        return data;
    }
}
