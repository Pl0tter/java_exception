package org.example.homework01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex03 {
    /**
     * Сложная задача: Чтение файла и подсчет суммы чисел.
     * Напишите программу, которая считывает содержимое текстового файла, в котором каждая строка содержит одно число.
     * Программа должна подсчитать сумму всех чисел в файле.
     * Если встретится строка, которая не может быть преобразована в число,
     * выбросите исключение NumberFormatException с сообщением "Некорректное значение числа в файле".
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        BufferedReader file = null;
        try {
            file = new BufferedReader(new FileReader("src/main/java/org/example/lecture02/int_file.txt"));
            String line = file.readLine();
            double sum = 0;
            while (line != null) {
                sum += Double.parseDouble(line);
                line = file.readLine();
            }
            System.out.println(sum);
        } catch (IOException e) {
            System.out.println("Фаил не найден или проблема ввода/вывода");
        } catch (NumberFormatException e) {
            System.out.println("Некорректное значение числа в файле");
        } finally {
            if (file != null) file.close();
        }
    }
}
