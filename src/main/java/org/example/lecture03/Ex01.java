package org.example.lecture03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {
    /**
     * try-with-resources
     * try()
     *
     * @param args
     */
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("origin.txt");
             FileWriter writer = new FileWriter("copy.txt")) {
            while (reader.ready()) {
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
        System.out.println("Copy successfully");
    }
}
