package com.company;

public class Task2 {
    public static void main(String[] args) {
        int array[] = new int[20];

        for (int i = 0; i < 20; i++) {
            array[i] = (int) Math.round(Math.random() * 9);
            System.out.print(array[i] + " ");
        }

            System.out.println();

        for (int j = 0; j < 20; j++) {
            if(j % 2 == 0) {
                array[j] = 0;
            }
            System.out.print(array[j] + " ");
        }
}
}
