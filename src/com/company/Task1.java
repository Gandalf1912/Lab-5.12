package com.company;

public class Task1 {

    public static void main(String[] args) {
        int array[] = new int[50];
        for (int i = 1, j = 0; i < 100; i = i + 2, j++) {
            System.out.println(array[j] = i);
        }
    }
}
