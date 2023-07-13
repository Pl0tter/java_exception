package org.example.seminar03;

public class ArrayExampleAnother {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        try {
            int element = getElementAtIndex(array, 6);
            System.out.println("Значение элемента: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс выходит за пределы массива");
        }
    }

    public static int getElementAtIndex(int[] array, int index) {
        return array[index];
    }
}