package org.example.seminar01;

public class Ex04 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            GenException(i);
            System.out.println();
        }
    }

    public static void GenException(int w) {
        int t;
        int[] nums = new int[2];
        System.out.println("Получено: " + w);
        try {
            switch (w) {
                case 0:
                    t = 10 / w; // сгенерировать ошибку деления на 0
                    break;
                case 1:
                    nums[4] = 4; // сгенерировать ошибку обращения к массиву
                    break;
                case 2:
                    return; // возвращение из блока try
            }
        } catch (ArithmeticException e) {
            System.out.println("Попытка деления на 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за приделы массива");
        } finally {
            System.out.println("Выход из блока try");
        }
    }
}
