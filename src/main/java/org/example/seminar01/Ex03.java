package org.example.seminar01;

public class Ex03 {
    public static void main(String[] args) {
        try {
            System.out.println("До оператора throw");
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Исключение перехвачено");
        }
        System.out.println("После блока try-catch");
    }
}
