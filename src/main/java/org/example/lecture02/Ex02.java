package org.example.lecture02;

import java.util.Collections;

public class Ex02 {
    public static void main(String[] args) {
        int number = 1;
        try {
//            number = 10 / 0;

//            String test = null;
//            System.out.println(test.length());

            Collections.emptyList().add(new Object());
        } catch (ArithmeticException e) {
            System.out.println("Operation divide by zero not supported");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
//        Без обработки исключения выполнение программы было бы прервано. В нашем случае программа работает дальше.
        System.out.println(number);
    }
}
