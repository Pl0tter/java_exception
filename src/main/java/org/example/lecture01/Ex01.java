package org.example.lecture01;

import java.io.File;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println(getFileSize(new File("123")));

        System.out.println(divide(-10, 10));
//        System.out.println(divideException(10, 0));

//        int[] ints = new int[10];
//        System.out.println(ints[1000]);
        a();
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        int[] ints = new int[10];
        System.out.println(ints[1000]);
    }

    public static int divide(int a1, int a2) {
        if (a2 == 0) return -1;
        return a1 / a2;
    }

    public static int divideException(int a1, int a2) {
        if (a2 == 0) {
            throw new RuntimeException("Divide by zero not permitted");
        }
        return a1 / a2;
    }

    public static long getFileSize(File file) {
        if (!file.exists()) return -1;
        return file.length();
    }
}
