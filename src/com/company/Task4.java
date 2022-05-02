package com.company;

public class Task4 {
    public static void main(String[] args) {
        int array[] = new int[10];
        int array1[] = new int[10];
        int array2[] = new int[10];
        System.out.println("Перший массив: ");
        for (int i = 0; i < 10; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Другий массив: ");
        for (int i = 0; i < 10; i++) {
            array1[i] = (int) Math.round(Math.random() * 10);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Третій массив: ");
        for (int i = 0; i < 10; i++) {
            array2[i] = array[i] + array1[i];
            System.out.print(array2[i] + " ");
        }
    }
}
