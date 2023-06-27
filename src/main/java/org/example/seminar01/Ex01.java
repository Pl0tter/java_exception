package org.example.seminar01;

public class Ex01 {
    public static void main(String[] args) {
        task02();
    }

    public static void task01() {
        int[] nums = new int[4];
        try {
            System.out.println("До генерации исключения");
            nums[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива");
        }
        System.out.println("После оператора catch");
    }

    public static void task02() {
        int[] nums = new int[4];
        System.out.println("До генерации исключения");
        nums[5] = 10;
    }

    public static void task03() {
        try {
            // Код, который может вызывать ошибку
            throw new Exception("Ошибка: файл не найден");
        } catch (Exception e) {
            String errorMessage = e.getMessage();
            System.out.println(errorMessage);
        }
    }


}
