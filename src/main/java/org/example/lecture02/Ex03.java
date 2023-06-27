package org.example.lecture02;

import java.io.FileReader;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
//        Можно объединить исключения в обном блоке
        FileReader test = null;
        try {
            test = new FileReader("test");
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            try {
                assert test != null;
                test.close();
            } catch (IOException e) {
                System.out.println("exception while lose");
            }
            System.out.println("finally finished");
        }
    }
}
