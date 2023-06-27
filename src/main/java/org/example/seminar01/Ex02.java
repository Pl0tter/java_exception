package org.example.seminar01;

public class Ex02 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 8, 16, 32, 64, 128, 256, 512};
        int[] arr2 = {2, 0, 2, 0, 4, 4};
        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.println(arr[i] + " / " + arr2[i] + " = " + arr[i] / arr2[i]);
            } catch (ArithmeticException e) {
                System.out.println("Попытка деления на ноль");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage()); // вывод ошибки
                System.out.println(e.toString()); // вывод полной ошибки
//                e.printStackTrace();
//                System.out.println(e.getCause());
                System.out.println("Соответствующий элемент не найден");
            } catch (Throwable e) {
                System.out.println("Все другие ошибки");
            }
        }
    }
}
